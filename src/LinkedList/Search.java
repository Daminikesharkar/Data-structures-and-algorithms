package LinkedList;
public class Search {
    public boolean search(LinkedListCreation l,int val){
        LinkedListCreation.Node current = l.head;
        if(l.head == null){
            return false;
        }
        while (current != null){
            if(current.data == val){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {

        Search s = new Search();
        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(4);
        l1.insertNode(5);

        l1.displayList(l1.head);

        System.out.println();
        System.out.print("Is element present? "+s.search(l1,8));
    }
}
