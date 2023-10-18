package Calculator;

class Proverca {
    private static boolean isRom(String inputStr){
        boolean a = false;
        switch (inputStr) {
            case "I":
                a=true;
                break;
            case "II":
                a= true;
                break;
            case "III":
                a= true;
                break;
            case "IV":
                a= true;
                break;
            case "V":
                a= true;
                break;
            case "VI":
                a= true;
                break;
            case "VII":
                a= true;
                break;
            case "VIII":
                a= true;
                break;
            case "IX":
                a= true;
                break;
            case "X":
                a= true;
                break;
        }
        return a ;

    }
    private static boolean isStringInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
    public static String proEx (String input1, String input2, String operator){
        String result ="";
        if (operator == "+" || operator == "-" || operator == "*" || operator == "/" ){
            throw new RuntimeException("Нет такого оператора");
        }
        if (isRom(input1)^ isRom(input2)) {
            throw new RuntimeException("разные системы");
        }
        if (!isRom(input1) && !isRom(input2) && (!isStringInt(input1) || !isStringInt(input2))){
            throw new RuntimeException("нужно вводить только римские или арабские цифры");
        }
        int op1=0;
        int op2=0;

        if (isRom(input2)){
            ConverRom rom =new ConverRom();
            op1=rom.romToNumb(input1);
            op2=rom.romToNumb(input2);
        }else {
            op1=Integer.parseInt(input1);
            op2=Integer.parseInt(input2);
        }
        if ((op1<0) || (op1>10) || (op2<0) || (op2>10)){
            throw new RuntimeException("числа не входят в диапазон");
        }
        if (isRom(input1)){
            result="roman";
        }else {
            result="decimal";
        }
        return result;
    }

}