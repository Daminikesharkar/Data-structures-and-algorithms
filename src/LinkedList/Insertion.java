package LinkedList;
public class Insertion {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertBack(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        newNode.next=current;
        head = newNode;
    }
    public void insertInBetween(int data,int pos){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;
        while (current!=null && count != pos){
            current = current.next;
            count++;
        }

        if(current == null){
            System.out.println("Index out of bound");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void displayList(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while (current != null){
            System.out.print(current.data +" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Insertion l1 = new Insertion();
        l1.insertBack(1);
        l1.insertFront(2);
        l1.insertBack(3);
        l1.insertInBetween(4,2);

        System.out.print("Required list is ");
        l1.displayList();
    }
}
