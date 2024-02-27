import java.util.ArrayList;

public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {
        // Menambahkan data awal barang
        this.namaBarang.add("Cokelat enak");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("Sabun Beri");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("Odol SIWAK");
        this.stok.add(20);
        this.harga.add(15000);
    }

    // Metode untuk mendapatkan jumlah barang
    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    // Metode untuk menambahkan nama barang
    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    // Metode untuk mendapatkan nama barang berdasarkan idBarang
    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    // Metode untuk menambahkan stok barang
    public void setStok(int stok) {
        this.stok.add(stok);
    }

    // Metode untuk mendapatkan stok barang berdasarkan idBarang
    public int getStok(int idBarang) {
        return this.stok.get(idBarang);
    }

    // Metode untuk mengedit stok barang berdasarkan idBarang
    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);
    }

    // Metode untuk menambahkan harga barang
    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    // Metode untuk mendapatkan harga barang berdasarkan idBarang
    public int getHarga(int idBarang) {
        return this.harga.get(idBarang);
    }
}
