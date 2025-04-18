package Pertemuan7;

public class ListMatakuliahTest {
	public static void main(String[] args) {
		ListMatakuliah list = new ListMatakuliah();
		
		list.addHead(new Matakuliah("IF001", "Dasar Pemograman", 4));
		list.addHead(new Matakuliah("IF002", "Pemograman Web", 3));
		list.displayElement();
		System.out.println();
		list.addHead(new Matakuliah("IF001", "Dasar Pemograman", 4));
		list.addHead(new Matakuliah("IF002", "Pemograman Web", 3));
		list.addHead(new Matakuliah("IF003", "Struktur Dikrit", 3));
		list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
		list.displayElement();
	}
}
