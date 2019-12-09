package _04interfaces.E9_11;


public class Driver {
    public static void main(String[] args) {
        Person p = new Person("Charles", 2019); // add a person
        System.out.println(p.toString());

        Student stu = new Student("Zach",2019,"Computer Science"); // add a student
        System.out.println(stu.toString());

        Instructor inst = new Instructor("Lily", 2019, 100000); // add a instructor
        System.out.println(inst.toString());
    }
}
