import java.util.*;
import java.io.*;

class FindSum {
    static boolean find_sum_of_pairs(int[] A, int target) {
        HashSet<Integer> found_values = new HashSet<Integer>();
        for(int a : A) {
            if(found_values.contains(target - a)) {
                return true;
            }
            found_values.add(a);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = new int[] {5,7,1,2,8,4,3};
        int[] test = new int[] {3,20,1,2,7};
        for(int i=0;i<test.length;i++) {
            boolean output = find_sum_of_pairs(numbers, test[i]);
            System.out.println(output ? "true" : "false");
        }
    }
}