import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[123]{1}[0-9]{9}", "1098949"));

    }
}