🚗 Java Rental Management System (UASTBO)
Aplikasi manajemen persewaan kendaraan (Mobil & Motor) berbasis Java Desktop (Swing) yang menerapkan prinsip Object-Oriented Programming (OOP) secara mendalam. Proyek ini dibuat untuk memenuhi tugas besar Pemrograman Berorientasi Objek.

🌟 Fitur Utama
Dashboard Informatif: Menampilkan statistik ketersediaan unit mobil dan motor secara real-time.

Form Transaksi Dinamis: Input data penyewaan dengan perhitungan total biaya otomatis dan pemilihan unit yang tersedia saja.

Kelola Pelanggan: Manajemen data penyewa yang mendukung fitur Pencarian, Update, dan Hapus data.

Cek Status Kendaraan: Modul khusus untuk memantau status setiap unit (Tersedia atau Sedang Disewa).

Riwayat & Laporan: Fitur pelaporan transaksi yang mendukung ekspor data ke format .txt (Cetak Laporan).

Exit Confirmation: Panel mitigasi untuk mencegah pengguna keluar aplikasi secara tidak sengaja.

🛠️ Konsep OOP yang Diterapkan
Proyek ini mendemonstrasikan implementasi pilar-pilar OOP:

Inheritance: Menggunakan ParentKendaraan sebagai super-class bagi SubMobil dan SubMotor.

Polymorphism: Overriding method pada sub-class untuk logika perhitungan denda atau biaya yang spesifik.

Encapsulation: Penggunaan akses modifier private dan method getter/setter pada class model seperti DomPelanggan dan RelTransaksi.

Abstraction: Implementasi interface atau class abstrak untuk standarisasi status kendaraan.

📁 Struktur Data
Aplikasi ini menggunakan File I/O sebagai database sederhana:

Data disimpan secara permanen dalam file teks melalui class UtilitiesFile.

Menggunakan ArrayList untuk manipulasi data di dalam memori saat aplikasi berjalan.

🚀 Cara Menjalankan
Clone repositori ini:

Bash
git clone https://github.com/username/nama-repo.git
Buka project menggunakan Apache NetBeans IDE.

Pastikan semua library standard JDK sudah terpasang.

Klik Clean and Build, lalu Run Project.

🖥️ Preview UI
Main Menu: Navigasi menggunakan sidebar dengan sistem CardLayout.

Transaction: Form interaktif dengan validasi input.

Report: Output data rapi dalam format tabel teks.
