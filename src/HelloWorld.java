import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloWorld {
    public static String name = "first version";
    public static int age = 0;

    public void sameVarname() {
        String hi = "hello";
    }

    public void sameVarname2() {
        String hi = "yo";
    }

    public void sum(String param) {
        name = "field1 changed in sum()";
        boolean[] booleanArray = {true, true, false};
        double[] doubleArray = {1.0, 2.3, 3.4};
        double[] doubleArray2 = doubleArray;
        String[] stringArray = {"this", "is", "a", "string", "array"};
        stringArray[0] = "hello";
        int[] intArray = new int[5];
        for (int i = 0; i < 5; i++) {
            age += 2;
            intArray[i] = i * 2;
        }
    }

    public void testCollection() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("hi");
        stringList.add("my");
        stringList.add("name");

        boolean flag = true;
        int s = 0;
        for (int i = 0; i < 5; i++) {
            int sum = i;
            s += i;
        }

        for (int i = 0; i < 5; i++) {
            int sum = 1000;
        }

        if (true) {
            String var = "yo";
        }

        if (true) {
            String var = "hi";
        }

    }

    public void testObject() {
        Student[] studentArray = new Student[3];
        Student student1 = new Student("Audrey", 1);
        Student student2 = new Student("Derek", 2);
        Student student3 = new Student("Eric", 3);

        student1.name = "Hang";

        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        student1.setNext(student2);
        student2.setNext(student3);

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
    }
}
