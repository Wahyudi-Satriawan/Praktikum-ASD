package Jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo25 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        Matakuliah25[] daftarMatakuliah = new Matakuliah25[jumlah];

        // Input data matakuliah
        for (int i = 0; i < jumlah; i++) { 
            System.out.println("\nInput Matakuliah ke-" + (i + 1));
            daftarMatakuliah[i] = new Matakuliah25("", "", 0, 0); // Inisialisasi objek
            daftarMatakuliah[i].tambahData();
        }

        // Menampilkan data matakuliah
        System.out.println("\nData Semua Matakuliah:");
        for (int i = 0; i < jumlah; i++) { 
            daftarMatakuliah[i].cetakInfo();
            System.out.println("----------------------");
        }
    }
}