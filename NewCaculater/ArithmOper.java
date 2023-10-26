package NewCaculater;

public class ArithmOper {

    public static String addition(String a, String b) {
        String result;
        result = a + b;
        if (result.length() > 40) {
            return result.substring(0,40) + "...";
        }else{
            return result;
        }
    }

    public static String multiplication(String a, String b) {
        StringBuilder result = new StringBuilder();
        try {
            int shec = Integer.parseInt(b);

            for (int i = 0; i < shec; i++) {
                result.append(a);
            }
            if (result.length() > 40) {
                return (result.substring(0,40) + "...");
            } else {
                return result.toString();
            }
        } catch (NumberFormatException ex) {
            throw new RuntimeException("Строки нельзя умножать");
        }

    }

    public static String division(String a, String b) {
        String result;
        try {
            int dl = a.length() / Integer.parseInt(b);
            result = a.substring(0,dl);
            return result;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Делить строки нельзя");
        }

    }

    public static String subtraction(String a, String b) {
        String result;
        int resultA = a.length() - b.length();
        if (a.length() <= b.length()) {
            throw new RuntimeException("результат меньше одного");
        }
        if (a.substring(resultA).equals(b)) {
            result = a.substring(resultA);
        } else {
            result = a;
        }
        return result;
    }
}
