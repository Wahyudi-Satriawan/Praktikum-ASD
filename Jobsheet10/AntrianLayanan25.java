package Jobsheet10;

public class AntrianLayanan25 {
    Mahasiswa25[] data;
    int front, rear, size, max;

    public AntrianLayanan25(int max) {
        this.max = max;
        data = new Mahasiswa25[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
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

    public Mahasiswa25 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa25 temp = data[front];
        for (int i = front; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        size--;
        return temp;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi Antrian:");
            for (int i = front; i <= rear; i++) {
                System.out.println("Mahasiswa ke-" + (i + 1));
                data[i].tampilkanData();
                System.out.println("-------------------");
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
