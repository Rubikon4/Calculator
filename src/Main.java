import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        calculator.getOperand(input.nextDouble(), true);
        System.out.println("Введите оператор в простом виде (+ - * /): ");
        calculator.getOperator(input.next());
        System.out.println("Введите второе число: ");
        calculator.getOperand(input.nextDouble(), false);
        calculator.calculate();
        System.out.println("Ответ: " + calculator.result);
    }
}