public class Calculator {
    double operand;
    char operator;
    double result;

    public void getOperand(double operand) {
        this.operand = operand;
    }
    public void getOperator(String operator) {
        int length = operator.length();
        if  (length == 1) {
            this.operator = operator.charAt(0);
        } else {
            System.out.println("Вы ввели неверный формат оператора. Подходят только '+', '-', '*', '/'");
        }
    }

}