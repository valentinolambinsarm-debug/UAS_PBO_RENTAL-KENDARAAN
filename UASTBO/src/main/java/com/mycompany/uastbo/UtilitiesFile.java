package com.mycompany.uastbo;

import java.io.*;
import java.util.ArrayList;

public class UtilitiesFile {
    private static final String PATH = "database_sewa.txt";

    // Simpan data ke file
    public static void simpan(ArrayList<RelTransaksi> list) {
        // Menggunakan FileWriter(PATH, false) untuk menimpa file lama dengan data list terbaru
        try (PrintWriter pw = new PrintWriter(new FileWriter(PATH, false))) {
            for (RelTransaksi t : list) {
                pw.println(t.toCSV());
            }
        } catch (IOException e) { 
            System.err.println("Gagal tulis file: " + e.getMessage()); 
        }
    }

    // Baca data dari file
    public static ArrayList<RelTransaksi> baca() {
        ArrayList<RelTransaksi> list = new ArrayList<>();
        File file = new File(PATH);
        
        // Cek apakah file ada, jika tidak langsung return list kosong
        if (!file.exists()) {
            return list;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String baris;
            while ((baris = br.readLine()) != null) {
                // Lewati baris kosong
                if (baris.trim().isEmpty()) continue;

                String[] d = baris.split(",");
                
                // Pastikan d.length minimal 11 sesuai urutan di toCSV() RelTransaksi
                if (d.length >= 11) {
                    try {
                        // 1. Data Pelanggan
                        DomPelanggan p = new DomPelanggan(d[0], d[1], d[2]);

                        // 2. Data Kendaraan (Jenis, Plat, Merk, Harga)
                        ParentKendaraan k;
                        double hargaSewa = Double.parseDouble(d[6]);
                        
                        if (d[3].equalsIgnoreCase("Mobil")) {
                            k = new SubMobil(d[4], d[5], hargaSewa, 0.0);
                        } else {
                            k = new SubMotor(d[4], d[5], hargaSewa, 0.0);
                        }

                        // 3. Data Waktu & Sewa
                        // d[7]=tglMulai, d[8]=tglSelesai, d[9]=lamaSewa, d[10]=hariTelat
                        RelTransaksi trx = new RelTransaksi(
                            p, k, d[7], d[8], 
                            Integer.valueOf(d[9]), 
                            Integer.valueOf(d[10])
                        );
                        
                        list.add(trx);
                    } catch (NumberFormatException nfe) {
                        System.err.println("Error format angka di baris: " + baris);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Gagal baca file: " + e.getMessage());
        }
        return list;
    }
}