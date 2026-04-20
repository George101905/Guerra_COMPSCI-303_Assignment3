import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- Assignmnet 3 ---");
            System.out.println("1) Queue");
            System.out.println("2) Recursive Linear Search");
            System.out.println("3) Insertion Sort for Linked List");
            System.out.println("Enter which program to run:");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
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
                    } catch (Exception e) {
                        System.out.println("Error : Queue simulation failed");
                    }
                    break;
                case 2:

                case 3:

                default:
                    System.out.println("Invalid choice.");
            }
            
        } catch (Exception e) {
            System.out.println("Error : Please enter a valid number");
        }
        scanner.close();
    }

}