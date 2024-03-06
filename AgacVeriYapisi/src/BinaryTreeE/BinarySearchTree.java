package BinaryTreeE;

public class BinarySearchTree {
	Node root;
	public void insert(int value) {
		root=insertRec(root,value);
	}
	private Node insertRec(Node root,int value) {
		if(root==null) {
			root=new Node(value);
			return root;
		}
		if(value<root.data) {
			root.left=insertRec(root.left,value);
		}
		else if (value>root.data) {
			root.right=insertRec(root.right,value);			
		}
		return root;
	}
	public boolean search(int value) {
		return searchRec(root,value);
	}
	private boolean searchRec(Node root,int value) {
		if (root==null) {
			return false;
		}
		if(root.data==value) {
			return true;
		}
		return value < root.data ? searchRec(root.left, value) : searchRec(root.right, value); 
	}
	private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);}
        }public void inorder() {
            inorderRec(root);
        }
        public void preorder() {
            preorderRec(root);
        }

        private void preorderRec(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }

        // Ağacın tamamını postorder (LRN) sırasına göre yazdırmak için
        public void postorder() {
            postorderRec(root);
        }

        private void postorderRec(Node root) {
            if (root != null) {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.data + " ");
            }
        }
}
