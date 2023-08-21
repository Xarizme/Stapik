import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyProgram {

    static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        int ind, i, j;
        String burole = new String();
        String butext = new String();
        StringBuilder role = new StringBuilder();
        StringBuilder text = new StringBuilder();
        StringBuilder sbf = new StringBuilder();
        for (i = 0; i < roles.length; i++) {
            for (j = 0; j < textLines.length; j++) {
                ind = textLines[j].indexOf(":");
                burole = textLines[j].substring(0, ind);
                butext = textLines[j].substring(ind + 1);
                if (burole.equals(roles[i])) {
                    text.append((j + 1) + ")" + butext + '\n');
                }
            }sbf.append(roles[i] + ":"+'\n' + text+'\n');
            text.delete(0,text.length());
        }return sbf.toString();
    }

    public static void main(String[] args) {
        try {
            String rolesInput = readFile("roles.txt", StandardCharsets.UTF_8);
            String[] roles = rolesInput.split("\n");
            String textLinesInput = readFile("textLines.txt", StandardCharsets.UTF_8);
            String[] textLines = textLinesInput.split("\n");

            MyProgram m = new MyProgram();
            System.out.print(m.printTextPerRole(roles, textLines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}