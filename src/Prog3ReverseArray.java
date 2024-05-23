import java.util.Arrays;

public class Prog3ReverseArray {
    /**
Write a Java program to reverse an array of integer values
 */
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 34, 54, 67, 78}; //Single dimension array
        System.out.println("Original array: " + Arrays.toString(array));
        Prog3ReverseArray obj = new Prog3ReverseArray();
        System.out.print("Reverse array : ");
        obj.reverseAnArray(array);
    }

    // method to reverse an array
    public void reverseAnArray(int[] list) {

        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }

}
