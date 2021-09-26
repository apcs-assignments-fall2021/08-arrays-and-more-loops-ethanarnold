import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] res = new int[arr.length];
        res[res.length-1] = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            res[i] = arr[i+1];
        }
        return res;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[res.length-1];
        for (int i = 1; i < arr.length; i++) {
            res[i] = arr[i-1];
        }
        return res;
    }
    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i]) arr[j] = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5};
        int[] in2 = {1, 1, 1, 2, 3, 2, 2, 3, 3, 4, 5, 5, 6, 8, 8, 10};
        System.out.println("The array [1, 2, 3, 4, 5] rotated left is:");
        System.out.println(Arrays.toString(rotateLeft(in)));
        System.out.println("The array [1, 2, 3, 4, 5] rotated right is:");
        System.out.println(Arrays.toString(rotateRight(in)));
        System.out.println("The array " + Arrays.toString(in2) + " with duplicates set to -1 is:");
        System.out.println(Arrays.toString(duplicateReplacer(in2)));
    }
}