package a1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", "Anders", 34);
        System.out.println(p.getInfo());


        Student s = new Student("Bob", "Bücher", 22, 456789,3);
        s.addCourse("Advanced Programming");
        s.addCourse("Mathematik");
        s.printCourses();
        System.out.println(s.getInfo());

        PhdStudent phd = new PhdStudent("Charlie", "Clever", 28, 987654, 6 , "AI Ethics");
        System.out.println(phd.getInfo());


    }
}
