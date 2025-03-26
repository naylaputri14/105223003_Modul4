public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("LP001", "Laptop", 7500000, 8);
        Produk produk2 = new Produk("S001", "Sepatu", 1200000, 5);
        Pelanggan pelanggan1 = new Pelanggan("P0001", "Augustine", "august@email.com", 2000000);
        Pelanggan pelanggan2 = new Pelanggan("P0002", "Betty", "betty@email.com", 500000);

        System.out.println("Informasi Produk:");
        produk1.tampilkanInfoProduk();
        produk2.tampilkanInfoProduk();
        System.out.println();

        System.out.println("Informasi Pelanggan:");
        pelanggan1.tampilkanInfoPelanggan();
        pelanggan2.tampilkanInfoPelanggan();
        System.out.println();

        pelanggan2.topUpSaldo(20000);
        System.out.println("Saldo setelah top-up:");
        pelanggan2.tampilkanInfoPelanggan();
        System.out.println();

        Transaksi transaksi1 = new Transaksi("T001", pelanggan1, produk1, 2);
        transaksi1.prosesTransaksi();
        System.out.println();

        System.out.println("Informasi Produk setelah transaksi:");
        produk1.tampilkanInfoProduk();
        System.out.println();

        System.out.println("Informasi Pelanggan setelah transaksi:");
        pelanggan1.tampilkanInfoPelanggan();
    }
}