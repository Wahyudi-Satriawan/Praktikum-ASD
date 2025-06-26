package Jobsheet11;

import java.util.Scanner;

public class SLLMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList25 list = new SingleLinkedList25();

        Mahasiswa25 mhs1 = new Mahasiswa25("23001", "Alvaro", "1A", 3.75);
        Mahasiswa25 mhs2 = new Mahasiswa25("23002", "Bimon", "2B", 3.60);
        Mahasiswa25 mhs3 = new Mahasiswa25("23003", "Cintia", "3C", 3.90);
        Mahasiswa25 mhs4 = new Mahasiswa25("23004", "Dirga", "4D", 3.6);


        list.print();
        list.addFirst(mhs4);
        list.print();
        list.addLast(mhs1);
        list.print();
        list.insertAfter("Dirga", mhs3);
        list.InsertAt(2, mhs2);
        list.print();

        boolean cek = true;
        while (cek) {
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble(); sc.nextLine();
        
            Mahasiswa25 mhs = new Mahasiswa25(nim, nama, kelas, ipk);
            list.addLast(mhs);
        
            System.out.print("Tambah data lagi? (y/n): ");
            String ulang = sc.nextLine();
            if (!ulang.equalsIgnoreCase("y")) {
                cek = false;
            }
        }
        sc.close();
    }
}

