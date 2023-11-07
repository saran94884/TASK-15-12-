import java.util.ArrayList;

public class ArrayListClearExample {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();

        
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

       
        System.out.println("ArrayList before clearing: " + stringList);

       
        stringList.clear();

        System.out.println("ArrayList after clearing: " + stringList);
    }
}
