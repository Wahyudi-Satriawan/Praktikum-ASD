package Jobsheet9;

public class Surat25 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' atau 'I'
    int durasi;

    public Surat25(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println("ID Surat   : " + idSurat);
        System.out.println("Nama       : " + namaMahasiswa);
        System.out.println("Kelas      : " + kelas);
        System.out.println("Jenis Izin : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi     : " + durasi + " hari");
    }
}
