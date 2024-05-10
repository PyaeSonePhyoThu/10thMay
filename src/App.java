import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do
        {
            operate();
            System.out.println("Wanna Do it again? yes or No");
            input = scanner.next();
        }while(input.equalsIgnoreCase("yes"));

    }

    public static void add(int num1, int num2)
    {
        System.out.println(num1 + num2);
    }

    public static void subtract(int num1, int num2)
    {
        System.out.println(num1 - num2);
    }

    public static void multiplaction(int num1 , int num2)
    {
        System.out.println(num1 * num2);
    }

    public static void division(int num1, int num2)
    {
        System.out.println(num1 / num2);
    }

    public static void operate()
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.print("Please Enter number1: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Please Enter number2: ");
            int num2 = scanner.nextInt();
            System.out.println();
            
            scanner.nextLine();
            System.out.print("Enter an operator + - * / : or q to exit : ");
            String operator = scanner.nextLine();

            switch (operator) {
                case "+":
                    add(num1, num2);
                    break;
                
                case "-":
                    subtract(num1, num2);
                    break;
                
                case "*":
                    multiplaction(num1, num2);
                    break;
                
                case "/":
                    division(num1, num2);
                    break;
            
                case "q":
                    System.out.println("Thanks for using");
                    break;
            }
            
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Please Enter valid inout only");
            operate();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot devide by zero");
            operate();
        }     
    }
}
