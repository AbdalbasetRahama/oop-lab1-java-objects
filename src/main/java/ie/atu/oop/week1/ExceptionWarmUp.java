package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out.println("Enter a PageCount");
            String message = sc.nextLine();

            try {
                int pageCount = Integer.parseInt(message);
                System.out.println("Entered: " + pageCount);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }



    }
}
