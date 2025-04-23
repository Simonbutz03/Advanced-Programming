package a1;

import java.util.ArrayList;

public class Student extends Person {

    private int matNumber;
    private int semester;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String firstName, String lastName,int age, int matNumber, int semester) {
        super(firstName, lastName, age);
        this.matNumber = matNumber;
        this.semester = semester;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void printCourses() {
        for(int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }


    @Override
    public String getInfo() {
        return super.getInfo() + " matNumber : " + matNumber + " semester : " + semester + " Courses : " + courses;
    }
}
