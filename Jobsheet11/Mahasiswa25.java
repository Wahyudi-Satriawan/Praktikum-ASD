package Jobsheet11;

public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa25(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println();
        System.out.printf("%-15s %-10s %-8s %-4.2f\n", nama, nim, kelas, ipk);
    }
}
