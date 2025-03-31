package Jobsheet3;

public class DataDosen25 {
    public static void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        for (Dosen25 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria == 0 ? 0 : (totalUsiaPria / countPria)));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita == 0 ? 0 : (totalUsiaWanita / countWanita)));
    }

    public static void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 tertua = arrayOfDosen[0];
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 termuda = arrayOfDosen[0];
        for (Dosen25 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}
