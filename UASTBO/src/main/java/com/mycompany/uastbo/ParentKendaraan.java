
package com.mycompany.uastbo;


public abstract class ParentKendaraan implements EnumDiskon {
    private String noPlat;
    private String merk;
    private Double hargaSewa; // Wrapper Class
    private Double denda;     // Wrapper Class
    private InterfaceStatusKendaraan status;

    public ParentKendaraan(String noPlat, String merk, Double hargaSewa, Double denda) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.hargaSewa = hargaSewa;
        this.denda = denda;
        this.status = InterfaceStatusKendaraan.TERSEDIA;
    }

    // Abstract Method (Minimal 1)
    public abstract double hitungTotal(int lama, int telat);
    public abstract String getTipe();

    // Method Tambahan (Minimal 2 selain constructor)
    public String getStatusInfo() {
        return "Unit " + merk + " saat ini " + status;
    }

    public void updateStatus(InterfaceStatusKendaraan baru) {
        this.status = baru;
    }

    // Implementasi Interface
    @Override
    public double hitungDiskon(int lamaSewa, double totalAwal) {
        return (lamaSewa > 7) ? totalAwal * 0.10 : 0.0;
    }

    @Override
    public void tampilkanPromo() {
        System.out.println(">>> PROMO: Sewa lebih dari seminggu diskon 10%!");
    }

    // Enkapsulasi: Getter & Setter
    public String getNoPlat() { return noPlat; }
    public String getMerk() { return merk; }
    public Double getHargaSewa() { return hargaSewa; }
    public Double getDenda() { return denda; }
    public InterfaceStatusKendaraan getStatus() { return status; }
}
