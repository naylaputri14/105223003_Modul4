public class Main {
    public static void main(String[] args) throws Exception {
        // Membuat object dari class Mahasiswa
        // Mahasiswa mhs1 = new Mahasiswa("Eko", "12345", "Teknik Informatika");

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Eko";
        mhs1.nim = "12345";
        mhs1.jurusan = "Teknik Informatika";
        
        // Mencetak nama dari object mhs1
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.jurusan);
        mhs1.belajar();
        System.out.println(mhs1.getNama());
        Mahasiswa.kuliah();
        // mhs1.kuliah();
        System.out.println(Mahasiswa.angkatan);

        mhs1.belajar();
        mhs1.belajar("Wahyu");

        mhs1.nama = "Joko";
        System.out.println(mhs1.nama);

        // Mahasiswa mhs2 = new Mahasiswa("Budi", "67890", "Sistem Informasi");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.nim = "67890";
        mhs1.jurusan = "Sistem Informasi";
        
        // Mencetak nama dari object mhs2
        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.jurusan);

        

    }
}