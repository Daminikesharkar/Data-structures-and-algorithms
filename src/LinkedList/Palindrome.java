package LinkedList;

public class Palindrome {

    public boolean palindrome(LinkedListCreation l){

        if(l.head == null){
            return true;
        }
        LinkedListCreation.Node slow = l.head;
        LinkedListCreation.Node fast = l.head;

        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListCreation.Node current = slow.next;
        LinkedListCreation.Node prev = null;
        LinkedListCreation.Node next = null;

        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        slow.next = prev;
        slow = slow.next;
        LinkedListCreation.Node temp = l.head;

        while (slow!=null){
            if(temp.data != slow.data){
                return false;
            }
            slow = slow.next;
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(3);
        l1.insertNode(2);
        l1.insertNode(1);

        l1.displayList(l1.head);

        System.out.println();
        System.out.print("Is List palindrome? ");
        System.out.println(p.palindrome(l1));
    }
}
