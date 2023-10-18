package Calculator;

import static Calculator.Digits.ROME;

class Validator {
    private static boolean isRome(String inputStr) {

        for (int i = 1; i <= 10; i++) {
            if (ROME[i].equals(inputStr)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static String getNumeralSystem(String input1, String input2, String operator) {
        String result;

        checkOperator(operator);

        if ((isRome(input1) && isRome(input2)) || (isStringInt(input1) && isStringInt(input2))) {
            throw new RuntimeException("нужно вводить только римские или арабские цифры");
        }

        int op1;
        int op2;

        if (isRome(input2)) {
            op1 = Converter.romeToNumber(input1);
            op2 = Converter.romeToNumber(input2);
        } else {
            op1 = Integer.parseInt(input1);
            op2 = Integer.parseInt(input2);
        }

        if ((op1 < 0) || (op1 > 10) || (op2 < 0) || (op2 > 10)) {
            throw new RuntimeException("числа не входят в диапазон");
        }

        if (isRome(input1)) {
            result = "roman";
        } else {
            result = "decimal";
        }

        return result;
    }

    private static void checkOperator(String operator) {
        if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
            throw new RuntimeException("Нет такого оператора");
        }
    }

}
