class BSTNode{
   int data;
   BSTNode left;
   BSTNode right;
   public BSTNode() {};
   public BSTNode(int d){
     this.data=d;
     }
   
   
public void insert(int key){
	if(key<data){
		if(left==null)
			left = new BSTNode(key);
		else
		     left.insert(key);
		 }
     else{
		 if(right==null)
		     right= new BSTNode(key);
		   else
		       right.insert(key);
		   }
	}
	
public void preorder(){
	System.out.print(data + " ");
	if(left!=null)
	   left.preorder();
	if(right!=null)
	    right.preorder();
	  }
}
			
