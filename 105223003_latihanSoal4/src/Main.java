public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Augustine", "220102", "Manajemen", 2.8);
        Mahasiswa mhs2 = new Mahasiswa("Betty", "240106", "Ilmu Sastra", 3.5);

        System.out.println("Data Mahasiswa");
        mhs1.tampilkanInfo();
        System.out.println("Lulus: " + (mhs1.cekLulus() ? "Ya" : "Tidak"));

        System.out.println("Data Mahasiswa");
        mhs2.tampilkanInfo();
        System.out.println("Lulus: " + (mhs2.cekLulus() ? "Ya" : "Tidak"));
    }
}