public class Utility {
    public static double hitungDiskon(double biaya, int lamaSewa) {
        return (lamaSewa > 5) ? biaya * 0.1 : 0;
    }

    public static String formatMataUang(double jumlah) {
        return "Rp" + String.format("%,.2f", jumlah);
    }
}