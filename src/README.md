# LostItemReport_Java
# 🧾 PL_RUDIMUSTAKIM_136: Sistem Laporan Barang Hilang (Java)

[![Lisensi](https://img.shields.io/badge/Lisensi-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Build](https://img.shields.io/badge/Build-Success-green.svg)]()

---

## 📖 Deskripsi Proyek

Proyek ini merupakan implementasi **Sistem Laporan Barang Hilang berbasis konsol** menggunakan bahasa pemrograman **Java**.  
Aplikasi ini dirancang untuk membantu proses pelaporan dan pengelolaan data barang hilang di lingkungan kampus dengan menerapkan **konsep OOP (Object-Oriented Programming)** dan **interface**.

Program ini memiliki satu peran utama:
- 🎓 **Mahasiswa** → Dapat melaporkan dan melihat daftar barang hilang

---

## ⚙️ Panduan Penggunaan

### 1. Prasyarat

Pastikan perangkat Anda sudah terpasang:
- **Java Development Kit (JDK)** minimal versi **8**
- **Git** (opsional, untuk clone repositori)
- **Text Editor / IDE** seperti IntelliJ IDEA, VS Code, atau NetBeans

---

### 2. Menjalankan Kode

1. **Clone repositori ini:**
    ```bash
    git clone https://github.com/Rudyyz/LostItemReport_Java.git
    cd LostItemReport_Java
    ```

2. **Kompilasi semua file:**
    ```bash
    javac *.java
    ```

3. **Jalankan program:**
    ```bash
    java Main
    ```

---

## 🧩 Contoh Interaksi Program
=== MENU UTAMA ===

1. Lapor Barang Hilang
2. Ambil Barang Hilang
3. Exit

Pilih menu: 1
Masukkan nama barang: laptop

Masukkan tanggal pelaporan: 20/04/2025

Masukkan lokasi barang hilang: meja

Barang berhasil dilaporkan!

=== MENU UTAMA ===

1. Lapor Barang Hilang
2. Ambil Barang Hilang
3. Exit
Pilih menu: 2

=== DAFTAR BARANG HILANG ===

laptop
Pilih nomor barang yang ingin diambil: 1

Barang 'laptop' sudah diambil!


---

## 💡 Konsep OOP yang Diterapkan

| Konsep | Implementasi |
|--------|---------------|
| **Encapsulation** | Menggunakan atribut `private` dengan `getter` dan `setter` |
| **Interface** | `IBarangHilang` sebagai kontrak perilaku objek |
| **Polymorphism** | Implementasi method yang berbeda antar class |
| **Abstraction** | Menyembunyikan detail implementasi dalam method publik |

---

## 💻 Pengembang

* **Nama:** M. Rudi Mustakim
* **NIM:** 202410370110136
* **GitHub Username:** Rudyyz
* **Deskripsi:** Implementasi konsep OOP pada Sistem Laporan Barang Hilang berbasis Java Console

---

## 🏁 Lisensi

Proyek ini dilisensikan di bawah **MIT License**.  
Silakan digunakan, dimodifikasi, dan dikembangkan untuk kebutuhan pembelajaran dan pengembangan lebih lanjut.

