package ClassBoxDataValidation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(input.readLine());
        double width = Double.parseDouble(input.readLine());
        double height = Double.parseDouble(input.readLine());
        try {
            Box box = new Box(length,width,height);
            box.printResult();
        }catch (IllegalArgumentException msg){
            System.out.println(msg.getMessage());
        }
    }
}
