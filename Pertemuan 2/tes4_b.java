package Pertemuan2;

public class tes_4b {
	public static void main(String [] args) {
		
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(5);
		Node n4 = new Node(7);
		Node n5 = new Node(9);
		
		
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		Node p =n1;
		while (p != null) {
			while (p != null) {
				System.out.print(p.getNilai() + " ");
				p = p.getNext();
			}
		}
	}

}
