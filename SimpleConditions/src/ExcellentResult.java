import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double result = Double.parseDouble(console.nextLine());
        if(result >= 5.50){
            System.out.println("Excellent!");
        }
    }
}