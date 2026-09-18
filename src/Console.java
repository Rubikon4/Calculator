import java.util.Scanner;

public class Console {
    public double bufferFirstOperand;
    public double bufferSecondOperand;
    public String bufferOperator;

    public boolean gettingFirstOperand(Scanner scanner) {
        System.out.println("Введите ваше первое число: ");
        if (scanner.hasNextDouble()) {
            this.bufferFirstOperand = scanner.nextDouble();
            return true;
        } else {
            System.out.println("Значение должно быть числом!");
            return false;
        }
    }
    public boolean gettingSecondOperand(Scanner scanner) {
        System.out.println("Введите ваше второе число: ");
        if (scanner.hasNextDouble()) {
            this.bufferSecondOperand = scanner.nextDouble();
            return true;
        } else {
            System.out.println("Значение должно быть числом!");
            return false;
        }
    }
    public boolean gettingOperator(Scanner scanner) {
        System.out.println("Введите один оператор в формате '+ - * /': ");
        String operator = scanner.next();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                this.bufferOperator = operator;
                return true;
            } else {
                System.out.println("Некорректный формат оператора!");
                return false;}
    }
}