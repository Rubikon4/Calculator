import java.util.Scanner;

public class Console {
    public static double parseOperand(String input) {
        // Парсит первый операнд
        try {
            Double doubleInput = Double.parseDouble(input);
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

/*
check q
string input = input

 */