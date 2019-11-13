package arrayAndMethod;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String inputName = scanner.nextLine();


        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.printf("Position of the students in the list %s is: %d", inputName,i+1);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.printf("Not found %s in the list.", inputName);
    }
}
