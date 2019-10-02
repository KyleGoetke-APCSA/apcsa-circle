
import java.util.Scanner;

public class apcsacircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter a diameter: ");
		double diameter = in.nextDouble();
		double area = Math.PI * Math.pow((diameter / 2), 2);
		System.out.printf("\nThe area of a circle with a diameter of %.1f is %.1f.", diameter, area);

        in.close();
    }
}
