class BSTDriver{
  public static void main(String[] args){
    BST b= new BST();
    b.root = new BSTNode(25);
        System.out.println(b.root.data); 
     
    b.insert(70);
    b.insert(69);
    b.insert(55);
    b.insert(33);
    b.insert(20);
    
    b.preorder();
  }
}
    
    
