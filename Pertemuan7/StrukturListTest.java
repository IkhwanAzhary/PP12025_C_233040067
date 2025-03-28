package Pertemuan7;

public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(5);
		list.addTail(4);
		list.addTail(6);
		
		System.out.println("Tampilkan list saat ini: ");
		list.displayElement();
		
//		Cari angka 6 dan tampilkan hasilnya
		System.out.println(list.find(6));
		
		System.out.println();
		
		list = new StrukturList();
		list.addTail(7);
		list.addTail(6);
		list.addTail(4);
		list.addTail(2);
		list.addTail(3);
		
		System.out.println("Tampilkan list saat ini: ");
		list.displayElement();
		
//		Tampilkan size elemen list
		System.out.println(list.size());
		
		System.out.println();
		
		list = new StrukturList();
		list.addTail(4);
		list.addTail(3);
		list.addTail(7);
		list.addTail(8);
		list.addTail(1);
		list.addTail(9);
		
		System.out.println("Tampilkan list saat ini: ");
		list.displayElement();
		
		list.clear();
		
		System.out.println("Tampilkan list setelah dihapus: ");
		list.displayElement();
	}
}