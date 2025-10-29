package Tugas3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas utama {@code Main} yang menjalankan aplikasi pelaporan barang hilang.
 *
 * <p>Fitur utama aplikasi:
 * <ul>
 *   <li>Menambah laporan barang hilang</li>
 *   <li>Menampilkan daftar barang hilang</li>
 *   <li>Menghapus (mengambil) barang yang ditemukan</li>
 * </ul>
 * </p>
 *
 * <p>Refaktor yang digunakan:
 * <ul>
 *   <li>Inline Variable — pada proses pengambilan barang</li>
 * </ul>
 * </p>
 *
 * @author M.
 * @version 1.0
 */
public class Main {

    /** Menyimpan daftar semua barang yang dilaporkan hilang */
    static ArrayList<BarangHilang> daftarBarangHilang = new ArrayList<>();

    /** Objek Scanner untuk membaca input pengguna */
    static Scanner input = new Scanner(System.in);

    /**
     * Metode utama untuk menjalankan program.
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Lapor Barang Hilang");
            System.out.println("2. Ambil Barang Hilang");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> laporBarangHilang();
                case 2 -> ambilBarangHilang();
                case 3 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    /**
     * Menambahkan laporan barang hilang baru.
     * Alias dari pemanggilan {@link #laporBarangHilang()}.
     */
    static void tambahLaporanBarang() {
        laporBarangHilang();
    }

    /**
     * Meminta input pengguna untuk melaporkan barang hilang,
     * lalu menambahkannya ke daftar laporan.
     */
    private static void laporBarangHilang() {
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan tanggal pelaporan: ");
        String tanggal = input.nextLine();
        System.out.print("Masukkan lokasi barang hilang: ");
        String lokasi = input.nextLine();

        BarangHilang barang = new BarangHilang(nama, tanggal, lokasi);
        daftarBarangHilang.add(barang);
        System.out.println("Barang berhasil dilaporkan!");
    }

    /**
     * Menampilkan daftar barang hilang dan memungkinkan pengguna
     * untuk menandai barang sebagai diambil (menghapus dari daftar).
     */
    static void ambilBarangHilang() {
        if (daftarBarangHilang.isEmpty()) {
            System.out.println("Belum ada barang yang dilaporkan.");
            return;
        }

        System.out.println("\n=== DAFTAR BARANG HILANG ===");
        for (int i = 0; i < daftarBarangHilang.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBarangHilang.get(i).getNamaBarang());
        }

        System.out.print("Pilih nomor barang yang ingin diambil: ");
        int nomor = input.nextInt();
        input.nextLine();

        if (nomor > 0 && nomor <= daftarBarangHilang.size()) {
            System.out.println("Barang '" + daftarBarangHilang.remove(nomor - 1).getNamaBarang() + "' sudah diambil!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    /**
     * Mencetak detail informasi lengkap dari sebuah objek {@link BarangHilang}.
     *
     * @param barangHilang objek barang yang ingin ditampilkan informasinya
     */
    public static void printDetail(BarangHilang barangHilang) {
        System.out.println("Nama Barang: " + barangHilang.getNamaBarang());
        System.out.println("Tanggal Laporan: " + barangHilang.getTanggal());
        System.out.println("Lokasi Hilang: " + barangHilang.getLokasi());
    }
}
