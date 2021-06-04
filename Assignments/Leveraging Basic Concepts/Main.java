import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		/* Tax Calculator */
        System.out.println(" Tax Calculator App ");
        System.out.println("----- WELCOME ------");

        System.out.println();   // Just a new line

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total person count: ");
        int n = scanner.nextInt();

        System.out.println();   // New line

        String[] names = new String[n];
        long[] incomes = new long[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i+1) + " : ");
            names[i] = scanner.next();
            System.out.println("Enter " + names[i] + "'s Annual Income: ");
            incomes[i] = scanner.nextLong();
            System.out.println();   // new line
        }

        scanner.close();

        System.out.println(" Names with liable taxes");
        System.out.println("---------------------------");

        for (int i = 0; i < n; i++) {
            calculateTax(names[i], incomes[i]);
        }
    }

    private static void calculateTax(String name, long income) {

        long tax;

        if (income >= 300000) {
            tax = income * 20 / 100;
        } else if (income >= 100000) {
            tax = income * 10 / 100;
        } else {
            tax = 0;
        }

        System.out.println(" " + name +" : "+ '\u20B9' + " " + tax);
    }
}
