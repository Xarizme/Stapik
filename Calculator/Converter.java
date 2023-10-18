package Calculator;

import static Calculator.Digits.ROME;

class Converter {
    public static int romeToNumber(String roman) {

        for (int i = 1; i <= 10; i++ ) {
            if (roman.equals(ROME[i])) {
                return i;
            }
        }

        throw new RuntimeException("для ввода допустимы числа от 1 до 10");

    }

    public static String numberToRome(int numb) {
        return ROME[numb];
    }
}
