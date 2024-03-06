package BinaryTreeE;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder (LNR): ");
        tree.inorder();  // 20 30 40 50 60 70 80
        System.out.println();

        System.out.print("Preorder (NLR): ");
        tree.preorder();  // 50 30 20 40 70 60 80
        System.out.println();

        System.out.print("Postorder (LRN): ");
        tree.postorder();  // 20 40 30 60 80 70 50
        System.out.println();
    

	}
}
