import java.util.ArrayList;

public class Karyawan implements User {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        // Menambahkan data awal karyawan
        this.namaKaryawan.add("Admin");
        this.alamat.add("Kedung Kandang");
        this.telepon.add("081112223333");
        this.jabatan.add(0);
    }

    //menambahkan jabatan
    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    //mendapatkan jabatan berdasarkan idKaryawan
    public int getJabatan(int id) {
        return this.jabatan.get(id);
    }

    //mendapatkan jumlah karyawan
    public int getJmlKaryawan() {
        return this.namaKaryawan.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}
