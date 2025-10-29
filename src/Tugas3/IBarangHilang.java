package Tugas3;

/**
 * Antarmuka {@code IBarangHilang} mendefinisikan perilaku dasar
 * untuk setiap objek yang merepresentasikan barang hilang.
 *
 * <p>Setiap kelas yang mengimplementasikan antarmuka ini harus menyediakan:
 * <ul>
 *   <li>Nama barang</li>
 *   <li>Tanggal laporan</li>
 *   <li>Lokasi kehilangan</li>
 * </ul>
 * </p>
 *
 * @author M.
 * @version 1.0
 */
public interface IBarangHilang {

    /**
     * Mengambil nama barang yang hilang.
     * @return nama barang
     */
    String getNamaBarang();

    /**
     * Mengatur nama barang yang hilang.
     * @param namaBarang nama barang yang akan disimpan
     */
    void setNamaBarang(String namaBarang);

    /**
     * Mengambil tanggal laporan kehilangan.
     * @return tanggal laporan
     */
    String getTanggal();

    /**
     * Mengatur tanggal laporan kehilangan.
     * @param tanggal tanggal laporan
     */
    void setTanggal(String tanggal);

    /**
     * Mengambil lokasi tempat kehilangan barang.
     * @return lokasi kehilangan
     */
    String getLokasi();

    /**
     * Mengatur lokasi tempat kehilangan barang.
     * @param lokasi lokasi kehilangan
     */
    void setLokasi(String lokasi);
}
