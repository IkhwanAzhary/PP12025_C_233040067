package Pertemuan7;

public class Node {
	private int data;
	public Node next;
	
//	Inisialisasi Node
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
//	Setter dan Getter
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
//	Setter untuk next
	public void setNext(Node next) {
		this.next = next;
	}
	
//	Getter untuk next
	public Node getNext() {
		return next;
	}
}
