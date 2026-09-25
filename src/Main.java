import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Калькулятор 1.0. запущен... Для выхода в любой ммоент введите 'Q'");
            while (true){
                // Пытается получить первый операнд, пока не получит
                System.out.println("Введите первое число: ");
                String input = scanner.nextLine();

                if (input.trim().equalsIgnoreCase("q")) { return; }

                try {
                    calculator.setCurrentResult(Console.parseOperand(input));
                    break;
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                // Пытается получить оператор, пока не получится
                System.out.println("Введите операцию c операндами (символ в формате + - * /): ");
                String input = scanner.nextLine();

                if (input.trim().equalsIgnoreCase("q")) { return; }

                try {
                    calculator.setOperator(Console.getOperator(input));
                    break;
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                System.out.println("Введите второй операнд: ");
                String input = scanner.nextLine();

                if (input.trim().equalsIgnoreCase("q")) { return; }

                try {
                    double result = calculator.calculate(Console.parseOperand(input));
                    System.out.println(result);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
