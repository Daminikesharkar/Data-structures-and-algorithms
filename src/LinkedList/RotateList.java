package LinkedList;
public class RotateList {
    public void rotateList(LinkedListCreation l,int k){
        LinkedListCreation.Node current = l.head;
        int count = 1;

        while(current.next!=null){
            count++;
            current = current.next;
        }
        current.next = l.head;

        k = k % count;
        int index = (count - k - 1);

        current = l.head;
        while (index-- != 0){
            current = current.next;
        }
        l.head = current.next;
        current.next = null;
    }
    public static void main(String[] args) {
        RotateList r = new RotateList();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(4);
        l1.insertNode(5);

        l1.displayList(l1.head);

        System.out.println();
        System.out.print("List after 2 rotations: ");
        r.rotateList(l1,2);
        l1.displayList(l1.head);
    }
}
