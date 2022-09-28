import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleExercises {



    public static void main(String[] args) {
        double pi = 3.14159;
//   Write some Java code that uses the variable pi to output the following:
//
//
//The value of pi is approximately 3.14.
//        System.out.format("The Value of  pi is %.2f",pi);

//    1.    Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an Integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        2.Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//What happens if you enter less than 3 words?
//What happens if you enter more than 3 words?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 3 words ");
//        String userIn = scanner.next();
//        String userIn2 = scanner.next();
//        String userIn3 = scanner.next();
//        System.out.println(userIn +" "+ userIn3 +" "+ userIn2);

//          Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length and width");
        String length = scanner.nextLine();
        String width = scanner.nextLine();
        int widthparsed = Integer.parseInt(width);
        int lengthparsed = Integer.parseInt(length);
        int area = widthparsed * lengthparsed;
        int perimeter = (widthparsed * 2) + (lengthparsed * 2);
        System.out.println("The area is "+ area + " The perimeter is " + perimeter);
    }
}
