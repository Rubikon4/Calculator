import java.util.Scanner;

public class Console {
    public static double parseOperand(String input) {
        // Парсит первый операнд
        try {
            double doubleInput = Double.parseDouble(input);

            if (!Double.isFinite(doubleInput)) {
                throw new IllegalArgumentException("Введите конечное число!");
            }

            return doubleInput;
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректный формат ввода!");
        }
    }
    public static char getOperator(String input) {
        // Парсит оператор
        input = input.trim();

        if  (input.length() == 1 && "+-*/".contains(input)) {
            return input.charAt(0);
        }
        throw new IllegalArgumentException("Некорректный формат ввода!");
        }
    }