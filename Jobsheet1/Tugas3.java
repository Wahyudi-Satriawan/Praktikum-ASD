package Jobsheet1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sksMK = new int[jumlahMK];
        int[] semesterMK = new int[jumlahMK];
        String[] hariMK = new String[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sksMK[i] = sc.nextInt();
            System.out.print("Semester: ");
            semesterMK[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari: ");
            hariMK[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMK, sksMK, semesterMK, hariMK);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin dicari: ");
                    String cariHari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMK, sksMK, semesterMK, hariMK, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin dicari: ");
                    int cariSemester = sc.nextInt();
                    sc.nextLine();
                    tampilkanJadwalBerdasarkanSemester(namaMK, sksMK, semesterMK, hariMK, cariSemester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String cariMK = sc.nextLine();
                    cariMataKuliah(namaMK, sksMK, semesterMK, hariMK, cariMK);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        } while (pilihan != 5);

        sc.close();
    }

    public static void tampilkanSeluruhJadwal(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK) {
        System.out.println("\n=== Seluruh Jadwal Kuliah ===");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(namaMK[i] + " - " + sksMK[i] + " SKS - Semester " + semesterMK[i] + " - " + hariMK[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, String cariHari) {
        System.out.println("\n=== Jadwal Kuliah Hari " + cariHari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariMK[i].equalsIgnoreCase(cariHari)) {
                System.out.println(namaMK[i] + " - " + sksMK[i] + " SKS - Semester " + semesterMK[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, int cariSemester) {
        System.out.println("\n=== Jadwal Kuliah Semester " + cariSemester + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semesterMK[i] == cariSemester) {
                System.out.println(namaMK[i] + " - " + sksMK[i] + " SKS - Hari " + hariMK[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + cariSemester);
        }
    }

    public static void cariMataKuliah(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, String cariMK) {
        System.out.println("\n=== Pencarian Mata Kuliah: " + cariMK + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(cariMK)) {
                System.out.println(namaMK[i] + " - " + sksMK[i] + " SKS - Semester " + semesterMK[i] + " - Hari " + hariMK[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}