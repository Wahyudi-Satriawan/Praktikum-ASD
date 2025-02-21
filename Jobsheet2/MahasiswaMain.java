package Jobsheet2;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Wahyudi Satriawan Hamid";
        mhs1.nim = "2241720171";
        mhs1.kelas = "TI 1B";
        mhs1.ipk = 3.7;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 2B");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();
    }
}
