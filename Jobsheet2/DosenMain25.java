package Jobsheet2;

public class DosenMain25 {
    public static void main(String[] args) {
        Dosen25 mhs1 = new Dosen25();
        mhs1.idDosen = "ALSD";
        mhs1.nama = "Algoritma dan Struktur Data";
        mhs1.statusAktif = true;
        mhs1.tahunBergabung = 2000;
        bidangKeahlian = "Data Science";

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
