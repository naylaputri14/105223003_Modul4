public class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewaPerHari;
    private boolean tersedia;

    public Mobil() {
        this("", "", 0, true);
    }

    public Mobil(String nomorPlat, String merek, double hargaSewaPerHari, boolean tersedia) {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = tersedia;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Plat    : " + nomorPlat);
        System.out.println("Merek         : " + merek);
        System.out.println("Harga Sewa    : " + Utility.formatMataUang(hargaSewaPerHari) + " / hari");
        System.out.println("Status        : " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }
}