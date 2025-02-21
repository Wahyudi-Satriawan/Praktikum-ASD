package Jobsheet2;

public class MataKuliah25 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah25(){
    }

    public MataKuliah25(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama             : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
        System.out.print("\n");
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("=============== SKS telah diubah ===============");
    }
    void tambahJam(int jam){
        jumlahJam += jam;

    }
    void kurangiJam(int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("pengurangan tidak dapat dilakukan");
        }

    }
}