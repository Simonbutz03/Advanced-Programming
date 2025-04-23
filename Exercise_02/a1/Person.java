package a1;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }
    public String getInfo(){
        return firstName + " " + lastName + " " + age;
    }
}

