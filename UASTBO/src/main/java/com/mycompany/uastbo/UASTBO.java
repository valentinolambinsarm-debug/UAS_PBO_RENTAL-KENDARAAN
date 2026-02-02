package com.mycompany.uastbo;

public class UASTBO {
    public static void main(String[] args) {
        // Mengarahkan agar saat aplikasi dijalankan, yang muncul adalah GUI MenuUtama
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }
}