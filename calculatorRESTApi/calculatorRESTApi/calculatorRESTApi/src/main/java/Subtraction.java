import java.util.Scanner;

public class Subtraction {
    public static void main (String args[]) {
        Scanner calc = new Scanner(System.in);
        double firstNum, secondNum, answer;
        System.out.println("Enter the first number: ");
        firstNum = calc.nextDouble();
        System.out.println("Enter the second number: ");
        secondNum = calc.nextDouble();
        answer = firstNum - secondNum;
        System.out.println(answer);



    }
}
