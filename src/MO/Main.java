package MO;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        /*
        String username = getName();
        System.out.printf("Name is : " + username +  "\n");
        String Age = getAge();
        System.out.printf("Age is : " + Age +  "\n");
        String College = getCollege();
        System.out.printf("College is : " + College +  "\n");
        String Mail = getEmail();
        System.out.printf("Email is : " + Mail +  "\n");
        */

        /*
        sayHello(username);
        sayWelcome(username);
        */
        student1.firstName = "MOMO";
        student1.paragraph = "MOAMEN NASSER SAAD EL HANADY THIS IS A PARAGRAPH THAT WANT TO GET ITS LENGTH";
        Student student2 = new Student();

        int COUNTEROFPARAGRAPH = 0;
        student2.firstName = "NASSER";
        String[] arrofString = student1.paragraph.split(" ");
        student2.increaseStudentcount();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        System.out.printf("Number of Characters is " + student1.paragraph.length() + "\n");


        for (String a : arrofString ) {
            COUNTEROFPARAGRAPH++;
            System.out.println(a);

        }
        System.out.println(COUNTEROFPARAGRAPH);


        /*      Arrays in Java          */
        int [] numbers = new int[5];
        numbers[0] = getNumberfromuser();
        numbers[1] = getNumberfromuser();
        numbers[2] = getNumberfromuser();
        numbers[3] = getNumberfromuser();
        numbers[4] = getNumberfromuser();
        int sum = 0;

        for(int i = 0 ; i< numbers.length ; i++)
        {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println(sum);


        boolean [] found = new boolean[5];
        found[0] = false;
        found[1] = true;
        found[2] = false;
        found[3] = true;

        System.out.println(found[3]);

        Student[] students = new Student[10];
        Student s1 = new Student();

        s1.firstName = "PETER";
        s1.lastName = "INB";

        Student s2 = new Student();

        s2.firstName = "SARA";
        s2.lastName = "AS";

        students[0] = s1;
        students[1] = s2;

        System.out.println(students[0].firstName);
        System.out.println(students[0].lastName);



        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

    }

    private static int getNumberfromuser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A number : ");
        int number = Integer.parseInt(sc.next());
        //sc.close();
        return number;
    }
    private static String getName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        String username = sc.next();
        //sc.close();
        return username;
    }
    private static String getAge()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age : ");
        String Age = sc.next();
        //sc.close();
        return Age;
    }
    private static String getCollege()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your College : ");
        String College = sc.next();
        //sc.close();
        return College;
    }
    private static String getEmail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Email : ");
        String Email = sc.next();
        //sc.close();
        return Email;
    }
    private static void sayHello(String username)
    {
        System.out.println("Hello " + username);

    }

    private static void sayWelcome(String username)
    {
        System.out.println("Welcome " + username);
    }
}

