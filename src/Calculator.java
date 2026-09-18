public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;
    public double result;

    public void getOperand(double operand, boolean isFirstOperand) {
        if (isFirstOperand) {
            this.operand1 = operand;
        } else {
            if (operand == 0 & this.operator == '/') {
                System.out.println("На ноль делить нельзя!");
            } else {
                this.operand2 = operand;
            }
        }
    }
    public void getOperator(String operator) {
        int length = operator.length();
        if  (length == 1) {
            this.operator = operator.charAt(0);
        } else {
            System.out.println("Вы ввели неверный формат оператора. Подходят только '+', '-', '*', '/'");
        }
    }
    public void calculate() {
        switch (this.operator) {
            case '+': result = operand1 + operand2; break;
            case '-': result = operand1 - operand2; break;
            case '*': result = operand1 * operand2; break;
            case '/': result = operand1 / operand2; break;
        }
    }
}