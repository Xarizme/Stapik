import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        int result;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String op = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
                op = arr[i];
            }
        }
        number1 = romanToNumber(arr[0]);
        number2 = romanToNumber(arr[2]);
        if (number1 < 0 && number2 < 0) {
            result = 0;
        } else {
            result = calculator(number1, number2, op);
            System.out.println("---Результат для римских цифр----");
           // String resultRoman = convertNumToRoman(result);
          //  System.out.println(resultRoman);
        }
        number1 = Integer.parseInt(arr[0]);
        number2 = Integer.parseInt(arr[2]);
        result = calculator(number1, number2, op);
        System.out.println(result);
    }
    public static int romanToNumber (String roman){
        try {
            if (roman.equals("I")){
                return 1;
            }
            if (roman.equals("II")){
                return 2;
            }
            if (roman.equals("III")){
                return 3;
            }
            if (roman.equals("IV")){
                return 4;
            }
            if (roman.equals("V")){
                return 5;
            }
            if (roman.equals("VI")){
                return 6;
            }
            if (roman.equals("VII")){
                return 7;
            }
            if (roman.equals("VIII")){
                return 8;
            }
            if (roman.equals("IX")){
                return 9;
            }
            if (roman.equals("X")){
                return 10;
            }
        } catch (InputMismatchException e) {

        }
    }


    public static int calculator(int num1, int num2, String op) {
        int result = 0;
        try {
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
                    } catch (ArithmeticException | InputMismatchException e) {
                        System.out.println("Делить на ноль нельзя");
                    }
                    break;
            }
        } catch (NullPointerException e){
            System.out.println("Неверный знак");
        }
        return result;
    }
}



