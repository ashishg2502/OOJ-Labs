import java.util.*;

public class IndexExample {
    public static void main(String[] args) {

        String[] items = {"Apple", "Banana", "Orange", "Watermelon"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Items: " + Arrays.toString(items));
        System.out.print("Enter Index: ");

        try {
            int index = sc.nextInt();
            String selectedItem = items[index];
            System.out.println("Item at index " + index + ": " + selectedItem);
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range");
        }

        sc.close();
    }
}
