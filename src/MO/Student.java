package MO;

public class Student {

    // default is protected in java
    public String firstName;

    String paragraph;

    String lastName;


    public static int age;

    private String address;
    private static int studentcount;



    public void AttendClass()
    {
        System.out.println("Welcome to Class" + firstName);

    }

    public void absent()
    {

    }

    public void increaseStudentcount()
    {
        studentcount++;
    }
}
