package Jobsheet11;

import java.util.Scanner;

public class TugasAntrianKemahasiswaan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasQueueLinkedList25 antrian = new TugasQueueLinkedList25();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Lihat Antrian Terdepan");
            System.out.println("6. Lihat Antrian Paling Belakang");
            System.out.println("7. Tampilkan Semua Antrian");
            System.out.println("8. Tampilkan Jumlah Mahasiswa yang Mengantri");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    TugasMahasiswa25 mhs = new TugasMahasiswa25(nim, nama, prodi);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    TugasMahasiswa25 keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        keluar.tampil();
                    }
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 5:
                    antrian.peek();
                    break;
                case 6:
                    antrian.peekRear();
                    break;
                case 7:
                    antrian.print();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}
