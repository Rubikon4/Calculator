public class Calculator {
    private double currentResult = 0;
    private char operator;

    public void setCurrentResult(double operand) {
        // Устанавливает текущий операнд
        this.currentResult = operand;
    }

    public void setOperator(char operator) {
        // Устанавливает оператор
        this.operator = operator;
    }

    public double calculate(double secondOperand) {
        // Производит вычисление
        double result = switch (this.operator) {
            case '+' -> this.currentResult + secondOperand;
            case '-' -> this.currentResult - secondOperand;
            case '*' -> this.currentResult * secondOperand;
            case '/' -> {
                if (secondOperand == 0) {
                    throw new IllegalArgumentException("Нельзя делить на ноль!");
                }
                yield this.currentResult / secondOperand;
            }
            default -> throw new IllegalArgumentException("Неподдерживаемый вид оператора (" + this.operator + ")!");
        };

        if (Double.isInfinite(result)) {
            throw new IllegalArgumentException("Результат слишком большой! - Калькулятор не обрабатывает бесконечность.");
        }

        return result;
    }
}