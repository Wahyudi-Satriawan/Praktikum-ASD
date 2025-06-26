package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa25 stack = new StackTugasMahasiswa25(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat daftar tugas");
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
                    Mahasiswa25 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Nilai tugas: ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.print("Nilai dalam biner: " + biner);
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
            }
        } while (pilih != 0);

        scan.close();
    }
}
