public class Student {

    String firstName;
    String lastName;
    double GPA;
    String major;
    int expectedYearOfGraduation;

    public Student(String firstName,String lastName, double GPA, String  major, int expectedYearOfGraduation){

        this.firstName = firstName;
        this.lastName =  lastName;
        this.GPA = GPA;
        this.major = major;

    }
    public void incrementExpectedGraduationYear() {
        this.expectedYearOfGraduation = expectedYearOfGraduation +1;

    }
}
