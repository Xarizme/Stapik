
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String op = null;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*")|| arr[i].equals("/")) {
                op = arr[i] ;
            }
        }
        if (op!=null) {
            try {
                switch (op) {
                    case "+":
                        System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
                        break;
                    case "-":
                        System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]));
                        break;
                    case "*":
                        System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]));
                        break;
                    case "/":
                        System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]));
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("В выражении не все цифры");
            }
        } else {
            System.out.println("ТАкого знака не существует");
        }
    }
}
