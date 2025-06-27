package Jobsheet14;

public class BinaryTreeArray25 {
    Mahasiswa25[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray25() {
        dataMahasiswa = new Mahasiswa25[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa25[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(Mahasiswa25 data) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i] == null) {
                dataMahasiswa[i] = data;
                idxLast = i;
                return;
            }
        }
        System.out.println("Tree penuh, tidak bisa menambahkan data.");
    }
    
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1); // kiri
            traversePreOrder(2 * idxStart + 2); // kanan
        }
    }
    
    
}
