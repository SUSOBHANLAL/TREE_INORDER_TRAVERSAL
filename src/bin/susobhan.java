package bin;
class node{
	int key;
	node left;
	node right;
	node(int key){
		this.key= key;
		left = null;
		right = null;
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root = new node(20);
		root.left = new node(30);
		root.right = new node(70);
		root.left.left= new node(60);
		inorder(root);
	}
	
	public static void inorder(node  root) {
		if(root!=null) {
			inorder(root.left);        //first ->left second->root third->right
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}
	
	

}
