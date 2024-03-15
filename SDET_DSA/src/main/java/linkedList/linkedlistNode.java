package linkedList;
import java.lang.*;

import org.junit.Test;
public class linkedlistNode {

	public class Node {
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public Node addData1(int data) {
		Node node1 = new Node(data);
		return node1;
	}
	public Node addData2(int data) {
		Node node2 = new Node(data);
		return node2;
	}
	public Node addingNodes(int data) {
		
		Node node = new Node(1);
	
		Node second = new Node(3);
		
		node.next = second;
		
		Node third = new Node(5);
		
		second.next = third;
		
		Node fourth = new Node(7);
		
		third.next = fourth;
		
		
		
		return node;
		
	}
	
	
	
	
	
	
	
}
