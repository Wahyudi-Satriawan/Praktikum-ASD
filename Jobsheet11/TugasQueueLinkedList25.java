package Jobsheet11;

public class TugasQueueLinkedList25 {
    TugasNode25 front, rear;
    int size = 0;
    int kapasitas = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == kapasitas;
    }

    public void enqueue(TugasMahasiswa25 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        TugasNode25 newNode = new TugasNode25(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public TugasMahasiswa25 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        TugasMahasiswa25 mhs = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return mhs;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian:");
            TugasNode25 current = front;
            int no = 1;
            while (current != null) {
                System.out.println("Antrian ke-" + no++);
                current.data.tampil();
                System.out.println("-------------------");
                current = current.next;
            }
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public int getSize() {
        return size;
    }
}
