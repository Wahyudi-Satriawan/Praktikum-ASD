package Jobsheet3;

import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen25[] daftarDosen = new Dosen25[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput Data Dosen ke-" + (i + 1));

            System.out.print("Masukkan kode dosen: ");
            String kode = sc.nextLine();

            System.out.print("Masukkan nama dosen: ");
            String nama = sc.nextLine();

            System.out.print("Masukkan jenis kelamin (Pria = 1, Wanita = 0): ");
            boolean jenisKelamin = sc.nextInt() == 1;

            System.out.print("Masukkan usia dosen: ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== Data Semua Dosen ===");
        DataDosen25.dataSemuaDosen(daftarDosen);

        // Menampilkan jumlah dosen berdasarkan jenis kelamin
        System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        DataDosen25.jumlahDosenPerJenisKelamin(daftarDosen);

        // Menampilkan rata-rata usia dosen berdasarkan jenis kelamin
        System.out.println("\n=== Rata-rata Usia Dosen ===");
        DataDosen25.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        // Menampilkan dosen tertua
        System.out.println("\n=== Dosen Paling Tua ===");
        DataDosen25.infoDosenPalingTua(daftarDosen);

        // Menampilkan dosen termuda
        System.out.println("\n=== Dosen Paling Muda ===");
        DataDosen25.infoDosenPalingMuda(daftarDosen);
        sc.close();
    }
}
