package LinkedList;
public class RemoveNthNodeFromEnd {
    public void removeNthNodeFromEnd(LinkedListCreation l,int n){
        LinkedListCreation.Node slow = l.head;
        LinkedListCreation.Node fast = l.head;

        for(int i=0;i<n;i++){
            if(fast == null){
                System.out.println("Out of bound");
                return;
            }
            fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromEnd r = new RemoveNthNodeFromEnd();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(4);
        l1.insertNode(1);
        l1.insertNode(8);
        l1.insertNode(4);
        l1.insertNode(5);

        l1.displayList(l1.head);
        System.out.println();

        System.out.print("List after removing second element from end: ");
        r.removeNthNodeFromEnd(l1,2);
        l1.displayList(l1.head);
    }
}
