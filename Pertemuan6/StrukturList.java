package Pertemuan6;

public class StrukturList {
	private Node HEAD;
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public void addHead(int data) {
		Node newNode = new Node(data);
		newNode.setNext(HEAD);
		HEAD = newNode;
	}
	
	public void addMid(int data, int position) {
		Node newNode = new Node(data);
		
		if (HEAD == null || position == 1) {
			addHead(data);
			return;
		}
		
		Node curNode = HEAD;
		int i = 1;
		
		while (curNode.next != null && i < position - 1) {
			curNode = curNode.next;
			i++;
		}
		
		newNode.next = curNode.next;
		curNode.next = newNode;
	}
	
	public void addTail(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
			return;
		}
		
		Node curNode = HEAD;
		while (curNode.next != null) {
			curNode = curNode.next;
		}
		
		curNode.next = newNode;
	}
	
	private void dispose(Node temp) {
		temp.setNext(null);
		temp = null;
	}
	
	public void removeHead() {
		if(isEmpty()) {
			System.out.println("List Kosong!");
		} else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}
	
	public void removeMid() {
		if (isEmpty()) {
			System.out.println("List Kosong!");
			return;
		}
		
		if (HEAD.next == null) {
			removeHead();
			return;
		}
		
		Node tempNode = HEAD;
		Node preNode = null;
		int count = 0;
		
//		Hitung total elemen di dalam list
		while (tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		
		int midPos = count / 2;
		
		tempNode = HEAD;
		preNode = null;
		int i = 0;
		
//		Loop sampai posisi tengah
		while (i < midPos) {
			preNode = tempNode;
			tempNode = tempNode.getNext();
			i++;
		}
		
//		Hapus node tengah
		preNode.setNext(tempNode.getNext());
		
//		Bebasin memori
		tempNode.setNext(null);
		tempNode = null;
	}
	
	public void removeTail() {
		if(isEmpty()) {
			System.out.println("List Kosong!");
			return;
		}
		
		if(HEAD.next == null) {
			HEAD = null;
			return;
		}
		
		Node lastNode = HEAD;
		Node preNode = null;
		
		while (lastNode.next != null) {
			preNode = lastNode;
			lastNode = lastNode.next;
		}
		
		preNode.next = null;
		dispose(lastNode);
	}
	
	public boolean find(int x) {
		Node curNode = HEAD;
		boolean ketemu = false;
		
		while (curNode != null && !ketemu) {
			if (curNode.getData() == x)
				ketemu = true;
			else
				curNode = curNode.getNext();
		}
		return ketemu;
	}
	
	public int size() {
		Node curNode = HEAD;
		int jumlah = 0;
		
		while (curNode != null) {
			jumlah++;
			curNode = curNode.next;
		}
		
		return jumlah;
	}
	
	public void displayElement() {
		if (isEmpty()) {
			System.out.println("List Kosong!");
			return;
		}
		
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
		System.out.println();
	}
	
	public void clear() {
		Node curNode = HEAD;
		
		while (curNode != null) {
			Node temp = curNode;
			curNode = curNode.next;
			temp.next = null;
		}
		
		HEAD = null;
	}
}
