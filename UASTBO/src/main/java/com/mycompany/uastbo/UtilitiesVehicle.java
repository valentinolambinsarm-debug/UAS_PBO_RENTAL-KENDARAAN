package com.mycompany.uastbo;

import java.io.*;
import java.util.ArrayList;

public class UtilitiesVehicle {
    private static final String PATH = "vehicles.txt";

    public static class VehicleRecord {
        public String plat;
        public String merk;
        public String jenis; // "Mobil" or "Motor"
        public double harga;
        public InterfaceStatusKendaraan status;

        public VehicleRecord(String plat, String merk, String jenis, double harga, InterfaceStatusKendaraan status) {
            this.plat = plat;
            this.merk = merk;
            this.jenis = jenis;
            this.harga = harga;
            this.status = status;
        }

        public String toCSV() {
            return merk + "," + plat + "," + jenis + "," + harga + "," + status;
        }

        public static VehicleRecord fromCSV(String line) {
            String[] p = line.split(",");
            if (p.length < 5) return null;
            try {
                String merk = p[0];
                String plat = p[1];
                String jenis = p[2];
                double harga = Double.parseDouble(p[3]);
                InterfaceStatusKendaraan st = InterfaceStatusKendaraan.valueOf(p[4]);
                return new VehicleRecord(plat, merk, jenis, harga, st);
            } catch (Exception e) {
                return null;
            }
        }
    }

    public static ArrayList<VehicleRecord> baca() {
        ArrayList<VehicleRecord> list = new ArrayList<>();
        File f = new File(PATH);
        if (!f.exists()) return list;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                VehicleRecord v = VehicleRecord.fromCSV(line);
                if (v != null) list.add(v);
            }
        } catch (IOException e) {
            System.err.println("Gagal baca vehicles: " + e.getMessage());
        }
        return list;
    }

    public static void simpan(ArrayList<VehicleRecord> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(PATH, false))) {
            for (VehicleRecord v : list) {
                pw.println(v.toCSV());
            }
        } catch (IOException e) {
            System.err.println("Gagal tulis vehicles: " + e.getMessage());
        }
    }

    public static void add(VehicleRecord v) {
        ArrayList<VehicleRecord> list = baca();
        list.add(v);
        simpan(list);
    }

    public static boolean removeByPlat(String plat) {
        ArrayList<VehicleRecord> list = baca();
        boolean removed = list.removeIf(v -> v.plat.equalsIgnoreCase(plat));
        if (removed) simpan(list);
        return removed;
    }

    public static boolean updateStatus(String plat, InterfaceStatusKendaraan status) {
        ArrayList<VehicleRecord> list = baca();
        boolean found = false;
        for (VehicleRecord v : list) {
            if (v.plat.equalsIgnoreCase(plat)) {
                v.status = status;
                found = true;
                break;
            }
        }
        if (found) simpan(list);
        return found;
    }

    public static boolean updateVehicle(VehicleRecord newV) {
        ArrayList<VehicleRecord> list = baca();
        boolean found = false;
        for (VehicleRecord v : list) {
            if (v.plat.equalsIgnoreCase(newV.plat)) {
                v.merk = newV.merk;
                v.jenis = newV.jenis;
                v.harga = newV.harga;
                v.status = newV.status;
                found = true;
                break;
            }
        }
        if (found) simpan(list);
        return found;
    }

    public static void initializeDefaultsIfEmpty() {
        ArrayList<VehicleRecord> list = baca();
        if (!list.isEmpty()) return;
        list.add(new VehicleRecord("B 111 AA", "Avanza", "Mobil", 300000.0, InterfaceStatusKendaraan.TERSEDIA));
        list.add(new VehicleRecord("B 222 BB", "Innova", "Mobil", 500000.0, InterfaceStatusKendaraan.TERSEDIA));
        list.add(new VehicleRecord("B 333 CC", "Brio", "Mobil", 250000.0, InterfaceStatusKendaraan.TERSEDIA));
        list.add(new VehicleRecord("D 111 CC", "Vario", "Motor", 100000.0, InterfaceStatusKendaraan.TERSEDIA));
        list.add(new VehicleRecord("D 222 DD", "NMAX", "Motor", 150000.0, InterfaceStatusKendaraan.TERSEDIA));
        simpan(list);
    }
}
