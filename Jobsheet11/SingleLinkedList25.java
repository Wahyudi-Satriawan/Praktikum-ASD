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
}
