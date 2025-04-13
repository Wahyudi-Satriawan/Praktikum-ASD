package Jobsheet7;

public class DataDosen25 {
    Dosen25[] dataDosen = new Dosen25[10];
    int idx = 0;

    void tambah(Dosen25 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen25 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen25 temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }

    void pencarianSequential25(String nama) {
        boolean ditemukan = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                count++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + nama + "'.");
        }
    }


    void pencarianBinary25(int usia) {
        SortingASC();
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        int count = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                int temp = mid;
                while (temp >= 0 && dataDosen[temp].usia == usia) {
                    dataDosen[temp].tampil();
                    count++;
                    temp--;
                }
                temp = mid + 1;
                while (temp < idx && dataDosen[temp].usia == usia) {
                    dataDosen[temp].tampil();
                    count++;
                    temp++;
                }
                ditemukan = true;
                break;
            } else if (usia < dataDosen[mid].usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usia + ".");
        }
    }

}
