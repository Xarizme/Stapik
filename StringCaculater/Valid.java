package StringCaculater;

public class Valid {
    private static boolean isStrig(String num) {
        return num.contains("\"");
    }

    private static boolean isDecimal(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean leght (String [] a){
        if (a.length != 3) {
            throw new ArrayIndexOutOfBoundsException("Выражение имеет больше или меньше знаков");
        }else {
            return true;
        }
    }

    public static String getNum(String a, String b, String oper) {
        String result;

        if (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))) {
            throw new RuntimeException("Нет нужного знака операции");
        }

        if (!(isStrig(a) && isStrig(b) || (isStrig(a) && isDecimal(b)))) {
            throw new RuntimeException("Не соответсвует выражение");
        }
        if (isStrig(a)) {
            result = "fac";
        }else {
            result= "des";
        }

        return result;
    }
}
