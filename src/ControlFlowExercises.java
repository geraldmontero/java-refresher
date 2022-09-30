import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

// Loop basics
        //a. while
//        Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//Your output should look like this:
//
//5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//  Do While
//
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//Alter your loop to count backwards by 5's from 100 to -10.
//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count <= 100);
//
//        int countBack = 100;
//        do {
//            System.out.println(countBack);
//            countBack -= 5;
//        } while (countBack >= -10);

//      For
//
//Refactor the previous two exercises to use a for loop instead.
//
//        for (int i = 0; i <=100; i +=2){
//            System.out.println(i);
//        }
//
//        for (int x =100; x >=-10; x -=5){
//            System.out.println(x);
//        }

//        Fizzbuzz
//
//One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//Write a program that prints the numbers from 1 to 100.
//For multiples of three: print “Fizz” instead of the number.
//For the multiples of five: print “Buzz”.
//For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");

            }
        }

//        Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an integer");
        int userNum = scanner.nextInt();

        System.out.println();
        System.out.println(" Here is your table");
        System.out.println("Number | squared | cubed |");
        System.out.println("------ | ------- | ------| ");


        for (int i = 1; i <= userNum; i++) {

            System.out.println(i + "      | " + (i * i) + "        | " + (i * i * i));
        }

        System.out.println("continue y or n");
        String userIn = scanner.next();
        if (!userIn.equals("y")) {
            System.out.println("goodbye");


        } else {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter next integer");
            int nextnum = scanner2.nextInt();

            System.out.println();
            System.out.println(" Here is your table");
            System.out.println("Number | squared | cubed |");
            System.out.println("------ | ------- | ------| ");
            for (int i = 1; i <= nextnum; i++) {

                System.out.println(i + "      | " + (i * i) + "        | " + (i * i * i));
            }


        }
//        Convert given number grades into letter grades.
//
//Prompt the user for a numerical grade from 0 to 100.
//Display the corresponding letter grade.
//Prompt the user to continue.
//Assume that the user will enter valid integers for the grades.
//The application should only continue if the user agrees to.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0

        Scanner scanner3 = new Scanner(System.in);
        do {



            System.out.println("please enter a grade bettween 0-100");

        int userint = scanner3.nextInt();
        boolean userAn = Boolean.parseBoolean(scanner3.nextLine());
        if (userint > 0 && userint < 59){
            System.out.println("f");
            System.out.println("do you want to continue");

        }else if (userint > 59 && userint <67){
            System.out.println("d");
        }else if (userint > 68 && userint <80){
            System.out.println("c");
        }else if (userint > 80 && userint <89){
            System.out.println("b");
        }else if (userint > 87 && userint <= 100){
            System.out.println("a");
        }


        }while(userAn);


    }
}
