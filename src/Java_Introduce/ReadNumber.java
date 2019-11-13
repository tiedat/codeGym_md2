package Java_Introduce;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("which number do you want to read ?");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("zero");
        } else if (number < 100) {
            System.out.println(smallerThan100(number));
        } else if (number < 1000) {

            int hundreds = number / 100;
            int modulus100 = number % 100;
            if (modulus100 == 0) {
                System.out.println(oneToNine(hundreds) + " hundred");
            } else {
                System.out.println(oneToNine(hundreds)
                        + " hundred and " + smallerThan100(modulus100));
            }
        }
    }

    private static String oneToNine(int number) {
        String letter = "";
        switch (number) {
            case 0:
                break;
            case 1:
                letter = "one";
                break;
            case 2:
                letter = "two";
                break;
            case 3:
                letter = "three";
                break;
            case 4:
                letter = "four";
                break;
            case 5:
                letter = "five";
                break;
            case 6:
                letter = "six";
                break;
            case 7:
                letter = "seven";
                break;
            case 8:
                letter = "eight";
                break;
            case 9:
                letter = "nine";
                break;
            default:
                letter = "out of ability";
        } //end switch
        return letter;
    }

    private static String smallerThan100(int number) {
        String letter = "";
        if (number < 10) {
            return oneToNine(number);
        } else if (number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    letter = "ten";
                    break;
                case 1:
                    letter = "eleven";
                    break;
                case 2:
                    letter = "twelve";
                    break;
                case 3:
                    letter = "thirteen";
                    break;
                case 4:
                    letter = "fourteen";
                    break;
                case 5:
                    letter = "fifteen";
                    break;
                case 6:
                    letter = "sixteen";
                    break;
                case 7:
                    letter = "seventeen";
                    break;
                case 8:
                    letter = "eighteen";
                    break;
                case 9:
                    letter = "nineteen";
                    break;
                default:
                    letter = "out of ability";
            } // end switch
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            switch (tens) {
                case 2:
                    letter = "twenty ";
                    break;
                case 3:
                    letter = "thirty ";
                    break;
                case 4:
                    letter = "fourty ";
                    break;
                case 5:
                    letter = "fifty ";
                    break;
                case 6:
                    letter = "sixty ";
                    break;
                case 7:
                    letter = "seventy ";
                    break;
                case 8:
                    letter = "eighty ";
                    break;
                case 9:
                    letter = "ninety ";
                    break;
                default:
                    letter = "out of ability";
            } //end switch
            letter += oneToNine(ones);
        } // end else if
        return letter;
    }
}
