package Calculator;

public class proverca {
    private static boolean isRom(String inputStr){
        return inputStr.matches("^I$|^II$|^III$|^IV$|^V$|^VI$|^VII$|^VIII$|^IX$|^X$");
    }
    private static boolean isStringInt(String s){
        try {
            Integer.parseInt(s);
            return true
        } catch (NumberFormatException ex){
            return false;
        }
    }

}

