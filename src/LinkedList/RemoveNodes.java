package LinkedList;
public class RemoveNodes {
    public void removeNodes(LinkedListCreation l,int val){
        LinkedListCreation.Node current = l.head;
        if(l.head == null){
            return;
        }
        while(current.next!=null && current.next.data != val){
            current = current.next;
        }

        while (current!=null && current.next!=null){
            if(current.next.data == val){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }
    public void removeNode(LinkedListCreation.Node node){
            if(node == null || node.next == null){
                return;
            }
            node.data = node.next.data;
            node.next = node.next.next;
    }
    public static void main(String[] args) {
        RemoveNodes r = new RemoveNodes();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(4);
        l1.insertNode(2);
        l1.insertNode(5);
        l1.insertNode(2);

        l1.displayList(l1.head);
        r.removeNodes(l1,2);

        System.out.println();
        System.out.print("LinkedList after removing nodes with value 2: ");
        l1.displayList(l1.head);

        System.out.println();
        System.out.print("Linked list after removing node with value 4: (passes as a single node) ");
        r.removeNode(l1.head.next.next.next);
        l1.displayList(l1.head);
    }
}
