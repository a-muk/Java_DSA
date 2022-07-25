package LinkedList;

public class DoublyLinkedList {
    Node head;
    public void insert(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;

    }
    public void display(){
        Node node=head;
        while(node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) { //a new constructor
            //is created over here becoz we need to take care of the next and
            //prev values as well.
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
