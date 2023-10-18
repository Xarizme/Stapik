package Calculator;

import java.util.Scanner;

public class Main {
    static int number1;
    static int number2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String calc = calc(str);
        System.out.println(calc);


    }
    public static String calc (String input){
        String result = null;
        String [] arr= input.split(" ");
        String op = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
                op = arr[i];
            }
        }
        if (arr.length>3){
        }




    }
}
