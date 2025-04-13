package Jobsheet7;

import java.util.Scanner;

public class DosenMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen25 data = new DataDosen25();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua) - Bubble Sort");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda) - Insertion Sort");
            System.out.println("5. Cari Dosen berdasarkan Nama (Sequential Search)");
            System.out.println("6. Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    data.tambah(new Dosen25(kode, nama, jk, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.SortingASC();
                    System.out.println("Data berhasil diurutkan (ASC - Bubble Sort)!");
                    break;

                case 4:
                    data.insertionSort();
                    System.out.println("Data berhasil diurutkan (DSC - Insertion Sort)!");
                    break;

                case 5:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.pencarianSequential25(cariNama);
                    break;

                case 6:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    sc.nextLine();
                    data.pencarianBinary25(cariUsia);
                    break;
            }

        } while (pilih != 0);
        sc.close();
    }
}
