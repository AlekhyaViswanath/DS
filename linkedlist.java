class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head;

	//INSERT FUNCTION

	  -//insert at head

	public static void insert(int key){
	   Node temp=new Node();
	   temp.data=key;

	   if(head==null)
	     head=temp;
	   else{
	      temp.next=head;
	      head=temp;
	   }

	}

	  //insert at tail

	public static void insert(int key){
	     Node temp = new Node();
	     temp.data=key;
	     if(head==null)
	       head=temp;
	     else{
	        Node curr=temp;
	        while(curr.next!=null){
	           curr=curr.next;
	         }
	        curr.next=temp;
	        temp.next=null;
	       }  
	   }

	  //insert in between

	public static void insert(int key,int pos){
        Node temp= new Node();
        temp.data=key;
        if(pos=0){
          temp.next=head;
          head= temp;
        }
         else{
           Node curr=head;
           for(int i=0;i<pos-1;i++)
             curr=curr.next;

           temp.next=curr.next;
           curr.next=temp;
           }

       }
      //DELETE

        //delete at head

    public static void delete1(){
       if(head!=null)
         head=head.next;
       else if(head.next==null){
          head=null;
       }
       else
         System.out.println("List is empty");
      }

      //delete at tail

    public static void delete2(){
      if(head!=null){
        Node curr=head;
        while(curr.next.next!=null){
           curr=curr.next;
        }
          curr.next=null;
         }
        else if(head.next==null)
          head=null;
        else
           system.out.println("List is empty")
     }

        //delete in between

    public static void delete3(int key){
            void delete(int key) {
        int pos = search(key); 
        
        if (pos == -1) 
            return;
            
        if (pos == 0)  { 
            head = head.next;
            return;
        }
               
        Node curr = head;
        for (int i=0; i<pos-1; i++)
            curr = curr.next;
        Node temp = curr.next;
        curr.next = temp.next; 
        temp.next = null;
      }
    }

       //size

    public static void size(){

      int size() {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }    
 }

      //print

    public static void print(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
 }

 