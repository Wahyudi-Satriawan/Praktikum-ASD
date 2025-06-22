package Jobsheet9;

public class StackSurat25 {
    Surat25[] stack;
    int top;
    int size;

    public StackSurat25(int size) {
        this.size = size;
        stack = new Surat25[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat25 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat25 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println("=== Surat ke-" + (i + 1) + " ===");
                stack[i].tampil();
                System.out.println("-----------------------");
            }
        } else {
            System.out.println("Belum ada surat izin.");
        }
    }
}
