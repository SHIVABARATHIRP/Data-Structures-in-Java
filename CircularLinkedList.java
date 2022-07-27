public class CircularLinkedList{
    Node last=null;
    class Node{
        int data ;
     Node next;
     Node(int val){
         data=val;
         next=null;
     }
  }

  // Inserting At End

    void insertAtEnd(int val){
        Node nn =new Node(val);
        if(last==null){
            nn.next=nn;
            last = nn ;
        }
        else{
            nn.next=last.next;
            last.next=nn;
            last=nn;
        }
  }

    // Inserting At Beginning

    void insertAtBeginning(int val){
        Node nn = new Node(val);
      if(last==null){
          nn.next=nn;
          last = nn ;
      }
      else{
          nn.next=last.next;
          last.next=nn;
      }
  }

  // Delete At Begining

  void DeleteAtBeginning() {
      if (last.next == last) {
          last = null;
      } else {
          Node first = last.next;
          last.next = first.next;

      }
  }

  //   Delete At End
    
    void DeleteAtEnd() {
        if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            while(temp.next!=last){
                temp=temp.next;
            }temp.next=last.next;
        }
    }
    void display(){
        Node temp = last.next;
        do{
            System.out.println(temp.data+"");
            temp=temp.next;
        }while(temp!=last.next);
    }

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtBeginning(3);
        cl.insertAtBeginning(2);
        cl.insertAtBeginning(1);
        cl.insertAtBeginning(4);
        cl.insertAtEnd(4);
        cl.insertAtEnd(5);
        cl.insertAtEnd(6);
        cl.insertAtEnd(4);
        cl.DeleteAtBeginning();
        cl.DeleteAtEnd();
        cl.display();
    }
}
