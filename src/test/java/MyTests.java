import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testRotateLeft() {
        assertEquals("[2, 3, 4, 5, 1]", Arrays.toString(MyMain.rotateLeft(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] when rotated left should be: " + "[2, 3, 4, 5, 1]");
        assertEquals("[4, 3, 2, 1, 5]", Arrays.toString(MyMain.rotateLeft(new int[] {5, 4, 3, 2, 1})), "The array [5, 4, 3, 2, 1] when rotated left should be: " + "[4, 3, 2, 1, 5]");
        assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(MyMain.rotateLeft(new int[] {1, 1 ,1, 1, 1})), "The array [1, 1 ,1, 1, 1] when rotated left should be: " + "[1, 1, 1, 1, 1]");
        assertEquals("[-1, 3, 5, 2]", Arrays.toString(MyMain.rotateLeft(new int[] {2, -1, 3, 5})), "The array [2, -1, 3, 5] when rotated left should be: " + "[-1, 3, 5, 2]");
    }

    @Test
    public void testRotateRight() {
        assertEquals("[5, 1, 2, 3, 4]", Arrays.toString(MyMain.rotateRight(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] when rotated right should be: " + "[5, 1, 2, 3, 4]");
        assertEquals("[1, 5, 4, 3, 2]", Arrays.toString(MyMain.rotateRight(new int[] {5, 4, 3, 2, 1})), "The array [5, 4, 3, 2, 1] when rotated right should be: " + "[1, 5, 4, 3, 2]");
        assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(MyMain.rotateRight(new int[] {1, 1 ,1, 1, 1})), "The array [1, 1 ,1, 1, 1] when rotated right should be: " + "[1, 1, 1, 1, 1]");
        assertEquals("[5, 2, -1, 3]", Arrays.toString(MyMain.rotateRight(new int[] {2, -1, 3, 5})), "The array [2, -1, 3, 5] when rotated right should be: " + "[5, 2, -1, 3]");
    }

    @Test
    public void testDuplicateReplacer() {
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(MyMain.duplicateReplacer(new int[] {1, 2, 3, 4, 5})), "The array [1, 2, 3, 4, 5] when duplicate replaced should be: " + "[1, 2, 3, 4, 5]");
        assertEquals("[1, -1, -1, -1, -1]", Arrays.toString(MyMain.duplicateReplacer(new int[] {1, 1, 1, 1, 1})), "The array [1, 1, 1, 1, 1] when duplicate replaced should be: " + "[1, -1, -1, -1, -1]");
        assertEquals("[1, 2, -1, -1, -1, -1]", Arrays.toString(MyMain.duplicateReplacer(new int[] {1, 2, 1, 2, 1, 1})), "The array [1, 2, 1, 2, 1, 1] when duplicate replaced should be: " + "[1, 2, -1, -1, -1, -1]");
        assertEquals("[5, 1, 3, 2, -1, 6, 7, -1, -1, -1, 4, -1, -1]", Arrays.toString(MyMain.duplicateReplacer(new int[] {5, 1, 3, 2, 1, 6, 7, 2, 3, 1, 4, 2, 3})), "The array [5, 1, 3, 2, 1, 6, 7, 2, 3, 1, 4, 2, 3] when duplicate replaced should be: " + "[5, 1, 3, 2, -1, 6, 7, -1, -1, -1, 4, -1, -1]");
    }
}
