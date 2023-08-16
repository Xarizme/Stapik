public class Main {
    public static void main(String[] args) {
        String a = "Madam, I'm Adam!";
        String b = new StringBuilder(a).reverse().toString();
        System.out.println(a.replaceAll("[^A-Za-z0-9]","").equalsIgnoreCase(b.replaceAll("[^A-Za-z0-9]","")));
    }
}