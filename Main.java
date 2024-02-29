public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek yang diperlukan
        Barang barang = new Barang();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        // Memanggil laporan dari kelas Laporan untuk melihat laporan barang
        laporan.laporan(barang);
        
        // Memanggil laporan dari kelas Laporan untuk melihat laporan member
        laporan.laporan(member);
        
        // Memanggil prosesTransaksi dari kelas Transaksi untuk melakukan transaks-i
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        // Memanggil laporan dari kelas Laporan untuk melihat laporan transaksi
        laporan.laporan(transaksi, barang);
    }
}

