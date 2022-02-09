import java.util.*;
import java.io.*;

class MoveZeros {
    static void move_zeros_to_left(int[] A) {
        if(A.length < 1) return;
        int read_index = A.length - 1;
        int write_index = A.length - 1;
        while(read_index >= 0) {
            if(A[read_index] != 0) {
                A[write_index] = A[read_index];
                write_index--;
            }
            read_index--;
        }
        while(write_index >= 0) {
            A[write_index] = 0;
            write_index--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array " + Arrays.toString(numbers));
        move_zeros_to_left(numbers);
        System.out.println("After moving zeros to left" + Arrays.toString(numbers));
    }
}