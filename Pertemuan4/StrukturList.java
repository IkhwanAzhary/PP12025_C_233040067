package Pertemuan4;

public class StrukturList {
	private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addMid(double data, int position) {
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

    public void addTail(double data) {
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
    
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println(); 
    }
}
