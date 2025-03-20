public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int lamaSewa;
    private double totalBiaya;
    private boolean transaksiBerhasil;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
        prosesSewa();
    }

    private void prosesSewa() {
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            double biayaAwal = mobil.getHargaSewaPerHari() * lamaSewa;
            double diskon = Utility.hitungDiskon(biayaAwal, lamaSewa);
            totalBiaya = biayaAwal - diskon;
            transaksiBerhasil = true;
        }
    }

    public void tampilkanStruk() {
        System.out.println("=== Struk Penyewaan ===");
        pelanggan.tampilkanInfo();
        System.out.println("\n=== Informasi Mobil ===");
        mobil.tampilkanInfo();
        System.out.println("\nLama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Biaya  : " + Utility.formatMataUang(totalBiaya));
        System.out.println("Status       : " + (transaksiBerhasil ? "Sukses" : "Gagal"));
        System.out.println("=============================\n");
    }
}