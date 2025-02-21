package Jobsheet2;

public class DosenMain25 {
    public static void main(String[] args) {
        Dosen25 dosen1 = new Dosen25();
        dosen1.idDosen = "WSH";
        dosen1.nama = "Wahyudi Satriawan H";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Data Science";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("AI Engineer");
        System.out.println("==== Tampilan Informasi Yang Telah Diupdate ====");
        System.out.println("================================================");
        dosen1.tampilkanInformasi();
        
        Dosen25 dosen2 = new Dosen25("ACH", "PRAKALSD", false, 2000, "AI");
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2);
        dosen2.ubahKeahlian("AI Engginer");
        System.out.println("==== Tampilan Informasi Yang Telah Diupdate ====");
        System.out.println("================================================");
        dosen2.tampilkanInformasi();
    }
}
