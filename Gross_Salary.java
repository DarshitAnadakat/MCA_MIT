import java.util.Scanner;

public class DarshitSalary {
    public static void main(String[] args) {
        
        if (!DarshitSalary.class.getSimpleName().equals("DarshitSalary")) {
            System.out.println("Error: The class name must be 'DarshitSalary'. Program will terminate.");
            return;
        }
        System.out.println(" by darshit anadkat");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        if (salary < 0) {
            System.out.println("Invalid input. Salary cannot be negative.");
        } else {
            double da = 0, hra = 0, ta = 0, others = 0, pf = 0;

            if (salary < 25000) {
                da = salary * 0.05;
                hra = salary * 0.05;
                ta = salary * 0.05;
                others = salary * 0.05;
                pf = 1200;
            } else if (salary < 50000) {
                da = salary * 0.15;
                hra = salary * 0.10;
                ta = salary * 0.05;
                others = salary * 0.03;
                pf = 1500;
            } else {
                da = salary * 0.25;
                hra = salary * 0.15;
                ta = salary * 0.07;
                others = salary * 0.05;
                pf = 2000;
            }

            double grossSalary = salary - (da + hra + ta + others + pf);

            System.out.println("Gross Salary after deductions: " + grossSalary);
        }

        scanner.close();
    }
}
