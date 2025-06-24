import java.util.Scanner;

public class Conditinal_Statment {
    public static void main(String[] args) {
        /*
                    (----------Qusetion One---------)
        .Write a program that checks the role of the user
        If the role is admin print "welcome admin"
        If the role is superuser print "welcome superuser"
        If the role is user print "welcome user" (tip:
        use if else)

                (--------------Solution----------------- )
                    Scanner in = new Scanner(System.in);
                    String user = in.nextLine();
                    if(user.equalsIgnoreCase("admin")){
                        System.out.println("welcome Admin");
                    }else if(user.equalsIgnoreCase("superuser")){
                        System.out.println("welcome superuser");
                    }else if (user.equalsIgnoreCase("user")){
                        System.out.println("Welcome User");
                    }else{
                        System.out.println("wrong input");
                    }
         */

//////////////////// //////////////////////////////////////////////////////////////////
        /*
                    (----------Qusetion Two---------)
        .Take three numbers from the user and print the greatest number.
                    Test Data
                    Input the 1st number: 25
                    Input the 2nd number: 78
                    Input the 3rd number: 87
                    Expected Output : The
                    greatest: 87

                (--------------Solution----------------- )
                    Scanner in = new Scanner (System.in);
                    System.out.println("enter 3 numbers To compare between them ");
                    System.out.println("Enter number 1 : ");
                    int num1 = in.nextInt();
                    System.out.println("Enter number 2 : ");
                    int num2 = in.nextInt();
                    System.out.println("Enter number 3 : ");
                    int num3 = in.nextInt();
                    if(num1 > num2 && num1 > num3){
                        System.out.println("the biggest number is " + num1);
                    }else if(num2 > num1 && num2 > num3)
                        System.out.println("the biggest number is " + num2);
                    else {
                        System.out.println("the biggest number is " + num3);
                }
         */
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
                    (----------Qusetion Three---------)
            Write a Java program that generates an integer between 1 and 7
            and displays the name of the weekday.
            Test Data
            number: 4
            Expected Output:
            Wednesday

                (--------------Solution----------------- )

                Scanner in = new Scanner(System.in);
                int randomNumber = ((int) (Math.random() * 6)) + 1;//generate Random number from 1 to 7
                System.out.println("Enter number between 1 to 7");

                int number = in.nextInt();

                switch(number){
                    case 1 :
                        System.out.println("Sunday");
                        break;
                    case 2 :
                        System.out.println("Monday");
                        break;
                    case 3 :
                        System.out.println("Tuesday");
                        break;
                    case 4 :
                        System.out.println("Wednesday");
                        break;
                    case 5 :
                        System.out.println("Thursday");
                        break;
                    case 6 :
                        System.out.println("Friday");
                        break;
                    case 7 :
                        System.out.println("Saturday ");
                        break;
                    default:
                        System.out.println("number is not in the range");
                }
         */
/// /////////////////////////////////////////////////////////////////////////////////////
    /*
                    (----------Qusetion Four---------)
            .Write a program that takes a numeric score as input and prints
            the corresponding letter grade using the following grading scale
                (--------------Solution----------------- )

                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter your Grade");
                    int grade = in.nextInt();
                    if (grade >= 90 && grade <= 100) {
                        System.out.println("your Grade is " + grade);
                        System.out.println("A");
                    } else if (grade >= 80 && grade <= 89) {
                        System.out.println("your Grade is " + grade);
                        System.out.println("B");
                    } else if (grade >= 70 && grade <= 79) {
                        System.out.println("your Grade is " + grade);
                        System.out.println("C");
                    } else if (grade >= 60 && grade <= 69) {
                        System.out.println("your Grade is " + grade);
                        System.out.println("D");
                    } else if (grade >= 0 && grade <= 59) {
                        System.out.println("your Grade is " + grade);
                        System.out.println("F");
                    } else {
                        System.out.println("Error , Wrong Number..");
                    }
         */
/// ///////////////////////////////////////////////////////////////////////////
        /*
        (----------Qusetion Five---------)
            Write a Java program that takes a person's age as input and
            categorizes them into one of three age categories: "Child,"
            "Teenager," or "Adult" using an if statement.
                (--------------Solution----------------- )

                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter your Age");
                    int age = in.nextInt();
                    if(age < 13){
                        System.out.println("Child");
                    }else if(age >= 14 && age <= 18) {
                        System.out.println(" Teenager");
                    }else{
                        System.out.println("Adult");
                    }

         */
    }
}
