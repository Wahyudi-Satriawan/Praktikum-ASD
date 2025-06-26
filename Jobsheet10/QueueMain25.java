package Jobsheet10;

import java.util.Scanner;

public class QueueMain25 {
    public static void menu() {
        System.out.println("\nPilih Menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Clear");
        System.out.println("0. Keluar");
        System.out.print(">> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue25 q = new Queue25(n);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dt = sc.nextInt();
                    if (!q.enqueue(dt)) return;
                    break;
                case 2:
                    Integer keluar = q.dequeue();
                    if (keluar == null) return;
                    System.out.println("Data yang dikeluarkan: " + keluar);
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
