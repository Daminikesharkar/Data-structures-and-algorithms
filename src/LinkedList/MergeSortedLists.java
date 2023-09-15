package LinkedList;
public class MergeSortedLists {
    public LinkedListCreation.Node mergeSortedLists(LinkedListCreation l1, LinkedListCreation l2){

        LinkedListCreation.Node node = new LinkedListCreation.Node(0);
        LinkedListCreation.Node current = node;

        LinkedListCreation.Node list1 = l1.head;
        LinkedListCreation.Node list2 = l2.head;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            }else{
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }
        while (list1!=null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }
        while(list2!=null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }
        return node.next;
    }

    public static void main(String[] args) {
        MergeSortedLists m = new MergeSortedLists();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(4);

        l1.displayList(l1.head);
        System.out.println();

        LinkedListCreation l2 = new LinkedListCreation();
        l2.insertNode(1);
        l2.insertNode(3);
        l2.insertNode(4);
        l2.insertNode(5);

        l2.displayList(l2.head);

        System.out.println();
        System.out.print("Merged list is: ");
        l1.head = m.mergeSortedLists(l1,l2);
        l1.displayList(l1.head);
    }
}
