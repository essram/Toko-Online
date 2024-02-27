import java.util.ArrayList;

public class Member implements User {
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        // Menambahkan data awal member
        this.namaMember.add("Adi");
        this.alamat.add("Sawojajar");
        this.telepon.add("08123456666");
        this.saldo.add(100000);
        
        this.namaMember.add("Budi");
        this.alamat.add("Bululawang");
        this.telepon.add("081222233344");
        this.saldo.add(200000);
    }

    // Metode untuk menambahkan saldo
    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    // Metode untuk mendapatkan saldo berdasarkan idMember
    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    // Metode untuk mengedit saldo berdasarkan idMember
    public void editSaldo(int idMember, int saldo) {
        this.saldo.set(idMember, saldo);
    }

    // Metode untuk mendapatkan jumlah member
    public int getJmlMember() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaMember.add(nama);
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
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }
}
