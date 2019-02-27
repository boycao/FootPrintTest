import java.util.ArrayList;
import java.util.List;

public class Main {

    private static String greeting = "Hi";

    public static void main(String[] args) {
        // Start timer
        Timer.start();

        // greeting field goes through changes
        greeting = "Hello";
        greeting = "Bye";

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.testObject();

        // made a change to helloWorld.field1, so FootPrint will detect
        // that helloWorld has changed
        helloWorld.sum("this is a parameter");

        // another change to helloWorld
        HelloWorld.name = "field1 changed in main()";

        // creating student objects
        Student s1 = new Student("Audrey", 1);
        Student s2 = new Student("Eric", 2);
        Student s3 = new Student("Derek", 3);

        // displaying arrays
        Integer[] intArray = new Integer[3];
        intArray[0] = 1;
        intArray[1] = 22;
        intArray[2] = 10;

        Double[] doubleArray = new Double[3];
        doubleArray[0] = 1.2;
        doubleArray[1] = 3.4;
        doubleArray[2] = 4.5;

        Student[] students = {s1, s2, s3};

        // Creating list of student objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // If one of the fields is a reference to another object
        s1.setNext(s2);


        // track primitive variable's histories
        boolean[] booleanArray = {true, true, false};
        booleanArray[1] = false;
        booleanArray[2] = false;

        String[] stringArray = {"this", "is", "a", "string", "array"};
        stringArray[0] = "hello";

        int[] ints = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            ints[i] = i * 2;
            sum += i;
        }

        // stop timer
        Timer.stop();

        // Change the name of the output file to FootPrint.txt or Chronon.txt depending on
        // which program is being tested
        Timer.printTimeToFile("FootPrint.txt"); // set breakpoint below this line to print out pre-processing time
    }
}
