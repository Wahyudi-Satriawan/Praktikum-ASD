package Jobsheet9;

public class StackTugasMahasiswa25 {
    Mahasiswa25[] stack;
    int size;
    int top;

    public StackTugasMahasiswa25(int size) {
        this.size = size;
        stack = new Mahasiswa25[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa25 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh. Tidak bisa menambahkan data.");
        }
    }

    public Mahasiswa25 pop() {
        if (!isEmpty()) {
            Mahasiswa25 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Mahasiswa25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Mahasiswa25 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    public int count() {
        return top + 1;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println("Mahasiswa ke-" + (i + 1));
                stack[i].tampil();
                System.out.println("-------------------");
            }
        } else {
            System.out.println("Stack kosong.");
        }
    }

    public String konversiDesimalKeBiner (int nilai) {
        StackKonversi25 stack = new StackKonversi25();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}
