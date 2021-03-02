import java.util.Scanner;
public class addElements {
    public static void add(int[] arr, int number, int index) {
        int[] newArray = new int[arr.length + 1];
        for(int i =0; i<index; i++) {
            newArray[i] = arr[i];
        }
        for (int i =newArray.length-1; i>=index; i--) {
           if (i == index) {
               newArray[i] = number;
           } else {
               newArray[i] = arr[i-1];
           }
        }
        for (int i =0; i< newArray.length; i++) {
            System.out.printf("%2d", newArray[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter index");
        int index = input.nextInt();
        int[] array = {1,3,5,7,2};
        add(array, number, index);
    }
}
