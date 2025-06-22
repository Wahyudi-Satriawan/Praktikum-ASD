package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa25 stack = new StackTugasMahasiswa25(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Nilai dan Keluarkan Tugas");
            System.out.println("3. Lihat Tugas Teratas");
            System.out.println("4. Lihat Tugas Terbawah");
            System.out.println("5. Lihat Semua Tugas");
            System.out.println("6. Lihat Jumlah Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = scan.nextLine();
                    System.out.print("Nama  : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    Mahasiswa25 mhs = new Mahasiswa25(nim, nama, kelas);
                    stack.push(mhs);
                    break;
                case 2:
                    Mahasiswa25 mhsPop = stack.pop();
                    if (mhsPop != null) {
                        System.out.print("Nilai tugas: ");
                        int nilai = scan.nextInt();
                        mhsPop.tugasDinilai(nilai);
                        System.out.print("Nilai dalam biner: ");
                        konversiDesimalKeBiner(nilai);
                        mhsPop.tampil();
                    }
                    break;
                case 3:
                    Mahasiswa25 atas = stack.peek();
                    if (atas != null) atas.tampil();
                    break;
                case 4:
                    Mahasiswa25 bawah = stack.bottom();
                    if (bawah != null) bawah.tampil();
                    break;
                case 5:
                    stack.print();
                    break;
                case 6:
                    System.out.println("Jumlah tugas: " + stack.count());
                    break;
            }
        } while (pilih != 0);

        scan.close();
    }

    public static void konversiDesimalKeBiner(int kode) {
        StackKonversi25 stack = new StackKonversi25(20);
        while (kode > 0) {
            stack.push(kode % 2);
            kode /= 2;
        }
        stack.print();
    }
}
