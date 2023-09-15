package LinkedList;
public class DetectCycle {
    public void detectLoop(LinkedListCreation l){
        LinkedListCreation.Node slow = l.head;
        LinkedListCreation.Node fast = l.head;
        LinkedListCreation.Node start = l.head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast){
                while(slow != start){
                    slow = slow.next;
                    start = start.next;
                }
                System.out.println("Loop is present at: "+slow.data);
                return;
            }
        }
        System.out.println("Loop is not present");
    }
    public static void main(String[] args) {
        DetectCycle d = new DetectCycle();
        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(4);

        l1.displayList(l1.head);
        System.out.println();

        l1.head.next.next = l1.head.next;
        d.detectLoop(l1);
    }
}