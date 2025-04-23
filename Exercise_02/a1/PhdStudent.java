package a1;

public class PhdStudent extends Student {

    private String dissTopic;

    public PhdStudent(String firstName, String lastName, int age, int matNumber, int semester, String dissTopic) {
        super(firstName, lastName, age, matNumber, semester);
        this.dissTopic = dissTopic;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", dissTopic: " + dissTopic;
    }
}
