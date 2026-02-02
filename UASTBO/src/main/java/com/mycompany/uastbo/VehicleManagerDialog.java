package com.mycompany.uastbo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class VehicleManagerDialog extends JDialog {
    private DefaultTableModel model;
    private JTable table;

    public VehicleManagerDialog(Frame owner) {
        super(owner, "Kelola Kendaraan", true);
        initUI();
        setSize(600, 400);
        setLocationRelativeTo(owner);
        loadData();
    }

    private void initUI() {
        model = new DefaultTableModel(new Object[]{"Merk", "Plat", "Jenis", "Harga", "Status"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        JButton btnAdd = new JButton("Tambah");
        JButton btnEdit = new JButton("Edit");
        JButton btnRemove = new JButton("Hapus");
        JButton btnToggle = new JButton("Toggle Status");
        JButton btnRefresh = new JButton("Refresh");
        JButton btnClose = new JButton("Tutup");

        btnAdd.addActionListener(e -> onAdd());
        btnEdit.addActionListener(e -> onEdit());
        btnRemove.addActionListener(e -> onRemove());
        btnToggle.addActionListener(e -> onToggle());
        btnRefresh.addActionListener(e -> loadData());
        btnClose.addActionListener(e -> dispose());

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPanel.add(btnAdd);
        btnPanel.add(btnEdit);
        btnPanel.add(btnRemove);
        btnPanel.add(btnToggle);
        btnPanel.add(btnRefresh);
        btnPanel.add(btnClose);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(sp, BorderLayout.CENTER);
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }

    private void loadData() {
        model.setRowCount(0);
        ArrayList<UtilitiesVehicle.VehicleRecord> list = UtilitiesVehicle.baca();
        for (UtilitiesVehicle.VehicleRecord v : list) {
            model.addRow(new Object[]{v.merk, v.plat, v.jenis, v.harga, v.status});
        }
    }

    private void onAdd() {
        String jenis = (String) JOptionPane.showInputDialog(this, "Pilih jenis:", "Jenis", JOptionPane.PLAIN_MESSAGE, null, new String[]{"Mobil", "Motor"}, "Mobil");
        if (jenis == null) return;
        String merk = JOptionPane.showInputDialog(this, "Merk:");
        if (merk == null || merk.trim().isEmpty()) return;
        String plat = JOptionPane.showInputDialog(this, "Plat:");
        if (plat == null || plat.trim().isEmpty()) return;
        String hargaStr = JOptionPane.showInputDialog(this, "Harga per hari:");
        if (hargaStr == null || hargaStr.trim().isEmpty()) return;
        double harga;
        try { harga = Double.parseDouble(hargaStr); } catch (Exception ex) { JOptionPane.showMessageDialog(this, "Harga tidak valid"); return; }

        UtilitiesVehicle.VehicleRecord v = new UtilitiesVehicle.VehicleRecord(plat, merk, jenis, harga, InterfaceStatusKendaraan.TERSEDIA);
        UtilitiesVehicle.add(v);
        loadData();
        JOptionPane.showMessageDialog(this, "Kendaraan ditambahkan");
    }

    private void onRemove() {
        int r = table.getSelectedRow();
        if (r < 0) { JOptionPane.showMessageDialog(this, "Pilih kendaraan untuk dihapus"); return; }
        String plat = (String) model.getValueAt(r, 1);
        int confirm = JOptionPane.showConfirmDialog(this, "Hapus kendaraan plat " + plat + " ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        boolean ok = UtilitiesVehicle.removeByPlat(plat);
        if (ok) { loadData(); JOptionPane.showMessageDialog(this, "Dihapus"); }
        else JOptionPane.showMessageDialog(this, "Gagal menghapus");
    }

    private void onToggle() {
        int r = table.getSelectedRow();
        if (r < 0) { JOptionPane.showMessageDialog(this, "Pilih kendaraan untuk ubah status"); return; }
        String plat = (String) model.getValueAt(r, 1);
        String statusStr = model.getValueAt(r, 4).toString();
        InterfaceStatusKendaraan current = InterfaceStatusKendaraan.valueOf(statusStr);
        InterfaceStatusKendaraan next = (current == InterfaceStatusKendaraan.TERSEDIA) ? InterfaceStatusKendaraan.DISEWA : InterfaceStatusKendaraan.TERSEDIA;
        boolean ok = UtilitiesVehicle.updateStatus(plat, next);
        if (ok) { loadData(); JOptionPane.showMessageDialog(this, "Status diperbarui: " + next); }
        else JOptionPane.showMessageDialog(this, "Gagal memperbarui status");
    }

    private void onEdit() {
        int r = table.getSelectedRow();
        if (r < 0) { JOptionPane.showMessageDialog(this, "Pilih kendaraan untuk diedit"); return; }
        String merkOld = (String) model.getValueAt(r, 0);
        String platOld = (String) model.getValueAt(r, 1);
        String jenisOld = (String) model.getValueAt(r, 2);
        String hargaOld = String.valueOf(model.getValueAt(r, 3));
        String statusStr = model.getValueAt(r, 4).toString();

        String jenis = (String) JOptionPane.showInputDialog(this, "Pilih jenis:", "Jenis", JOptionPane.PLAIN_MESSAGE, null, new String[]{"Mobil", "Motor"}, jenisOld);
        if (jenis == null) return;
        String merk = JOptionPane.showInputDialog(this, "Merk:", merkOld);
        if (merk == null || merk.trim().isEmpty()) return;
        String plat = JOptionPane.showInputDialog(this, "Plat:", platOld);
        if (plat == null || plat.trim().isEmpty()) return;
        String hargaStr = JOptionPane.showInputDialog(this, "Harga per hari:", hargaOld);
        if (hargaStr == null || hargaStr.trim().isEmpty()) return;
        double harga;
        try { harga = Double.parseDouble(hargaStr); } catch (Exception ex) { JOptionPane.showMessageDialog(this, "Harga tidak valid"); return; }

        InterfaceStatusKendaraan status = InterfaceStatusKendaraan.valueOf(statusStr);
        UtilitiesVehicle.VehicleRecord v = new UtilitiesVehicle.VehicleRecord(plat, merk, jenis, harga, status);
        boolean ok = UtilitiesVehicle.updateVehicle(v);
        if (ok) { loadData(); JOptionPane.showMessageDialog(this, "Data kendaraan diperbarui"); }
        else JOptionPane.showMessageDialog(this, "Gagal memperbarui kendaraan (plat mungkin tidak ditemukan)");
    }
}
