package Pertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Pengujian untuk menghasilkan deret 5 3 8 7 4
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addHead(5);
        System.out.println("Output untuk deret Latihan 3:");
        list.displayElement(); // Output: 5.0 3.0 8.0 7.0 4.0

        // Pengujian untuk menghasilkan deret (a) 2.1 3.4 4.5
        list = new StrukturList(); // Reset list
        list.addTail(4.5);
        list.addMid(3.4, 1);
        list.addHead(2.1);
        System.out.println("Output untuk deret Tugas a:");
        list.displayElement(); // Output: 2.1 3.4 4.5

        // Pengujian untuk menghasilkan deret (b) 3.4 2.1 1.1 4.5 5.5
        list = new StrukturList(); // Reset list
        list.addTail(4.5);
        list.addTail(5.5);
        list.addMid(1.1, 1);
        list.addMid(2.1, 1);
        list.addHead(3.4);
        System.out.println("Output untuk deret Tugas B:");
        list.displayElement(); // Output: 3.4 2.1 1.1 4.5 5.5
    }
}
