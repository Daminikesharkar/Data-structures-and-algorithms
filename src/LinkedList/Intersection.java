package LinkedList;
public class Intersection {
    public void intersectionPoint(LinkedListCreation l1,LinkedListCreation l2){
        int diff = lengthDifference(l1,l2);
        LinkedListCreation.Node head1 = l1.head;
        LinkedListCreation.Node head2 = l2.head;

        if(diff<0){
            while(diff != 0){
                head2 = head2.next;
                diff++;
            }
        }else{
            while (diff != 0){
                head1 = head1.next;
                diff--;
            }
        }
        while(head1!=null){
            System.out.println(head1.data+" "+head2.data);
            if(head1 == head2){
                System.out.println("Intersection present: "+head1.data);
                return;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        System.out.println("Intersection not present");
    }
    public int lengthDifference(LinkedListCreation l1,LinkedListCreation l2){
        int len1 =0;
        int len2 = 0;

        LinkedListCreation.Node head1 = l1.head;
        LinkedListCreation.Node head2 = l2.head;

        while(head1!=null){
            len1++;
            head1 = head1.next;
        }
        while (head2!=null){
            len2++;
            head2 = head2.next;
        }
        return len1 - len2;
    }


    public static void main(String[] args) {
        Intersection i = new Intersection();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(4);
        l1.insertNode(1);
        l1.insertNode(8);
        l1.insertNode(4);
        l1.insertNode(5);

        l1.displayList(l1.head);
        System.out.println();

        LinkedListCreation l2 = new LinkedListCreation();
        l2.insertNode(5);
        l2.insertNode(6);
        l2.insertNode(1);
        l2.insertNode(8);
        l2.insertNode(4);
        l2.insertNode(5);

        l2.displayList(l2.head);
        System.out.println();
        i.intersectionPoint(l1,l2);

    }
}
