public class Main {
    public static void main(String[] args) {
        Mobil[] daftarMobil = {
            new Mobil("B 3103 DGW", "Wuling Almaz", 700000, true),
            new Mobil("D 2604 NPR", "Honda Civic", 950000, true),
            new Mobil("E 0808 ASN", "Mitsubishi Xpander", 650000, true),
            new Mobil("F 0109 JJK", "Toyota Camry", 1500000, true),
            new Mobil("DK 1403 NPZ", "Hyundai Palisade", 1700000, true)
        };

        System.out.println("=== Daftar Mobil yang Tersedia ===");
        for (Mobil mobil : daftarMobil) {
            mobil.tampilkanInfo();
            System.out.println();
        }

        Pelanggan pelanggan1 = new Pelanggan("Betty Jean", "1234567890123456", "081234567890");
        Pelanggan pelanggan2 = new Pelanggan("James Miller", "6543210987654321", "089876543210");

        Sewa transaksi1 = new Sewa(pelanggan1, daftarMobil[2], 7);
        transaksi1.tampilkanStruk();

        Sewa transaksi2 = new Sewa(pelanggan2, daftarMobil[4], 3);
        transaksi2.tampilkanStruk();
    }
}