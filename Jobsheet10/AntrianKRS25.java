package Jobsheet10;

public class AntrianKRS25 {
    Mahasiswa25[] data;
    int front, rear, size, max;
    int totalDiproses = 0;
    final int KUOTA = 30;

    public AntrianKRS25(int max) {
        this.max = max;
        data = new Mahasiswa25[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Mahasiswa25 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = mhs;
        size++;
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk diproses.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa25 keluar = data[front];
            keluar.tampilkanData();
            System.out.println("-------------------");
            for (int j = front; j < rear; j++) {
                data[j] = data[j + 1];
            }
            rear--;
            size--;
            totalDiproses++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println("Antrian ke-" + (i + 1));
                data[i].tampilkanData();
                System.out.println("-------------------");
            }
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 antrian");
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            data[front].tampilkanData();
            System.out.println("-------------------");
            data[front + 1].tampilkanData();
        }
    }

    public void tampilkanBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void jumlahProses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses: " + totalDiproses);
        System.out.println("Jumlah mahasiswa yang belum diproses (maks 30): " + (KUOTA - totalDiproses));
    }
}
