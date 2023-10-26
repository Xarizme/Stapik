package NewCaculater;

public class CalculOfExpret {
    protected static String checkOper(String a, String b, String op) {
        String result = null;
        switch (op) {
            case "+" -> result = ArithmOper.addition(a, b);
            case "-" -> result = ArithmOper.subtraction(a, b);
            case "*" -> result = ArithmOper.multiplication(a, b);
            case "/" -> result = ArithmOper.division(a, b);
        }
        return result;
    }
}
