public class DoublyLinkedList {
    Node head;
     static Node tail;
    DoublyLinkedList(){
        head=null;
        tail=null;
    }
     class Node {
        Node prev;
        int data;
        Node next;

        Node(int val) {
            prev = null;
            data = val;
            next = null;
        }
    }
        void insert(int val){
            Node nn = new Node(val);
            if(head==null){
                head=nn;
                tail=head;
            }
            else{
                nn.next=head;
                head.prev=nn;
                head=nn;
            }
        }
        void insertatpos(int pos,int val){

        Node nn = new Node(val);
        Node temp=head;
        for(int i = 1;i<pos-1;i++){
            temp = temp.next;
        }
        if(temp.next==null){
            temp.next=nn;
            nn.next=null;
        }
        else {
            nn.next = temp.next;
            nn.next.prev = nn;
            temp.next = nn;
            nn.prev=temp;
        }
    }

    void delete(int pos){
        Node temp=head;
        for(int i = 1 ;i<pos;i++){
            temp=temp.next;
        }temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
    void display(){
        Node temp=head;
        while(temp != null){
        System.out.println(temp.data);
        temp=temp.next;
        }
    }
    void reverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert(5);
        dl.insert(4);
        dl.insert(4);
        dl.insert(2);
        dl.insert(1);
        dl.insertatpos(3,3);
        dl.delete(4);
       // System.out.println(tail.data);
        dl.display();
        System.out.println("reversing Doubly Linked List");
        dl.reverse();
    }
}
