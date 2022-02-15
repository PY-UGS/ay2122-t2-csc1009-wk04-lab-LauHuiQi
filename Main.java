
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String arg[]) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        BMI bmi = new BMI(height, weight);

        df.setRoundingMode(RoundingMode.UP);

        System.out.println("Your BMI is " + bmi.getBMI());
        System.out.println("Your BMI is " + bmi.getStatus());

        int sizeOfList = 10;
        StackOfInegers stack = new StackOfInegers(sizeOfList);

        for (int i = 0; i < sizeOfList; i++) {
            stack.push(i);
        }

        System.out.println();
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

    }
}
