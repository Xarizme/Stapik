package Calculator;

public class Calculator {

    public static String calculate(String input) {
        String result;
        String[] arr = input.split(" ");

        if (arr.length != 3 ){
            throw new ArrayIndexOutOfBoundsException("Выражение нельзя расчитать");
        }

        String num1 = arr[0];
        String num2 = arr[2];
        String oper = arr[1];


        int resultRomAra;
        int numberInt1;
        int numberInt2;

        if (Validator.getNumeralSystem(num1, num2, oper).equals("roman")) {
            numberInt1 = Converter.romeToNumber(num1);
            numberInt2 = Converter.romeToNumber(num2);
            resultRomAra = executeOperation(numberInt1, numberInt2, oper);
            result = Converter.numberToRome(resultRomAra);
        } else {
            numberInt1 = Integer.parseInt(num1);
            numberInt2 = Integer.parseInt(num2);
            resultRomAra = executeOperation(numberInt1,numberInt2,oper);
            result=Integer.toString(resultRomAra);
        }

        return result;
    }

    private static int executeOperation(int num1, int num2, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                try {
                    result = num1 / num2;
                    break;
                } catch (ArithmeticException e){
                    throw new RuntimeException("На ноль делить нельзя");
                }
            default:
                break;
        }
        return result;
    }
}
