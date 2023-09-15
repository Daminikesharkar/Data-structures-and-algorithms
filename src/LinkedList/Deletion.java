package LinkedList;
public class Deletion {
    public LinkedListCreation.Node deleteFirstNode(LinkedListCreation.Node head){
        LinkedListCreation.Node current = head;
        head = head.next;
        current.next = null;
        return head;
    }
    public LinkedListCreation.Node deleteLastNode(LinkedListCreation.Node head){
        LinkedListCreation.Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }
    public LinkedListCreation.Node deleteInBetween(LinkedListCreation.Node head,int pos){
        LinkedListCreation.Node current = head;
        int count = 0;

        while(current!=null && count!=pos){
            current = current.next;
            count++;
        }
        if(current == null){
            System.out.println("Index out of bound");
            return head;
        }
        current.next = current.next.next;
        return head;
    }
    public static void main(String[] args) {
        Deletion d = new Deletion();
        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(4);
        l1.insertNode(1);
        l1.insertNode(5);
        l1.insertNode(2);
        LinkedListCreation.Node head = l1.insertNode(3);

        System.out.print("Required list is ");
        l1.displayList(head);

        System.out.print("List after deleting first node ");
        head = d.deleteFirstNode(head);
        l1.displayList(head);

        System.out.println();
        System.out.print("List after deleting last node ");
        head = d.deleteLastNode(head);
        l1.displayList(head);

        System.out.println();
        System.out.print("List after deleting node at specific position ");
        head = d.deleteInBetween(head,2);
        l1.displayList(head);
    }
}
