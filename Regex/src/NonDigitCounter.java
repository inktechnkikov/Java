import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonDigitCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        Pattern searchPatern = Pattern.compile("[^0-9]");
        Matcher paternMach = searchPatern.matcher(text);
        int counter = 0;
        while (paternMach.find()){
            counter++;
        }
        System.out.printf("Non-digits: %d", counter);
    }
}
