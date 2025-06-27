package Jobsheet12;

public class Node25 {
    Mahasiswa25 data;
    Node25 prev, next;

    public Node25(Node25 prev, Mahasiswa25 data, Node25 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node25(Mahasiswa25 data) {
        this.data = data;
    }
}
