package Jobsheet3;
import java.util.Scanner;

public class MahasiswaDemo25 {

    public static void main(String[] args) {
        Mahasiswa25[] arrayOfMahasiswa = new Mahasiswa25[3];
        Scanner sc = new Scanner (System.in); 
        String dummy;

        for (int i = 0; i < 3; i++) { 
            arrayOfMahasiswa [i] = new Mahasiswa25(); 
            System.out.println("Masukkan Data Mahasiswa ke-" + (1+1)); 
            System.out.print("NIM   : "); 
            arrayOfMahasiswa[i].nim = sc.nextLine(); 
            System.out.print("Nama  : "); 
            arrayOfMahasiswa[i].nama = sc.nextLine(); 
            System.out.print("Kelas : "); 
            arrayOfMahasiswa[i].kelas = sc.nextLine(); 
            System.out.print("IPK   : "); 
            dummy= sc.nextLine(); 
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy); 
            System.out.println("------------------------------------");
        }

        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].cetakInfo();
        }
    }   
}
