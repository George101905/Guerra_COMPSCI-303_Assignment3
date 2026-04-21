import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- Assignmnet 3 ---");
            System.out.println("1) Queue");
            System.out.println("2) Recursive Linear Search");
            System.out.println("3) Insertion Sort for Linked List");
            System.out.print("Enter which program to run: ");

            int choice = scanner.nextInt();
            System.out.println();
            // Switch case to demonstrate each prompt
            switch(choice){
                case 1: // Queue Implementation
                    try {
                        Queue<Integer> queue = new Queue<>();

                        for (int i = 1; i <= 10; i++){
                            queue.offer(i);
                        }

                        int n = queue.size();
                        for (int i = 0; i < n; i++) {
                            int val = queue.peek();
                            System.out.print(val + " ");
                            queue.offer(queue.poll());
                        }
                        System.out.println();
                        queue.move_to_rear();
                        n = queue.size();
                        for (int i = 0; i < n; i++){
                            int val = queue.peek();
                            System.out.print(val + " ");
                            queue.offer(queue.poll());
                        }
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("Error : Queue simulation failed");
                    }
                    break;
                case 2: // Recursive Linear Search (Last occurence)
                    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 9, 2, 9, 7, 9, 5));

                    int result = RecursiveSearch.lastOccurrence(list, 9, list.size() - 1);
                    System.out.print("ArrayList:");
                    for(int i = 0; i < list.size(); i++) {
                        if( i == list.size() - 1){
                            System.out.println(list.get(i));
                            break;
                        }
                        System.out.print(list.get(i) + ", ");
                    }
                    System.out.println("Last occurrence index of 9: " + result);
                    break;
                case 3: // Insertion Sort for Linked List
                    ListNode head = new ListNode(4);
                    head.next = new ListNode(2);
                    head.next.next = new ListNode(7);
                    head.next.next.next = new ListNode(1);
                    System.out.println("--- Original List ---");
                    InsertionSort.printList(head);
                    System.out.println();
                    head = InsertionSort.insertionSort(head);
                    System.out.println("--- Sorted List ---");
                    InsertionSort.printList(head);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            
        } catch (Exception e) {
            System.out.println("Error : Please enter a valid number");
        }
        System.out.println("Ending program...");
        scanner.close();
    }

}
