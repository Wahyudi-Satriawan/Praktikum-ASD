package Jobsheet14;

public class BinaryTree25 {
    Node25 root;

    public BinaryTree25() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add (Mahasiswa25 mahasiswa) {
        Node25 newNode = new Node25 (mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else{
            Node25 current = root;
            Node25 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find (double ipk) {
        boolean result = false;
        Node25 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder (Node25 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder (node.left);
            traversePreOrder (node.right);
        }
    }

    void traverseInOrder (Node25 node) {
        if (node != null) {
            traverseInOrder (node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder (node.right);
        }
    }

    void traversePostOrder (Node25 node) {
        if (node != null) {
            traversePostOrder (node.left);
            traversePostOrder (node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node25 getSuccessor (Node25 del) {
        Node25 successor = del.right;
        Node25 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete (double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node25 parent = root;
        Node25 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            } else {
                Node25 successor = getSuccessor (current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa25 data) {
        root = tambahRekursif(root, data);
    }
    
    public Node25 tambahRekursif(Node25 current, Mahasiswa25 data) {
        if (current == null) {
            return new Node25(data);
        }
    
        if (data.ipk < current.mahasiswa.ipk) {
            current.left = tambahRekursif(current.left, data);
        } else {
            current.right = tambahRekursif(current.right, data);
        }
    
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
    
        Node25 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }
    
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
    
        Node25 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtasRecursive(root, ipkBatas);
    }
    
    private void tampilMahasiswaIPKdiAtasRecursive(Node25 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRecursive(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasRecursive(node.right, ipkBatas);
        }
    }
    
    
    
}
