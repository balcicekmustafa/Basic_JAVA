package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BTree bt=new BTree();
		bt.root=bt.insert(bt.root, 10);
		bt.root=bt.insert(bt.root, 8);
		bt.root=bt.insert(bt.root, 15);
		bt.root=bt.insert(bt.root, 5);
		bt.root=bt.insert(bt.root, 12);
		bt.root=bt.insert(bt.root, 20);
		bt.root=bt.insert(bt.root, 9);
		System.out.println("Kökün Datası:"+bt.root.data);
		System.out.println("Köküni Sağındak Datası:"+bt.root.right.data);
		System.out.println("Kökün Solundaki Datası:"+bt.root.left.data);
		System.out.println("preorder: ");
		bt.preOrder(bt.root);
		
		System.out.println("inorder: ");
		bt.inOrder(bt.root);
	}

}
