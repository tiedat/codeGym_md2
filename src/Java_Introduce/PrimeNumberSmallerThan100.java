package Java_Introduce;

public class PrimeNumberSmallerThan100 {
    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            if (isPrime(i)){
                System.out.printf("%d ,",i);
            }
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
