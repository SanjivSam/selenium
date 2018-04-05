package module1;

import java.util.*;

public class BSTLevelOrderTraversal {
	public static BNode insert(BNode root,int data){
        if(root==null){
            return new BNode(data);
        }
        else{
            BNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            BNode root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            sc.close();
        }
	static void levelOrder(BNode root) {
		// TODO Auto-generated method stub
		Queue<BNode> queue=null;
		queue = new LinkedList<BNode>();
		if(root!=null) {
			queue.add(root);
			while(!queue.isEmpty()) {
				BNode current = queue.remove();
				System.out.println(current.data);
				if(current.left!=null)
					queue.add(current.left);
				if(current.right!=null) 
					queue.add(current.right);
			}
		}
	}	
}
