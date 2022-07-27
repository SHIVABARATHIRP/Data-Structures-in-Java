public class reverseLinkedList {
    Node head = null;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    void insert(int val){
        Node nn = new Node(val);
        if(head==null){
            head = nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    void reverse(){
        Node prev=null;
        Node next = null ;
        Node cur=head;

        while(cur != null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
        }
    }

    public static void main(String[] args) {
        reverseLinkedList rr = new reverseLinkedList();
        rr.insert(1);
        rr.insert(2);
        rr.insert(3);
        rr.insert(4);
        rr.insert(5);

        System.out.println("List before reversed");

        rr.display();

        System.out.println("List after reversed");

        rr.reverse();
        rr.display();

    }
}
