package Jobsheet6;

public class Mahasiswa25 { 
    String nim; 
    String nama; 
    String kelas; 
    double ipk; 

    Mahasiswa25(){
    }

    Mahasiswa25(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() { 
    System.out.println("Nama  : "+ nama); 
    System.out.println("NIM   : " + nim); 
    System.out.println("Kelas : "+ kelas); 
    System.out.println("IPK   : " + ipk); 
    }
}