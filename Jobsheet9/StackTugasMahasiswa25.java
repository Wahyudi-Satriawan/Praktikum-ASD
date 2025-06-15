package Jobsheet9;

public class StackTugasMahasiswa25 {
    Mahasiswa25[] stack;
    int size, top;
        
    public StackTugasMahasiswa25(int size){
        this.size = size;
        stack = new Mahasiswa25[size];
        top = -1;
    }
    
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if (top == - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push (Mahasiswa25 mhs) {
        if (!isFull()) {
            top ++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa25 pop() {
        if (!isEmpty()) {
            Mahasiswa25 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}