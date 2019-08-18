class BST{
  BSTNode root;
  
  
 public void insert(int key){
   if(root==null)
      root= new BSTNode(key);
    else
       root.insert(key);
    }
    
 public void preorder(){
   if(root==null)
      return;
   else
      root.preorder();
   }
}
