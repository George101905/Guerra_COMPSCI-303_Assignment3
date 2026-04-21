import java.util.*;

public class RecursiveSearch {
    //Searches starting from last index
    public static int lastOccurrence(ArrayList<Integer> list, int target, int index) {
        // Base case
        if (index < 0) {
            return -1;
        }
        // Immediatly returns current index if equal to target
        if (list.get(index) == target){
            return index;
        }
        // Checking next index to the left
        return lastOccurrence(list, target, index - 1);
    }
}
