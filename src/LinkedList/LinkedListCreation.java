package LinkedList;
public class LinkedListCreation {
    //inner class to create Node structure
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public Node insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        Node current = head;

        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    public void displayList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
            LinkedListCreation l1 = new LinkedListCreation();
            l1.insertNode(1);
            l1.insertNode(2);
            l1.insertNode(3);
            l1.insertNode(4);
            l1.insertNode(5);

            System.out.print("Required list is ");
            l1.displayList(l1.head);
    }
}
