import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Convert the List to an array of strings
        String[] stringArray = stringList.toArray(new String[stringList.size()]);

        // Print the elements of the array
        for (String item : stringArray) {
            System.out.println(item);
        }
    }
}
