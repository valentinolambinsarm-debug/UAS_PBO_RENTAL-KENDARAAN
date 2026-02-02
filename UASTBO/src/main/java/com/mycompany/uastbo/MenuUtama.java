
package com.mycompany.uastbo;
import java.awt.CardLayout;
import java.util.ArrayList;
import com.mycompany.uastbo.SubMobil;
import com.mycompany.uastbo.SubMotor;
import javax.swing.table.DefaultTableModel;
public class MenuUtama extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuUtama.class.getName());

    //Creates new form MenuUtama
    public MenuUtama() {
        initComponents();
        
    pnlKontenUtama.add(pnlPelanggan, "dashboard");
    pnlKontenUtama.add(pnlDashboard, "pelanggan");
    pnlKontenUtama.add(pnlKendaraan, "kendaraan");
    pnlKontenUtama.add(pnlExit, "exit");
    pnlKontenUtama.add(pnlRiwayat, "riwayat");
    
    // Inisialisasi Unit Kendaraan dropdown saat aplikasi start
    // memastikan untuk file vehicles ada dan berisi default jika masih kosong
    UtilitiesVehicle.initializeDefaultsIfEmpty();
    updateComboUnit();
    }
    
    

    //JANGAN DIUBAH, FITUR GUII !!!!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnPelanggan = new javax.swing.JButton();
        btnKendaraan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRiwayat = new javax.swing.JButton();
        pnlKontenUtama = new javax.swing.JPanel();
        pnlPelanggan = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPelanggan = new javax.swing.JTable();
        btnSimpanPelanggan = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbUnit = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtLamaSewa = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalBayar = new javax.swing.JTextField();
        pnlKendaraan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMobil = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMotor = new javax.swing.JTable();
        pnlRiwayat = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRiwayat = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCariRiwayat = new javax.swing.JTextField();
        btnCariRiwayat = new javax.swing.JButton();
        btnCetakLaporan = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalTransaksi = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalMobil = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblTotalMotor = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblTanggalHariIni = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnDashboard.setText("Kelola pelanggan");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnPelanggan.setText("Dashboard");
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });

        btnKendaraan.setText("Kendaraan");
        btnKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKendaraanActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRiwayat.setText("Riwayat & laporan");
        btnRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPelanggan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRiwayat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKendaraan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnPelanggan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKendaraan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRiwayat)
                .addGap(35, 35, 35)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKontenUtama.setLayout(new java.awt.CardLayout());

        pnlPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        pnlPelanggan.setName("dashboard"); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Nama Pelanggan : ");

        txtNama.setText("Nama");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("NIK/No KTP          : ");

        txtNik.setText("NIK");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("No Telp                 : ");

        txtNoTelp.setText("No Telp");
        txtNoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        tblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "NIK/No KTP", "No Telp", "Unit Kendaraan", "Tgl Mulai", "Tgl Selesai", "Total Bayar"
            }
        ));
        jScrollPane1.setViewportView(tblPelanggan);

        btnSimpanPelanggan.setText("Simpan");
        btnSimpanPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPelangganActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Jenis Kendaraan   :");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobil", "Motor" }));
        cbJenis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJenisItemStateChanged(evt);
            }
        });
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Unit Kendaraan    :");

        cbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Harga Kendaraan :");

        txtHarga.setText("Harga");
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Lama Sewa          :");

        txtLamaSewa.setText("0");
        txtLamaSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLamaSewaActionPerformed(evt);
            }
        });
        txtLamaSewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLamaSewaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Totaal Bayar      :");

        txtTotalBayar.setText("0");
        txtTotalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalBayarActionPerformed(evt);
            }
        });
        txtTotalBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalBayarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPelangganLayout = new javax.swing.GroupLayout(pnlPelanggan);
        pnlPelanggan.setLayout(pnlPelangganLayout);
        pnlPelangganLayout.setHorizontalGroup(
            pnlPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPelangganLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpanPelanggan)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPelangganLayout.setVerticalGroup(
            pnlPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPelangganLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(btnSimpanPelanggan)
                .addGap(63, 63, 63))
            .addGroup(pnlPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlKontenUtama.add(pnlPelanggan, "card2");

        pnlKendaraan.setBackground(new java.awt.Color(255, 255, 255));
        pnlKendaraan.setName("pelanggan"); // NOI18N

        tblMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Merk", "No Plat", "Harga Sewa", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblMobil);

        tblMotor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Merk", "No Plat", "Harga Sewa", "Status"
            }
        ));
        jScrollPane3.setViewportView(tblMotor);

        javax.swing.GroupLayout pnlKendaraanLayout = new javax.swing.GroupLayout(pnlKendaraan);
        pnlKendaraan.setLayout(pnlKendaraanLayout);
        pnlKendaraanLayout.setHorizontalGroup(
            pnlKendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKendaraanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKendaraanLayout.setVerticalGroup(
            pnlKendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKendaraanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pnlKontenUtama.add(pnlKendaraan, "card5");

        pnlRiwayat.setBackground(new java.awt.Color(255, 255, 255));
        pnlRiwayat.setName("transaksi"); // NOI18N

        tblRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "NIK/No KTP", "No Telp", "Unit Kendaraan", "Tgl Mulai", "Tgl Selesai", "Total Bayar"
            }
        ));
        jScrollPane4.setViewportView(tblRiwayat);

        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Nama Pelanggan : ");

        txtCariRiwayat.setText("Nama");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCariRiwayat, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCariRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        btnCariRiwayat.setText("Cari Riwayat");
        btnCariRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariRiwayatActionPerformed(evt);
            }
        });

        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakLaporanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRiwayatLayout = new javax.swing.GroupLayout(pnlRiwayat);
        pnlRiwayat.setLayout(pnlRiwayatLayout);
        pnlRiwayatLayout.setHorizontalGroup(
            pnlRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRiwayatLayout.createSequentialGroup()
                .addGroup(pnlRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRiwayatLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlRiwayatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCariRiwayat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCetakLaporan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRiwayatLayout.setVerticalGroup(
            pnlRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRiwayatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(pnlRiwayatLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariRiwayat)
                    .addComponent(btnCetakLaporan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKontenUtama.add(pnlRiwayat, "card2");

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));
        pnlExit.setName("kendaraan"); // NOI18N

        jButton1.setText("YA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TIDAK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Anda yakin ingin keluar ?");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(62, 62, 62))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExitLayout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExitLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );

        pnlKontenUtama.add(pnlExit, "card6");

        pnlDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnlDashboard.setName("riwayat"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Jumlah Testimoni & pemesan : ");

        lblTotalTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalTransaksi.setForeground(new java.awt.Color(0, 0, 204));
        lblTotalTransaksi.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotalTransaksi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah Kendaraan roda 4        : ");

        lblTotalMobil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalMobil.setForeground(new java.awt.Color(0, 0, 204));
        lblTotalMobil.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTotalMobil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Jumlah Kendaraan roda 2        : ");

        lblTotalMotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalMotor.setForeground(new java.awt.Color(0, 0, 204));
        lblTotalMotor.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTotalMotor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));

        lblTanggalHariIni.setBackground(new java.awt.Color(0, 255, 255));
        lblTanggalHariIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTanggalHariIni.setForeground(new java.awt.Color(51, 51, 51));
        lblTanggalHariIni.setText("Kelompok 3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTanggalHariIni, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTanggalHariIni))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axioo\\Pictures\\Screenshots\\Screenshot 2026-02-01 105648.png")); // NOI18N

        javax.swing.GroupLayout pnlDashboardLayout = new javax.swing.GroupLayout(pnlDashboard);
        pnlDashboard.setLayout(pnlDashboardLayout);
        pnlDashboardLayout.setHorizontalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(447, 447, 447))
                    .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlDashboardLayout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDashboardLayout.setVerticalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        pnlKontenUtama.add(pnlDashboard, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlKontenUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlKontenUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        CardLayout cl = (CardLayout) pnlKontenUtama.getLayout();
        cl.show(pnlKontenUtama, "dashboard");
        
        // Transaksi (testimoni & pemesan)
        ArrayList<RelTransaksi> data = UtilitiesFile.baca();
        lblTotalTransaksi.setText(String.valueOf(data.size()));

        // Hitung jumlah kendaraan berdasarkan file vehicles.txt
        java.util.ArrayList<UtilitiesVehicle.VehicleRecord> veh = UtilitiesVehicle.baca();

        int totalMobil = 0;
        int mobilDisewa = 0;
        int mobilTersedia = 0;

        int totalMotor = 0;
        int motorDisewa = 0;
        int motorTersedia = 0;

        for (UtilitiesVehicle.VehicleRecord v : veh) {
            if (v.jenis != null && v.jenis.equalsIgnoreCase("Mobil")) {
                totalMobil++;
                if (v.status == InterfaceStatusKendaraan.DISEWA) mobilDisewa++;
                else if (v.status == InterfaceStatusKendaraan.TERSEDIA) mobilTersedia++;
            } else if (v.jenis != null && v.jenis.equalsIgnoreCase("Motor")) {
                totalMotor++;
                if (v.status == InterfaceStatusKendaraan.DISEWA) motorDisewa++;
                else if (v.status == InterfaceStatusKendaraan.TERSEDIA) motorTersedia++;
            }
        }

        // Tampilkan: total (disewakan, tersedia)
        lblTotalMobil.setText(String.valueOf(totalMobil) + " (disewakan=" + mobilDisewa + ", tersedia=" + mobilTersedia + ")");
        lblTotalMotor.setText(String.valueOf(totalMotor) + " (disewakan=" + motorDisewa + ", tersedia=" + motorTersedia + ")");
        lblTotalMobil.setToolTipText("disewakan = jumlah kendaraan disewakan; tersedia = jumlah kendaraan yang siap disewakan");
        lblTotalMotor.setToolTipText("disewakan = jumlah kendaraan disewakan; tersedia = jumlah kendaraan yang siap disewakan");
    
    // 6. Update Tanggal
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd/MM/yyyy");
    lblTanggalHariIni.setText(format.format(new java.util.Date()));
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnKendaraanActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) pnlKontenUtama.getLayout();
        cl.show(pnlKontenUtama, "kendaraan");
        
        // Pindah ke panel kendaraan
    
    // Refresh data tabel
    loadTableKendaraan();
    // Buka dialog kelola kendaraan
    VehicleManagerDialog dlg = new VehicleManagerDialog(this);
    dlg.setVisible(true);}

    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) pnlKontenUtama.getLayout();
        cl.show(pnlKontenUtama, "pelanggan");
        
        loadTablePelanggan();
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) pnlKontenUtama.getLayout();
        cl.show(pnlKontenUtama, "exit");
    }

    private void btnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) pnlKontenUtama.getLayout();
        cl.show(pnlKontenUtama, "riwayat");
    }

    private void txtNoTelpActionPerformed(java.awt.event.ActionEvent evt) {
        //buat no telp
    }

    private void btnSimpanPelangganActionPerformed(java.awt.event.ActionEvent evt) {
                                                  
    try {
        // 1. Ambil input Pelanggan
        String nama = txtNama.getText();
        String nik = txtNik.getText();
        String telp = txtNoTelp.getText();

        // 2. Validasi input awal
        if (nama.isEmpty() || nik.isEmpty() || txtLamaSewa.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Data Pelanggan dan Lama Sewa wajib diisi!");
            return;
        }

        // 3. Ambil data Kendaraan dari ComboBox
        if (cbUnit.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih unit kendaraan terlebih dahulu!");
            return;
        }
        
        String jenis = cbJenis.getSelectedItem().toString(); // Mobil/Motor
        String unitInfo = cbUnit.getSelectedItem().toString(); // Contoh: "Avanza - B 111 AA - 300000"
        String[] part = unitInfo.split(" - ");
        
        // Handle format yang beda
        String merk, plat;
        double harga;
        
        if (part.length >= 3) {
            // Format baru: Merk - Plat - Harga
            merk = part[0];
            plat = part[1];
            harga = Double.parseDouble(part[2]);
        } else if (part.length == 2) {
            // Format lama: merk -harga 
            merk = part[0];
            plat = ""; // plat kosong untuk format lama
            harga = Double.parseDouble(part[1]);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Format unit kendaraan tidak sesuai!");
            return;
        }
        
        int lama = Integer.parseInt(txtLamaSewa.getText()); // Durasi hari

        // tanggal otomatis
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        
        String tglM = sdf.format(cal.getTime()); // Tanggal hari ini sebagai Tgl Mulai
        cal.add(java.util.Calendar.DATE, lama);  // Menambahkan tanggal sebanyak 'lama'
        String tglS = sdf.format(cal.getTime()); // hasilnya jadi Tgl Selesai

        // 5. Buat objek kendaraan berdasarkan jenis
        ParentKendaraan k;
        if (jenis.equals("Mobil")) {
            k = new SubMobil(plat, merk, harga, harga * 0.1); 
        } else {
            k = new SubMotor(plat, merk, harga, harga * 0.1);
        }

        // 6. Buat objek Transaksi 
        DomPelanggan baru = new DomPelanggan(nama, nik, telp);
        RelTransaksi trxBaru = new RelTransaksi(baru, k, tglM, tglS, lama, 0);

        // 7. PROSES SIMPAN ke File
        ArrayList<RelTransaksi> list = UtilitiesFile.baca();
        list.add(trxBaru);
        UtilitiesFile.simpan(list);

        // 8. Feedback & Reset UI
        javax.swing.JOptionPane.showMessageDialog(this, "Transaksi Berhasil Disimpan!\n"
                + "Unit: " + merk + "\n"
                + "Kembali pada: " + tglS);
        
        // Bersihkan Field
        txtNama.setText("");
        txtNik.setText("");
        txtNoTelp.setText("");
        txtLamaSewa.setText("");
        if (txtTotalBayar != null) txtTotalBayar.setText(""); // Jika ada field total
        
        // Update Tabel dan Combo Unit
        loadTablePelanggan();
        updateComboUnit();

            } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Lama sewa harus berupa angka!");
            } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }

    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void cbUnitActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            updateHarga();
        } catch (Exception e) {
            txtHarga.setText("0");
        }
    }

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void cbJenisItemStateChanged(java.awt.event.ItemEvent evt) {
        try {
            cbUnit.removeAllItems(); 
            String jenis = cbJenis.getSelectedItem().toString();
        
            if (jenis.equals("Mobil")) {
                cbUnit.addItem("Avanza - B 111 AA - 300000");
                cbUnit.addItem("Innova - B 222 BB - 500000");
                cbUnit.addItem("Brio - B 333 CC - 250000");
                cbUnit.addItem("Bugatti - D 3944 ES - 2500000");
                cbUnit.addItem("Rolls Royce - BH 7376 YK - 2700000");
            } else {
                cbUnit.addItem("Vario - D 444 DD - 100000");
                cbUnit.addItem("NMAX - D 555 EE - 150000");
                cbUnit.addItem("Beat - D 666 FF - 80000");
                cbUnit.addItem("Kawasaki Ninja - D 8888 AA - 200000");
                cbUnit.addItem("Ducati - D 9999 BB - 250000");
            }
        } catch (Exception e) {
            System.err.println("Error di cbJenisItemStateChanged: " + e.getMessage());
        }
    }

    private void txtLamaSewaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtLamaSewaKeyReleased(java.awt.event.KeyEvent evt) {
        try {
        // ambil input lama sewa
        String inputLama = txtLamaSewa.getText();
        
        // Jika kosong, set harga ke 0 atau harga dasar
        if (inputLama.isEmpty()) {
            txtTotalBayar.setText("0"); 
            return;
        }

        //ubah ke angka
        int lama = Integer.parseInt(inputLama);

        // ambil harga sewa per hari dari txtHarga, diisi otomatis dari unti
        double hargaPerHari = Double.parseDouble(txtHarga.getText());

        //Hitung Total (Lama Sewa x Harga Per Hari)
        double total = lama * hargaPerHari;

        //Tampilkan ke UI 
        txtTotalBayar.setText(String.valueOf(total));

            } catch (NumberFormatException e) {
        // Jika user typo memasukkan huruf, beri peringatan atau reset
        txtTotalBayar.setText("Input Angka!");
        }
    }

    private void txtTotalBayarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtTotalBayarKeyReleased(java.awt.event.KeyEvent evt) {
    }

    private void btnCariRiwayatActionPerformed(java.awt.event.ActionEvent evt) {
        String cari = txtCariRiwayat.getText();
        loadTableRiwayat(cari);
    }

    private void btnCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {
        try {
        java.io.File file = new java.io.File("Laporan_Riwayat.txt");
        java.io.PrintWriter writer = new java.io.PrintWriter(file);
        
        writer.println("======= LAPORAN RIWAYAT PENYEWAAN =======");
        writer.println(String.format("%-15s | %-12s | %-10s", "Nama", "Unit", "Total"));
        writer.println("-----------------------------------------");

        for (int i = 0; i < tblRiwayat.getRowCount(); i++) {
            writer.println(String.format("%-15s | %-12s | %-10s", 
                tblRiwayat.getValueAt(i, 1).toString(), // Kolom Nama
                tblRiwayat.getValueAt(i, 4).toString(), // Kolom Unit
                tblRiwayat.getValueAt(i, 7).toString()  // Kolom Total
            ));
        }
        
        writer.close();
        javax.swing.JOptionPane.showMessageDialog(this, "Laporan berhasil disimpan!");
        java.awt.Desktop.getDesktop().open(file); // Langsung buka file txt-nya
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) pnlKontenUtama.getLayout();
        cl.show(pnlKontenUtama, "dashboard");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        java.awt.EventQueue.invokeLater(() -> new MenuUtama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariRiwayat;
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKendaraan;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JButton btnSimpanPelanggan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTanggalHariIni;
    private javax.swing.JLabel lblTotalMobil;
    private javax.swing.JLabel lblTotalMotor;
    private javax.swing.JLabel lblTotalTransaksi;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlKendaraan;
    private javax.swing.JPanel pnlKontenUtama;
    private javax.swing.JPanel pnlPelanggan;
    private javax.swing.JPanel pnlRiwayat;
    private javax.swing.JTable tblMobil;
    private javax.swing.JTable tblMotor;
    private javax.swing.JTable tblPelanggan;
    private javax.swing.JTable tblRiwayat;
    private javax.swing.JTextField txtCariRiwayat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtLamaSewa;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables

    private void loadTablePelanggan() {
        DefaultTableModel model = (DefaultTableModel) tblPelanggan.getModel();
    model.setRowCount(0);

    ArrayList<RelTransaksi> list = UtilitiesFile.baca();

    int no = 1;
    for (RelTransaksi trx : list) {
        // urutnnya harus sama dengan tabel
        Object[] row = {
            no++,                            // Kolom 1: No
            trx.getP().getNama(),            // Kolom 2: Nama
            trx.getP().getNik(),             // Kolom 3: NIK/No KTP (Tambahkan ini)
            trx.getP().getNoTelp(),          // Kolom 4: No Telp
            trx.getK().getMerk(),            // Kolom 5: Unit Kendaraan
            trx.getTglMulai(),               // Kolom 6: Tgl Mulai
            trx.getTglSelesai(),             // Kolom 7: Tgl Selesai
            "Rp " + trx.totalBayar()         // Kolom 8: Total Bayar
        };
        model.addRow(row);
    }
    }
    
    private void updateComboUnit() {
        try {
            cbUnit.removeAllItems();
            String jenis = cbJenis.getSelectedItem() == null ? "Mobil" : cbJenis.getSelectedItem().toString();

            // Ambil data kendaraan dari inventory file
            ArrayList<UtilitiesVehicle.VehicleRecord> listVeh = UtilitiesVehicle.baca();
            for (UtilitiesVehicle.VehicleRecord v : listVeh) {
                if (v.jenis.equalsIgnoreCase(jenis) && v.status == InterfaceStatusKendaraan.TERSEDIA) {
                    cbUnit.addItem(v.merk + " - " + v.plat + " - " + String.valueOf((long) v.harga));
                }
            }

            if (cbUnit.getItemCount() == 0) {
                cbUnit.addItem("- tidak ada unit tersedia -");
            }

            updateHarga();
        } catch (Exception e) {
            System.err.println("Error di updateComboUnit: " + e.getMessage());
        }

    }

    // Tambahkan/kelola kendaraan programatik
    public void addVehicle(String jenis, String merk, String plat, double harga) {
        UtilitiesVehicle.VehicleRecord v = new UtilitiesVehicle.VehicleRecord(plat, merk, jenis, harga, InterfaceStatusKendaraan.TERSEDIA);
        UtilitiesVehicle.add(v);
        updateComboUnit();
    }

    public boolean removeVehicle(String plat) {
        boolean ok = UtilitiesVehicle.removeByPlat(plat);
        updateComboUnit();
        return ok;
    }

    public boolean setVehicleStatus(String plat, InterfaceStatusKendaraan status) {
        boolean ok = UtilitiesVehicle.updateStatus(plat, status);
        updateComboUnit();
        return ok;
    }
    // Helper untuk cek apakah plat nomor ada di file txt

    
    private void updateHarga() {
        try {
            if (cbUnit.getSelectedItem() == null) {
                txtHarga.setText("0");
                return;
            }

            String unitTerpilih = cbUnit.getSelectedItem().toString();
            
            // Parsing format baru: "Merk - Plat - Harga"
            String[] part = unitTerpilih.split(" - ");
            if (part.length >= 3) {
                txtHarga.setText(part[2]);
            } else {
                if (unitTerpilih.contains("Avanza")) txtHarga.setText("300000");
                else if (unitTerpilih.contains("Innova")) txtHarga.setText("500000");
                else if (unitTerpilih.contains("Vario")) txtHarga.setText("100000");
                else if (unitTerpilih.contains("NMAX")) txtHarga.setText("150000");
                else txtHarga.setText("0");
            }
        } catch (Exception e) {
            txtHarga.setText("0");
        }
    }
    
    private void loadTableKendaraan() {
    DefaultTableModel modelMobil = (DefaultTableModel) tblMobil.getModel();
    DefaultTableModel modelMotor = (DefaultTableModel) tblMotor.getModel();
    
    modelMobil.setRowCount(0);
    modelMotor.setRowCount(0);
    ArrayList<RelTransaksi> listSewa = UtilitiesFile.baca();

    ArrayList<UtilitiesVehicle.VehicleRecord> vehicles = UtilitiesVehicle.baca();

    int idxMobil = 1;
    int idxMotor = 1;
    for (UtilitiesVehicle.VehicleRecord v : vehicles) {
        String statusDisplay;
        // kalo transaksi berarti dsiewakan
        if (isSedangDisewa(v.plat, listSewa)) statusDisplay = "Disewa";
        else statusDisplay = (v.status != null) ? v.status.name().substring(0,1).toUpperCase() + v.status.name().substring(1).toLowerCase() : "Tersedia";

        if (v.jenis.equalsIgnoreCase("Mobil")) {
            modelMobil.addRow(new Object[]{ idxMobil++, v.merk, v.plat, "Rp " + (long) v.harga, statusDisplay });
        } else {
            modelMotor.addRow(new Object[]{ idxMotor++, v.merk, v.plat, "Rp " + (long) v.harga, statusDisplay });
        }
    }
    // Update dashboard counts (total, tersedia, disewa)
    updateVehicleCounts();
}

// Fungsi bantu untuk cek status
    private boolean isSedangDisewa(String plat, ArrayList<RelTransaksi> list) {
    if (list == null || list.isEmpty()) return false;
    
    for (RelTransaksi trx : list) {
        if (trx.getK() != null && trx.getK().getNoPlat() != null) {
            if (trx.getK().getNoPlat().trim().equalsIgnoreCase(plat.trim())) {
                return true;
            }
        }
    }
    return false;
}

private void loadTableRiwayat(String kataKunci) {
    DefaultTableModel model = (DefaultTableModel) tblRiwayat.getModel();
    model.setRowCount(0);

    ArrayList<RelTransaksi> list = UtilitiesFile.baca();
    int no = 1;

    for (RelTransaksi trx : list) {
        if (trx.getP().getNama().toLowerCase().contains(kataKunci.toLowerCase())) {
            Object[] row = {
                no++, 
                trx.getP().getNama(), 
                trx.getP().getNik(), 
                trx.getP().getNoTelp(), 
                trx.getK().getMerk(), 
                trx.getTglMulai(), 
                trx.getTglSelesai(), 
                "Rp " + trx.totalBayar()
            };
            model.addRow(row);
        }
    }
}
    
// Update jumlah di dashboard: total vehicles, tersedia, disewa
    private void updateVehicleCounts() {
        ArrayList<UtilitiesVehicle.VehicleRecord> vehicles = UtilitiesVehicle.baca();
        ArrayList<RelTransaksi> listSewa = UtilitiesFile.baca();
        int total = vehicles.size();
        int tersedia = 0;
        int disewa = 0;
        for (UtilitiesVehicle.VehicleRecord v : vehicles) {
            if (isSedangDisewa(v.plat, listSewa)) {
                disewa++;
            } else {
                if (v.status == InterfaceStatusKendaraan.TERSEDIA) tersedia++;
                else if (v.status == InterfaceStatusKendaraan.DISEWA) disewa++;
                else tersedia++;
            }
        }

        lblTotalTransaksi.setText(String.valueOf(total));
        lblTotalMobil.setText(String.valueOf(tersedia));
        lblTotalMotor.setText(String.valueOf(disewa));
    }

}
