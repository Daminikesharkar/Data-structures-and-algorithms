package LinkedList;
public class ReverseList {
    public void reverseList(LinkedListCreation l){
        LinkedListCreation.Node current = l.head;
        LinkedListCreation.Node prev = null;
        LinkedListCreation.Node next = null;

        if(l.head == null){
            System.out.println("List is empty");
            return;
        }
        while (current!=null ){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        l.head = prev;
    }
    public static void main(String[] args) {
        ReverseList r = new ReverseList();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(4);
        l1.insertNode(2);
        l1.insertNode(5);
        l1.insertNode(2);

        l1.displayList(l1.head);

        System.out.println();
        System.out.println("Reversed LinkedList");
        r.reverseList(l1);
        l1.displayList(l1.head);
    }
}
