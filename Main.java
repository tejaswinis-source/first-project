class Student {
  int age;
  String name, course;
  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
  }
}
public class Main {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Alice";
    s1.age = 20;
    s1.course = "BE";
    s1.displayDetails();
  }
}
