import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Калькулятор 1.0. запущен...");
            calculator.setCurrentResult(Console.getOperand(scanner));
            calculator.setOperator(Console.getOperator(scanner));
            try {
                double result = calculator.calculate(Console.getOperand(scanner));
                System.out.println(result);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
