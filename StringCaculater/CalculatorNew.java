package StringCaculater;

public class CalculatorNew {
    private static String result;

    public static String calc(String input) {
        String result;

        String[] str = input.split(" ");

        Valid.leght(str);
        String inputS1 = str[0];
        String inputS2 = str[2];
        String str1 = input.replace("\"", "");
        String[] arr1 = str1.split(" ");
        String inputStr1 = arr1[0];
        String operato = arr1[1];
        String inputStr2 = arr1[2];
        if (Valid.getNum(inputS1, inputS2, operato).equals("fac")) {
            result = CalculOfExpret.checkOper(inputStr1, inputStr2, operato);
            return result;
        } else {
            result = CalculOfExpret.checkOper(inputStr1, inputStr2, operato);
        }
        return result;
    }
}
