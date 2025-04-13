package Jobsheet7;

public class Dosen25 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen25(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode Dosen     : " + kode);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
        System.out.println("-----------------------------");
    }
}
