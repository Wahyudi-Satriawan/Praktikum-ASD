package Jobsheet10;

import java.util.Scanner;

public class KRSMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS25 krs = new AntrianKRS25(10); // maks 10 antrian aktif

        int pilih;
        do {
            System.out.println("\n========= MENU KRS MAHASISWA =========");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah yang Sudah Diproses & Sisa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa25 mhs = new Mahasiswa25(nim, nama, prodi, kelas);
                    krs.enqueue(mhs);
                    break;
                case 2:
                    krs.prosesKRS();
                    break;
                case 3:
                    krs.print();
                    break;
                case 4:
                    krs.tampilkan2Terdepan();
                    break;
                case 5:
                    krs.tampilkanBelakang();
                    break;
                case 6:
                    krs.jumlahAntrian();
                    break;
                case 7:
                    krs.jumlahProses();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}
