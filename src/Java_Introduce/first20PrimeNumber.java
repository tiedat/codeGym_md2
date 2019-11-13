package Java_Introduce;

public class first20PrimeNumber {
    public static void main(String[] args) {

        int count = 0;
        int number = 0;

        System.out.print("There are 20 first prime numbers; ");

        while (count < 20) {
            if (isPrime(number)) {
                System.out.printf("%d ,", number);
                count++;
            }
            number++;
        }
    }

    private static boolean isPrime(int number) {

        if (number == 2) {
            return true;
        }
        if (number > 2) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        } // end if number >= 2
        return false;
    }
}

