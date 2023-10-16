import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        int resultArab = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String op = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
                op = arr[i];
            }
        }
        if (arr.length>2){
            System.out.println("Можно считывать только две переменные");
        }
        try {
            number1 = romanToNumber(arr[0]);
            number2 = romanToNumber(arr[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Нет нужных символов");
        }
        if (number1==0 && number2==0){
            result=0;
            try {
                number1=Integer.parseInt(arr[0]);
                number2=Integer.parseInt(arr[2]);
                
            }
        }



    }

    static int romanToNumber(String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            }
            if (roman.equals("II")) {
                return 2;
            }
            if (roman.equals("III")) {
                return 3;
            }
            if (roman.equals("IV")) {
                return 4;
            }
            if (roman.equals("V")) {
                return 5;
            }
            if (roman.equals("VI")) {
                return 6;
            }
            if (roman.equals("VII")) {
                return 7;
            }
            if (roman.equals("VIII")) {
                return 8;
            }
            if (roman.equals("IX")) {
                return 9;
            }
            if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            System.out.println("Не верное выражение");
        }
        return -1;
    }

    static String convertNumToRoman(int numb) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String s = roman[numb];
        return s;
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
                result = num1 / num2;
                break;
            default:
                break;
        }
        return result;
    }
}
