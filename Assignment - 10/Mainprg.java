class Student {
    static String college = "GIETU";
    int rollNo;
    String name;

    static {
        System.out.println("Static block executed");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void changeCollege() {
        college = "GIET University";
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class Mainprg {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anand");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();

        Student.changeCollege();

        s1.display();
        s2.display();
    }
}