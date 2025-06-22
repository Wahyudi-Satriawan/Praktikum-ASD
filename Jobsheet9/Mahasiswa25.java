package Jobsheet9;

public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa25(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + (nilai == -1 ? "Belum Dinilai" : nilai));
    }
}
