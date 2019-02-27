public class Student {
    public String name;
    private int age;
    private Student next;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
