public class Calculator {
    private double currentResult = 0;
    private char operator;

    public void setCurrentResult(double in) {
        this.currentResult = in;
    }
    public void setOperator(String operator) {
            this.operator = operator.charAt(0);
    }
    public double calculate(double secondOperand) {
        switch (this.operator) {
            case '+': currentResult = currentResult + secondOperand; break;
            case '-': currentResult = currentResult - secondOperand; break;
            case '*': currentResult = currentResult * secondOperand; break;
            case '/': currentResult = currentResult / secondOperand; break;
        }
        return currentResult;
    }
}