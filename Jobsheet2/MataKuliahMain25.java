package Jobsheet2;

public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 mhs1 = new MataKuliah25();
        mhs1.kodeMK = "ALSD";
        mhs1.nama = "Algoritma dan Struktur Data";
        mhs1.sks = 3;
        mhs1.jumlahJam = 6;

        mhs1.tampilkanInformasi();
        mhs1.ubahSKS(2);
        mhs1.kurangiJam(2);
        System.out.println("==== Tampilan Informasi Yang Telah Diupdate ====");
        System.out.println("================================================");
        mhs1.tampilkanInformasi();
        
        MataKuliah25 mhs2 = new MataKuliah25("PRAKALSD", "Praktikum Algoritma dan Struktur Data",2, 4);
        mhs2.tampilkanInformasi();
        mhs1.ubahSKS(3);
        mhs1.tambahJam(2);
        System.out.println("==== Tampilan Informasi Yang Telah Diupdate ====");
        System.out.println("================================================");
        mhs2.tampilkanInformasi();
    }
}