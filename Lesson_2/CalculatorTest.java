import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        boolean continueCalculations = true;

        while(answer.equals("yes") && !answer.equals("no")) {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            calculator.calculating();
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
        }
    }
}