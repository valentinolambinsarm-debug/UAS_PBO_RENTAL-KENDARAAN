# 🚗 Java Rental Management System (UASTBO)

Aplikasi manajemen persewaan kendaraan (Mobil & Motor) berbasis Java Desktop (Swing) yang menerapkan prinsip **Object-Oriented Programming (OOP)**. Proyek ini dibuat untuk memenuhi tugas besar mata kuliah Pemrograman Berorientasi Objek.

---

## 🌟 Fitur Utama

* **Dashboard Informatif**: Statistik ketersediaan unit mobil dan motor secara real-time.
* **Form Transaksi Dinamis**: Input penyewaan dengan kalkulasi biaya otomatis.
* **Kelola Pelanggan**: Fitur CRUD (Create, Read, Update, Delete) data penyewa.
* **Cek Status Kendaraan**: Modul monitoring status unit (Tersedia/Disewa).
* **Riwayat & Laporan**: Ekspor data riwayat transaksi ke format `.txt`.
* **Exit Confirmation**: Panel mitigasi untuk mencegah keluar aplikasi secara tidak sengaja.

---

## 🛠️ Konsep OOP yang Diterapkan

Proyek ini mendemonstrasikan implementasi pilar-pilar OOP:
1. **Inheritance**: `ParentKendaraan` sebagai super-class bagi `SubMobil` dan `SubMotor`.
2. **Polymorphism**: Overriding method pada sub-class untuk logika biaya spesifik.
3. **Encapsulation**: Penggunaan akses modifier private dan getter/setter pada class model.
4. **Abstraction**: Standarisasi status kendaraan melalui interface/class abstrak.

---

## 📂 Struktur Data

Aplikasi ini menggunakan **File I/O** sebagai database sederhana:
* Data disimpan secara permanen dalam file teks via class `UtilitiesFile`.
* Menggunakan `ArrayList` untuk manipulasi data di dalam memori.

---

## 🚀 Cara Menjalankan

1. Clone repositori ini:
   ```bash
   git clone [https://github.com/username/nama-repo.git](https://github.com/username/nama-repo.git)
