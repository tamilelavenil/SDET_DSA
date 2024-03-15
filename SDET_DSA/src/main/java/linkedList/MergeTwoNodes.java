package linkedList;
import org.junit.Test;
public class MergeTwoNodes {

	public class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public Node addData1(int data) {
		Node node1 = new Node(data);
		return node1;
	}
	
	public Node addingNodes1(int data) {

		Node node1 = new Node(1);

		Node second = new Node(3);

		node1.next = second;

		Node third = new Node(5);

		second.next = third;

		Node fourth = new Node(7);

		third.next = fourth;

		return node1;

	}

	public Node addData2(int data) {
		Node node2 = new Node(data);
		return node2;
	}

	public Node addingNodes2(int data) {

		Node node2 = new Node(2);

		Node second = new Node(4);

		node2.next = second;

		Node third = new Node(6);

		second.next = third;

		Node fourth = new Node(8);

		third.next = fourth;

		return node2;

	}
	
	public Node mergeTwoLinkedList(Node node1, Node node2) {
		return node2;
		
		
		
	}
}
