package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String calc = calc(str);
        System.out.println(calc);

    }

    public static String calc(String input) {
        String result = null;
        String[] arr = input.split(" ");

        if (arr.length != 3 ){
            throw new ArrayIndexOutOfBoundsException("Выражение нельзя расчитать");
        }
        String num1 = arr[0];
        String num2 = arr[2];
        String oper = arr[1];


        int resultRomAra = 0;
        int numerInt1 = 0;
        int numerInt2 = 0;

        if (Proverca.proEx(num1, num2, oper).equals("roman")) {
            numerInt1 = ConverRom.romToNumb(num1);
            numerInt2 = ConverRom.romToNumb(num2);
            resultRomAra = calculator(numerInt1, numerInt2, oper);
            result = ConverRom.NumToRom(resultRomAra);
        } else {
            numerInt1 = Integer.parseInt(num1);
            numerInt2 = Integer.parseInt(num2);
            resultRomAra = calculator(numerInt1,numerInt2,oper);
            result=Integer.toString(resultRomAra);
        }
        return result;

    }

    public static int calculator(int num1, int num2, String op) {
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
