package com.mycompany.uastbo;

public class RelTransaksi {
    private DomPelanggan pelanggan;
    private ParentKendaraan kendaraan;
    private String tglMulai;
    private String tglSelesai;
    private Integer lamaSewa;
    private Integer hariTelat;

    // CONSTRUCTOR: Harus menerima 6 parameter agar cocok dengan tombol Simpan
    public RelTransaksi(DomPelanggan p, ParentKendaraan k, String tglMulai, String tglSelesai, Integer lama, Integer telat) {
        this.pelanggan = p;
        this.kendaraan = k;
        this.tglMulai = tglMulai;
        this.tglSelesai = tglSelesai;
        this.lamaSewa = lama;
        this.hariTelat = telat;
    }

    // GETTER: Tambahkan ini agar error di loadTablePelanggan hilang
    public DomPelanggan getP() { return pelanggan; }
    public ParentKendaraan getK() { return kendaraan; }
    public String getTglMulai() { return tglMulai; }
    public String getTglSelesai() { return tglSelesai; }
    public Integer getLamaSewa() { return lamaSewa; }
    public Integer getHariTelat() { return hariTelat; }

    public double totalBayar() {
        return kendaraan.hitungTotal(lamaSewa, hariTelat);
    }

    public String toCSV() {
        String jenis = (kendaraan instanceof SubMobil) ? "Mobil" : "Motor";
        return pelanggan.getNama() + "," + pelanggan.getNik() + "," + pelanggan.getNoTelp() + "," +
               jenis + "," + kendaraan.getNoPlat() + "," + kendaraan.getMerk() + "," +
               kendaraan.getHargaSewa() + "," + tglMulai + "," + tglSelesai + "," + 
               lamaSewa + "," + hariTelat + "," + totalBayar();
    }
}