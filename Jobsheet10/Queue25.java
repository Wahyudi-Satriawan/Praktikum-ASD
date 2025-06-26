package Jobsheet10;

public class Queue25 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue25(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue penuh!");
            return false;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = dt;
        size++;
        return true;
    }
    
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        int temp = data[front];
        for (int i = front; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        size--;
        return temp;
    }
    
    
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println("\nJumlah elemen = " + size);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue dikosongkan");
    }
}
