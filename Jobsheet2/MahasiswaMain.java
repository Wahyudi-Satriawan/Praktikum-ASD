package Jobsheet2;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila", "2141720160",3.25, "TI 2L");
        mhs2.updateIpk(4.30);
        mhs2.tampilkanInformasi();

        System.out.println("==================================");
        Mahasiswa25 mhsWahyu = new Mahasiswa25("Wahyudi Satriawan Hamid", "244107020137", 4.0, "TI 1B");
        mhsWahyu.tampilkanInformasi();
    }
}
