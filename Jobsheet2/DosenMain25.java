package Jobsheet2;

public class DosenMain25 {
    public static void main(String[] args) {
        Dosen25 dosen1 = new Dosen25();
        dosen1.idDosen = "WSH";
        dosen1.nama = "Wahyudi Satriawan H";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 1995;
        dosen1.bidangKeahlian = "Machine Learning";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Deep Learning");
        
        Dosen25 dosen2 = new Dosen25("AD", "Satria Hadi", false, 2000, "Cyber Security");
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Ethical Hacking");
    }
}
