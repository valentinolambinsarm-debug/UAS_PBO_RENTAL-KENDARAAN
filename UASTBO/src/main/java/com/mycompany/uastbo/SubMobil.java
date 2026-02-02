
package com.mycompany.uastbo;


public class SubMobil extends ParentKendaraan {
    public SubMobil(String noPlat, String merk, Double harga, Double denda) {
        super(noPlat, merk, harga, denda);
    }

    @Override // Polymorphism: Overriding
    public double hitungTotal(int lama, int telat) {
        double subtotal = (getHargaSewa() * lama) + (getDenda() * telat);
        return subtotal - hitungDiskon(lama, subtotal);
    }

    @Override
    public String getTipe() { return "Mobil"; }
}
