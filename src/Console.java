import java.util.Scanner;

public class Console {
    public static double getOperand(Scanner scanner) {
        // Получает первый операнд
        while (true) {
            System.out.println("Введите операнд: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Некорректный формат ввода. Попробуйте еще раз: ");
            scanner.next();
        }
    }
    public static char getOperator(Scanner scanner) {
        // Получает оператор
        while (true) {
            System.out.println("Действие с операндами (введите символ в формате + - * /): ");
            String input = scanner.next();
            if  (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            }
        }
    }
}
