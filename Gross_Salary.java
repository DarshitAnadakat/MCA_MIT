import java.util.Scanner;

public class DarshitSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double darshitsalary = scanner.nextDouble();

        
        if (darshitsalary < 0) {
            System.out.println("Invalid input. Salary cannot be negative.");
        } else {
            double da = 0, hra = 0, ta = 0, others = 0, pf = 0;

            if (darshitsalary < 25000) {
                da = darshitsalary * 0.05;
                hra = darshitsalary * 0.05;
                ta = darshitsalary * 0.05;
                others = darshitsalary * 0.05;
                pf = 1200;
            } else if (darshitsalary < 50000) {
                da = darshitsalary * 0.15;
                hra = darshitsalary * 0.10;
                ta = darshitsalary * 0.05;
                others = darshitsalary * 0.03;
                pf = 1500;
            } else {
                da = darshitsalary * 0.25;
                hra = darshitsalary * 0.15;
                ta = darshitsalary * 0.07;
                others = darshitsalary * 0.05;
                pf = 2000;
            }

            double grossSalary = darshitsalary - (da + hra + ta + others + pf);

            System.out.println("Gross Salary after deductions: " + grossSalary);
        }

        scanner.close();
    }
}
