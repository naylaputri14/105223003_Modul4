public class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.getHarga() * jumlahBeli;
    }

    public void prosesTransaksi() {
        if (pelanggan.kurangiSaldo(totalHarga) && produk.kurangiStok(jumlahBeli)) {
            System.out.println("Transaksi berhasil!");
        } else {
            System.out.println("Transaksi gagal: Saldo tidak cukup atau stok tidak tersedia");
        }
    }
}