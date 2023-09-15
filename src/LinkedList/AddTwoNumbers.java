package LinkedList;
public class AddTwoNumbers {
    public LinkedListCreation.Node addTwoNumbers(LinkedListCreation l1,LinkedListCreation l2){

        LinkedListCreation.Node node = new LinkedListCreation.Node(0);
        LinkedListCreation.Node current = node;

        LinkedListCreation.Node list1 = l1.head;
        LinkedListCreation.Node list2 = l2.head;
        int carry = 0;

        while(list1 != null || list2 != null || carry == 1){
            int sum = 0;

            if(list1 != null){
                sum = sum+list1.data;
                list1 = list1.next;
            }
            if(list2 != null){
                sum = sum+list2.data;
                list2 = list2.next;
            }

            sum = sum + carry;
            carry = sum / 10;

            LinkedListCreation.Node newNode = new LinkedListCreation.Node(sum%10);
            current.next = newNode;
            current = current.next;
        }
        return node.next;
    }
    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();

        LinkedListCreation l1 = new LinkedListCreation();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(4);

        l1.displayList(l1.head);
        System.out.println();

        LinkedListCreation l2 = new LinkedListCreation();
        l2.insertNode(1);
        l2.insertNode(9);
        l2.insertNode(4);

        l2.displayList(l2.head);
        System.out.println();

        l1.head = a.addTwoNumbers(l1,l2);
        l1.displayList(l1.head);
    }
}
