package Jobsheet12;

import java.util.Scanner;

public class DLLMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList25 list = new DoubleLinkedList25();
        int pilih;

        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("7. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    list.addFirst(inputMahasiswa(sc));
                    break;
                case 2:
                    list.addLast(inputMahasiswa(sc));
                    break;
                case 3:
                    list.removeFirst(); 
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang akan dicari: ");
                    String nim = sc.nextLine();
                    list.search(nim);
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

    static Mahasiswa25 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Prodi : ");
        String prodi = sc.nextLine();
        System.out.print("IPK : ");
        double ipk = sc.nextDouble();
        return new Mahasiswa25(nim, nama, prodi, ipk);
    }
}
