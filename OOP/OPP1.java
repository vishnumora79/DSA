package OOP;

public class OPP1 {
    public static void main(String[] args) {
//        Since we created an object with an empty constructor it is giving the default values
//        Student student1 = new Student();
//        System.out.println(student1.roll);   // 0
//        System.out.println(student1.name);   // null
//        System.out.println(student1.marks);  // 0.0

//        Suppose if we assign values to instance variables
//        Student student1 = new Student();
//        Student student2 = new Student(79,"Vishnu", 89.9f);
//        Student student3 = new Student(student2);
////         Default constructor
//        System.out.println(student1.roll);
//        System.out.println(student1.name);
//        System.out.println(student1.marks);
////Constructor with parameters
//        System.out.println(student2.roll);
//        System.out.println(student2.name);
//        System.out.println(student2.marks);
////        Constructor with parameter as an object
//        System.out.println(student3.roll);
//        System.out.println(student3.name);
//        System.out.println(student3.marks);
//      calling the constructor inside another constructor
        Student student4 = new Student();
        System.out.println(student4.name);
    }
}
class Student {
//    Attributes or Properties
    int roll;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello Everyone");
    }
//Default explicit constructor
//    Student () {
//        this.roll = 17;
//        this.name = "Ravi";
//        this.marks = 45.5f;
//    }

    Student () {
//        This is how you call a constructor from another constructor
        this (13, "Striver", 100.0f);
    }

    Student (Student other_object) {
        this.roll = other_object.roll;
        this.name = other_object.name;
        this.marks = other_object.marks;
    }

    Student (int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
