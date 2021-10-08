package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);	
		
		System.out.print("In-Order : ");
		intTree.traverseInOrder();
		System.out.println();
		System.out.println(intTree.get(20));
		System.out.println(intTree.get(26));
		System.out.println(intTree.get(17));
		System.out.print("Minimum Value : ");
		System.out.println(intTree.min());
		System.out.print("Maximum Value : ");
		System.out.println(intTree.max());
	}

}
