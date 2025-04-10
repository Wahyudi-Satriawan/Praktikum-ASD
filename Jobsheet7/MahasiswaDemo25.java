package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumMhs=5;
        
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            String ip = input.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------------------------");
            
            list.tambah(new Mahasiswa25(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.println("IPK: ");
        double cari = input.nextDouble();
        
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
        
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data"); 
        System.out.println("-------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: "); 
        System.out.print("IPK: "); 
        cari = input.nextDouble(); 
        System.out.println("-------------------------------------------");
        System.out.println("menggunakan binary search"); 
        System.out.println("-------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1); 
        int pss2= (int)posisi2; 
        list.tampilPosisi (cari, pss2); 
        list.tampilDataSearch(cari, pss2);

        input.close();
    }
}

