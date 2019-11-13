import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rate = 23000.0d;

        do {
            System.out.print("Enter amount USD: ");
            double usd = scanner.nextDouble();

            double vnd = usd * rate;
            System.out.printf("Covert to VND: %.2f \n", vnd);

            if (usd == -1) {
                System.exit(0);
            }
        } while (true);

    }
}
