package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuas(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        System.out.println("\nPilih perhitungan:");
        System.out.println("1. Volume");
        System.out.println("2. Luas Permukaan");
        System.out.println("3. Keliling");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = sc.nextInt();
        System.out.println("===============================");

        switch (pilihan) {
            case 1:
                System.out.println("Volume: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan: " + hitungLuas(sisi));
                break;
            case 3:
                System.out.println("Keliling: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        sc.close();
    }
}