import java.util.Scanner;

public class Logic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Please enter a operator");
        String operator = scanner.next();

        System.out.println(operator.equals("+") ? num1 + num2 :
                        operator.equals("-") ? num1 - num2 :
                        operator.equals("*") ? num1 - num2 : "Wrong operator");
    }
}
