import java.util.TreeMap;

public class EmployeeDirectory {
    public static void main(String[] args) {
     
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Charlie");
        employeeMap.put(4, "David");

     
        System.out.println("Employee Names in Alphabetical Order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}
