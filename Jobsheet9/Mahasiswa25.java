package Jobsheet9;

public class Mahasiswa25{
    String nim, nama, kelas;
    int nilai;
    
    public Mahasiswa25(){
    }

    public Mahasiswa25(String nim, String nama, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}