package Jobsheet1;

public class Fungsi {
    public static void main(String[] args) {

        int[][] stokTanaman = {
            {10, 5, 15, 7},  // Cabang 1
            {6, 11, 9, 12},  // Cabang 2
            {2, 10, 10, 5},  // Cabang 3
            {5, 7, 12, 9}    // Cabang 4
        };

        // Harga tiap jenis tanaman
        int[] hargaTanaman = {75000, 50000, 60000, 10000};

        // Hitung pendapatan tiap cabang
        int[] pendapatan = hitungPendapatan(stokTanaman, hargaTanaman);

        // Tampilkan hasil
        tampilkanHasil(pendapatan);

        int[] bungaMati = {-1, -2, 0, -5}; // Aglonema, Keladi, Alocasia, Mawar

        // Hitung stok setelah pengurangan
        int[] stokSetelahPengurangan = hitungStokCabang4(stokTanaman[3], bungaMati);

        // Tampilkan hasil
        tampilkanStok(stokSetelahPengurangan);

        
    }

    // Fungsi untuk menghitung pendapatan tiap cabang
    public static int[] hitungPendapatan(int[][] stok, int[] harga) {
        int[] pendapatan = new int[stok.length];

        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan[i] += stok[i][j] * harga[j];
            }
        }
        return pendapatan;
    }

    // Fungsi untuk menampilkan hasil pendapatan tiap cabang
    public static void tampilkanHasil(int[] pendapatan) {
        System.out.println("Pendapatan Royal Garden");
        System.out.println("=======================");
        for (int i = 0; i < pendapatan.length; i++) {
            System.out.printf("Cabang " + (i + 1) + "Rp %,d%n", pendapatan[i]);
        }

    }


    // Fungsi untuk menghitung stok setelah dikurangi bunga mati
    public static int[] hitungStokCabang4(int[] stok, int[] bungaMati) {
        int[] stokBaru = new int[stok.length];

        // Mengurangi stok sesuai bunga yang mati
        for (int i = 0; i < stok.length; i++) {
            stokBaru[i] = stok[i] + bungaMati[i]; // bungaMati sudah dalam bentuk negatif
        }

        return stokBaru;
    }

    // Fungsi untuk menampilkan jumlah stok setelah pengurangan
    public static void tampilkanStok(int[] stokBaru) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("=======================================");
        System.out.println("Stok Bunga Cabang 4 Setelah Pengurangan");
        System.out.println("=======================================");
        for (int i = 0; i < stokBaru.length; i++) {
            System.out.println(namaBunga[i] + " : " + stokBaru[i]);
        }
        System.out.println("=======================================");
    }
}
