package Pertemuan7;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ListMatakuliah list = new ListMatakuliah();
		Scanner sc = new Scanner(System.in);
		
		int x, sks, posisi;
		String kode, nama;
		
		do {
			System.out.println("\n Menu Matakuliah");
			System.out.println("1. Tambah di Awal (Head)");
			System.out.println("2. Tambah di Tengah (mid)");
			System.out.println("3. Tambah di Akhir (Tail)");
			System.out.println("4. Hapus di Awal (Head)");
			System.out.println("5. Hapus di Tengah (Mid)");
			System.out.println("6. Hapus di Akhir (Tail)");
			System.out.println("7. Hitung Jumlah Matakuliah");
			System.out.println("8. Cari Matakuliah (Find)");
			System.out.println("0. Keluar");
			System.out.print("Pilih menu: ");
			x= sc.nextInt();
			
			switch (x) {
			case 1:
				System.out.print("Kode: ");
				kode = sc.next();
				System.out.print("Nama: ");
				nama = sc.next();
				System.out.print("SKS: ");
				sks = sc.nextInt();
				list.addHead(new Matakuliah(kode, nama, sks));
				list.displayElement();
				break;
				
			case 2:
				System.out.print("Kode: ");
				kode = sc.next();
				System.out.print("Nama: ");
				nama = sc.next();
				System.out.print("SKS: ");
				sks = sc.nextInt();
				System.out.print("Posisi: ");
				posisi = sc.nextInt();
				list.addMid(new Matakuliah(kode, nama, sks), posisi);
				list.displayElement();
				break;
				
			case 3:
				System.out.print("Kode: ");
				kode = sc.next();
				System.out.print("Nama: ");
				nama = sc.next();
				System.out.print("SKS: ");
				sks = sc.nextInt();
				list.addTail(new Matakuliah(kode, nama, sks));
				list.displayElement();
				break;
				
			case 4:
				list.removeHead();
				list.displayElement();
				break;
				
			case 5:
				System.out.print("Masukan Kode yang ingin dihapus: ");
				kode = sc.next();
				list.removeMid(kode);
				list.displayElement();
				break;
				
			case 6:
				list.removeTail();
				list.displayElement();
				break;
				
			case 7:
				System.out.println("Jumlah Matakuliah: " + list.count());
				break;
			
			case 8:
				System.out.print("Cari kode Matakuliah: ");
				kode = sc.next();
				System.out.println(list.find(kode));
				break;
			}
		} while (x != 0);
		
		sc.close();
	}
}
