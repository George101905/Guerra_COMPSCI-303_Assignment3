class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionSort {
    
    public static ListNode insertionSort(ListNode head) {
        if (head == null) return null;
        ListNode sorted = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            sorted = insertSorted(sorted, current);
            current = next;
        }
        return sorted;
    }

    private static ListNode insertSorted(ListNode head, ListNode node) {
        if (head == null || node.data <= head.data){
            node.next = head;
            return node;
        }
        ListNode current = head;
        while (current.next != null && current.next.data < node.data) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;

        return head;
    }
    // Prints out linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }
}
