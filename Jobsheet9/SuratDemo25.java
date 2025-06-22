package Jobsheet9;

import java.util.Scanner;

public class SuratDemo25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat25 stackSurat = new StackSurat25(10);

        int pilih;
        do {
            System.out.println("\n--- MENU SURAT IZIN ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat     : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas        : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat25 surat = new Surat25(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    break;

                case 2:
                    Surat25 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampil();
                    }
                    break;

                case 3:
                    Surat25 teratas = stackSurat.peek();
                    if (teratas != null) {
                        System.out.println("Surat terakhir:");
                        teratas.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    boolean ditemukan = stackSurat.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat dari " + cari + " ditemukan di stack.");
                    } else {
                        System.out.println("Tidak ditemukan surat dari " + cari);
                    }
                    break;

                case 5:
                    stackSurat.print();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        scan.close();
    }
}
