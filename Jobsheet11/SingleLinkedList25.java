package Jobsheet11;

public class SingleLinkedList25 {
    Node25 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node25 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa25 input) {
        Node25 newNode = new Node25(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa25 input) {
        Node25 newNode = new Node25(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter (String key, Mahasiswa25 input) {
        Node25 ndInput = new Node25 (input);
        Node25 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase (key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void InsertAt(int index, Mahasiswa25 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node25 tmp = head;
            for (int i = 1; i < index && tmp != null; i++) {
                tmp = tmp.next;
            }
            if (tmp != null) {
                Node25 newNode = new Node25(input);
                newNode.next = tmp.next;
                tmp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
            } else {
                System.out.println("Index di luar batas.");
            }
        }
    }

    public Mahasiswa25 get(int index) {
        Node25 tmp = head;
        int i = 0;
        while (tmp != null) {
            if (i == index) {
                return tmp.data;
            }
            tmp = tmp.next;
            i++;
        }
        return null;
    }
    
    public int indexOf(String nama) {
        Node25 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data.nama.equalsIgnoreCase(nama)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }
    
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            System.out.println("Linked list kosong, tidak bisa menghapus.");
        }
    }
    
    public void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node25 tmp = head;
                while (tmp.next != tail) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp;
            }
        } else {
            System.out.println("Linked list kosong.");
        }
    }
    
    public void removeByKey(String nim) {
        if (!isEmpty()) {
            if (head.data.nim.equals(nim)) {
                removeFirst();
                return;
            }
    
            Node25 prev = head;
            Node25 curr = head.next;
    
            while (curr != null && !curr.data.nim.equals(nim)) {
                prev = curr;
                curr = curr.next;
            }
    
            if (curr != null) {
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
            } else {
                System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
            }
        } else {
            System.out.println("Linked list kosong.");
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node25 prev = head;
            for (int i = 1; i < index && prev.next != null; i++) {
                prev = prev.next;
            }

            if (prev.next != null) {
                Node25 removed = prev.next;
                prev.next = removed.next;
                if (removed == tail) {
                    tail = prev;
                }
            } else {
                System.out.println("Index di luar jangkauan.");
            }
        }
    }

}
 