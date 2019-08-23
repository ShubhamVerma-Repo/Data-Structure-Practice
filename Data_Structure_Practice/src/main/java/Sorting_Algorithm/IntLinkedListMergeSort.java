package Sorting_Algorithm;

public class IntLinkedListMergeSort {

	static Node head;

	public IntLinkedListMergeSort() {
		head = new Node();
		head.value = 0;
		head.next = null;
	}

	public boolean insertIntValue(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
		return true;
	}

	public void printIntList() {
		Node tempNode = head;
		while (tempNode != null) {
			if (tempNode.next == null)
				break;
			System.out.print(tempNode.value + " ");
			tempNode = tempNode.next;
		}
	}

	public Node mergeSort(Node header) {
		if (header == null || header.next == null) {
			return header;
		}
		Node middleNode = findMiddleNode(header);
		Node nextOfMiddleNode = middleNode.next;
		middleNode.next = null;
		Node left = mergeSort(header);
		Node right = mergeSort(nextOfMiddleNode);
		Node sortedList = sortedMerge(left, right);
		return sortedList;
	}

	public Node sortedMerge(Node left, Node right) {
		Node result = null;
		if (left == null)
			return right;
		if (right == null)
			return left;
		if (left.value <= right.value) {
			result = left;
			result.next = sortedMerge(left.next, right);
		} else {
			result = right;
			result.next = sortedMerge(left, right.next);
		}
		return result;
	}

	public Node findMiddleNode(Node startNode) {
		if (startNode == null)
			return null;
		Node slowIterationNode = startNode;
		Node fastIterationNode = startNode.next;
		while (fastIterationNode != null) {
			fastIterationNode = fastIterationNode.next;
			if (fastIterationNode != null) {
				slowIterationNode = slowIterationNode.next;
				fastIterationNode = fastIterationNode.next;
			}
		}
		return slowIterationNode;
	}

	class Node {
		int value;
		Node next;
	}

	public static void main(String[] args) {
		IntLinkedListMergeSort object = new IntLinkedListMergeSort();
		System.out.println(object.insertIntValue(2));
		System.out.println(object.insertIntValue(4));
		System.out.println(object.insertIntValue(1));
		System.out.println(object.insertIntValue(5));
		object.printIntList();
		Node sortedIntList = object.mergeSort(head);
		System.out.println();
		while (sortedIntList.next != null) {
			System.out.print(sortedIntList.next.value + " ");
			sortedIntList = sortedIntList.next;
		}
	}

}
