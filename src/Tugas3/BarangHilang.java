package Tugas3;

/**
 * Kelas {@code BarangHilang} merepresentasikan data barang yang dilaporkan hilang.
 * Kelas ini mengimplementasikan antarmuka {@link IBarangHilang} untuk memastikan
 * adanya metode akses (getter dan setter) terhadap atribut utama.
 *
 * <p>Refactor yang diterapkan:
 * <ul>
 *   <li>Encapsulate Field — semua atribut bersifat private</li>
 * </ul>
 * </p>
 *
 * @author M.
 * @version 1.0
 */
class BarangHilang implements IBarangHilang {

    /** Nama barang yang hilang */
    private String namaBarang;

    /** Tanggal pelaporan barang hilang */
    private String tanggal;

    /** Lokasi di mana barang dilaporkan hilang */
    private String lokasi;

    /**
     * Konstruktor untuk membuat objek {@code BarangHilang} baru.
     *
     * @param namaBarang nama barang yang hilang
     * @param tanggal tanggal laporan kehilangan
     * @param lokasi lokasi barang hilang
     */
    public BarangHilang(String namaBarang, String tanggal, String lokasi) {
        this.setNamaBarang(namaBarang);
        this.setTanggal(tanggal);
        this.setLokasi(lokasi);
    }

    /** {@inheritDoc} */
    @Override
    public String getNamaBarang() {
        return namaBarang;
    }

    /** {@inheritDoc} */
    @Override
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /** {@inheritDoc} */
    @Override
    public String getTanggal() {
        return tanggal;
    }

    /** {@inheritDoc} */
    @Override
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /** {@inheritDoc} */
    @Override
    public String getLokasi() {
        return lokasi;
    }

    /** {@inheritDoc} */
    @Override
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
