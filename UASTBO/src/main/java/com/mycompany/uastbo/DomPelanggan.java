
package com.mycompany.uastbo;


public class DomPelanggan {
    private String nama, nik, noTelp;

    public DomPelanggan(String nama, String nik, String noTelp) {
        this.nama = nama;
        this.nik = nik;
        this.noTelp = noTelp;
    }

    // Method tambahan 1: Validasi NIK
    public boolean isNikValid() { return nik.length() == 16; }
    
    // Method tambahan 2: Format info
    public String getFullContact() { return nama + " [" + noTelp + "]"; }

    public String getNama() { return nama; }
    public String getNik() { return nik; }
    public String getNoTelp() { return noTelp; }
    
    
}
