
public class Linkedlist {
    Node head;
    Linkedlist(){
        head=null;
    }

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    void insert(int val){
        Node nn = new Node( val);
        if(head == null){
            head = nn;
        }
        else{

            nn.next=head;
            head=nn;
        }
    }

    void insertatpos(int pos,int val){
        Node nn = new Node(val);
        Node temp=head;
        for(int i = 1 ;i<pos ;i++){
            temp=temp.next;
        }nn.next=temp.next;
        temp.next=nn;
    }
    void delete(int pos){

        Node temp = head,prev = null;

        if(pos==1){
            head=head.next;
        }
        else {
            for (int i = 1; i < pos; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Linkedlist ll = new Linkedlist();
        ll.insert(6);
        ll.insert(5);
        ll.insert(4);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        ll.insertatpos(7,7);
        ll.delete(4);
        ll.display();
    }
}
