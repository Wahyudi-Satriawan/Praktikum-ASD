package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        String nilaiHuruf;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiakhir;

        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis  : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS   : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS   : ");
        nilaiUAS = sc.nextDouble();
        System.out.println("==============================");
        
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");

        } else {
            nilaiTugas *= 0.2;
            nilaiKuis *= 0.2;
            nilaiUTS *= 0.3;
            nilaiUAS *= 0.3;
            
            nilaiakhir = nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS;
    
            if (nilaiakhir >80 && nilaiakhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiakhir > 73 && nilaiakhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiakhir > 65 && nilaiakhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiakhir > 60 && nilaiakhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiakhir > 50 && nilaiakhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiakhir > 39 && nilaiakhir <= 50) {
                nilaiHuruf = "D";
            }  else if (nilaiakhir <= 39) {
                nilaiHuruf = "E";
            } else {
                nilaiHuruf = "tidak teridentifikasi";
            }
            
            System.out.println("Nilai Akhir : " + nilaiakhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS!");
                System.out.println("==============================");
            } else {
                System.out.println("ANDA TIDAK LULUS!");
                System.out.println("==============================");
            }
        }
        sc.close();
    }
}