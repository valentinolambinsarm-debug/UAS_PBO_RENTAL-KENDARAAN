
package com.mycompany.uastbo;


public class SubMotor extends ParentKendaraan {
    public SubMotor(String noPlat, String merk, Double harga, Double denda) {
        super(noPlat, merk, harga, denda);
    }

    @Override
    public double hitungTotal(int lama, int telat) {
        double subtotal = (getHargaSewa() * lama) + (getDenda() * telat);
        return subtotal - hitungDiskon(lama, subtotal);
    }

    @Override
    public String getTipe() { return "Motor"; }
}
