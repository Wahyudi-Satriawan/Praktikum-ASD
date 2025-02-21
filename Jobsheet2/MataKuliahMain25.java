package Jobsheet2;

public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(2);
        mk1.kurangiJam(2);
        System.out.println("==== Tampilan Informasi Yang Telah Diupdate ====");
        System.out.println("================================================");
        mk1.tampilkanInformasi();
        
        MataKuliah25 mk2 = new MataKuliah25("PRAKALSD", "Praktikum Algoritma dan Struktur Data",2, 4);
        mk2.tampilkanInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(2);
        System.out.println("====mk2 Tampilan Informasi Yang Telah Diupdate ====");
        System.out.println("================================================");
        mk2.tampilkanInformasi();
    }
}