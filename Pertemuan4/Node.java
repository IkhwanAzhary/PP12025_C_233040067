package Pertemuan4;

public class Node {
		private double data;
		public Node next;
		
//		Inisialisasi Node
		public Node(double data) {
			this.data = data;
			this.next = null;
		}
		
//		Setter and Getter
		public void setData(double data) {
			this.data = data;
		}
		
		public double getData() {
			return data;
		}
		
//		Setter untuk next
		public void setNext(Node next) {
			this.next = next;
		}
		
//		Getter untuk next
		public Node getNext() {
			return next;
		}
}
