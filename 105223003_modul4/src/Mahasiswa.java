public class Mahasiswa {

    // Atribut
    String nama;
    String nim;
    String jurusan;
    boolean isLulus = false;
    static int angkatan = 2019;

    // Konstruktor berparameter
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Konstruktor default
    Mahasiswa() {
        this("no name", "00000", "no jurusan");
    }

    // Konstruktor copy
    Mahasiswa(Mahasiswa m) {
        this.nama = m.nama;
        this.nim = m.nim;
        this.jurusan = jurusan;
    }

    // Method / Function
    void belajar() {
        System.out.println(nama + " sedang belajar");
    }

    void belajar(String nama) {
        System.out.println(nama+ " sedang belajar");
    }

    String getNama() {
        return nama;
    }

    // class dalam class
    class Dalam {
        void test() {
            System.out.println("ini adalah inner class");
        }
    }

    static void kuliah() {
        System.out.println("Mahasiswa sedang kuliah");
    }

}