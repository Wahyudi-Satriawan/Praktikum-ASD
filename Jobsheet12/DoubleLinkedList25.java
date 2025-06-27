package Jobsheet12;

public class DoubleLinkedList25 {
    Node25 head, tail;
    int size;

    public DoubleLinkedList25() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Mahasiswa25 data) {
        Node25 newNode = new Node25(null, data, head);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa25 data) {
        Node25 newNode = new Node25(tail, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter (String keyNim, Mahasiswa25 data) {
        Node25 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM" + keyNim + " tidak ditemukan.");
            return;
        }

        Node25 newNode = new Node25(data);

        if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
        } else {

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (!isEmpty()) {
            Node25 current = head;
            System.out.println("Isi Double Linked List:");
            while (current != null) {
                current.data.tampil();
                System.out.println("----------------------");
                current = current.next;
            }
        } else {
            System.out.println("Linked List kosong.");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Mahasiswa25 dataDihapus = head.data;
    
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
    
            System.out.println("Data sudah berhasil dihapus.");
            System.out.println("Data yang terhapus adalah:");
            dataDihapus.tampil();
        } else {
            System.out.println("Linked List kosong.");
        }
    }
    

    public void removeLast() {
        if (!isEmpty()) {
            if (size == 1) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        } else {
            System.out.println("Linked List kosong.");
        }
    }

    public void removeByKey(String nimKey) {
        Node25 current = head;
        while (current != null && !current.data.nim.equals(nimKey)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + nimKey + " tidak ditemukan.");
        } else if (current == head) {
            removeFirst();
        } else if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void search(String nim) {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }
    
        Node25 current = head;
        boolean ditemukan = false;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                System.out.println("Data ditemukan:");
                current.data.tampil();
                ditemukan = true;
                break;
            }
            current = current.next;
        }
    
        if (!ditemukan) {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
        }
    }
    
    public void add(int index, Mahasiswa25 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar jangkauan!");
            return;
        }
    
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node25 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node25 newNode = new Node25(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeAfter(String nimKey) {
        Node25 current = head;
        while (current != null && !current.data.nim.equals(nimKey)) {
            current = current.next;
        }
    
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM tersebut atau NIM tidak ditemukan.");
        } else {
            Node25 nodeToDelete = current.next;
            if (nodeToDelete == tail) {
                removeLast();
            } else {
                current.next = nodeToDelete.next;
                nodeToDelete.next.prev = current;
                size--;
                System.out.println("Data setelah NIM " + nimKey + " berhasil dihapus.");
            }
        }
    }
    
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar jangkauan!");
            return;
        }
    
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node25 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada index " + index + " berhasil dihapus.");
        }
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.println("Data pertama:");
            head.data.tampil();
        } else {
            System.out.println("List kosong.");
        }
    }
    
    public void getLast() {
        if (!isEmpty()) {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("List kosong.");
        }
    }
    
    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar jangkauan!");
            return;
        }
        Node25 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }
    
    
    
}
