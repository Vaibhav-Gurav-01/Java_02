//4.Count the number of occurrence of each element of an array.

import java.util.HashMap;

public class ElementCount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5, 4, 5, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            System.out.println("Element: " + key + " Occurrences: " + map.get(key));
        }
    }
}
