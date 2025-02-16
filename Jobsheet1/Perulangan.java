package Jobsheet1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n, NIM, i=0;

    System.out.print("Masukkan NIM: ");
    NIM = sc.nextLong();
    System.out.println("===========================");
    
    n = NIM % 100;
    System.out.println("n: " + n);
    System.out.println("===========================");

    do {
        ++i;
        if (i == 6 || i == 10) {
            continue;
        }

        if (i % 2 == 0) {
            System.out.print(i+" ");
        } else {
            System.out.print("* ");
        }

    } while (i < n);

    sc.close();
    }
}
