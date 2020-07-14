public class Main {

    public static void main(String[] args){


        Student Student1 = new Student("Jon","Smith",3.0, "Psychology",2020);
        Student Student2 = new Student("Mary","Lewis", 2.0,  "Business",2022 );

        Student1.incrementExpectedGraduationYear();
        System.out.println(Student1.expectedYearOfGraduation);

    }
}
