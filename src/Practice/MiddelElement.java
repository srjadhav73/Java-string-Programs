package Practice;
class ListNode 
{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList 
{
    private ListNode head;
    public LinkedList() {
        head = null;
    }

    // Method to add a new node to the end of the linked list
    public void append(int data) 
    {
        ListNode newNode = new ListNode(data);
        System.out.println("New Node----> "+newNode.data);
        if (head == null) 
        {
        	System.out.println("if condition call in head");
            head = newNode;
            System.out.println("head--->" +head.data);
            return;
        }
        ListNode current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to find the middle element of the linked list
    public ListNode findMiddle()
    {
        if (head == null) {
            return null; // The list is empty
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) 
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
        }
        return slowPointer;
    }
}

public class MiddelElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        ListNode middleElement = list.findMiddle();

        if (middleElement != null) {
            System.out.println("The middle element of the linked list is: " + middleElement.data);

            // Find the second middle element
            if (middleElement.next != null) {
                System.out.println("The second middle element is: " + middleElement.next.data);
            } else {
                System.out.println("There is no second middle element.");
            }
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
