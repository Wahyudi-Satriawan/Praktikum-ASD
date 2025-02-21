package Jobsheet2;

public class Dosen25 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen25(){
    }

    public Dosen25(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status          : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.print("\n");
    }
    
    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("=============== SKS telah diubah ===============");
    }

    void hitungMasaKerja(int thnSkrg){
        thnSkrg -= tahunBergabung;
        tahunBergabung = thnSkrg;
        System.out.println("Telah bekerja selama " + tahunBergabung + " tahun");
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
