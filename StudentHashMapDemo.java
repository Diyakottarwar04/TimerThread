import java.util.*; //hashmap that we are using are includede in this package

public class StudentHashMapDemo {
    public static void main(String[] args) {
        // HashMap with (studentName, marks)
        Map<String, Integer> marksMap = new HashMap<>();

        marksMap.put("Alice", 85);
        marksMap.put("Bob", 92);
        marksMap.put("Charlie", 78);
        marksMap.put("David", 88);

        // print marks
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }

        // find highest marks
        String topStudent = null;
        int highestMarks = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            if (entry.getValue() > highestMarks) {
                highestMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Top student: " + topStudent + " with marks: " + highestMarks);
    }
}