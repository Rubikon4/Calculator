import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Console console = new Console();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            while (true) {
                if (console.gettingFirstOperand(scanner)) {
                    calculator.setCurrentResult(console.bufferFirstOperand);
                    break;
                }
            }
            while (true) {
                if (console.gettingFirstOperand(scanner)) {
                    calculator.setOperator(console.bufferOperator);
                    break;
                }
            }
            while (true) {
                // засунуть сюда проверку деления на ноль
                if (console.gettingSecondOperand(scanner)) {
                    calculator.calculate(console.bufferSecondOperand);
                    break;
            }
            }
        }
        }
    }
