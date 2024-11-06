
package david_hernandez_assignment_2;

import java.util.Scanner;
/**
 *
 * @author 6309110
 */
public class David_hernandez_assignment_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        task4();
    }
    
    public static void task1(Scanner console){
        System.out.println("Welcome to the world population calculator");
        System.out.print("Enter the current world population: ");
        double pop = console.nextDouble();
        System.out.print("Enter the current grouwth rate: (e.g, 1.14% would be .0114): ");
        double rate = console.nextDouble();
        System.out.printf("%4s%25s%25s", "Year", "Estimated Population", "Change from prior year\n");
        
        double change;
        
        for (int i = 1; i <= 75; i++) {
            change = pop * rate;
            pop += change;
            System.out.printf("%4d%25.0f%24.0f\n", i, pop, change);
        }
    }
    
    public static void task2(Scanner console) {
        System.out.printf("%-8s%-8s%-8s\n", "Side 1", "Side 2", "Side 3");
        
        int max = 500;
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                for (int k = 1; k <= max; k++) {
                    if (i * i + j * j == k * k) {
                        System.out.printf("%-8d%-8d%-8d\n", i, j, k
                        );
                    }
                }
            }
        }
    }
    
    public static void task3(Scanner console) {
        double sum = 0.0;
        while (true) {
            System.out.print("Enter product number (1-5 or 0 to stop): ");
            int num = console.nextInt();
            if (num == 0) {
                break;
            }
            System.out.print("Enter quantity sold: ");
            int quantity = console.nextInt();
            
            double money = 0;
            switch (num) {
                case 1 -> money = 2.98;
                case 2 -> money = 4.5;
                case 3 -> money = 9.98;
                case 4 -> money = 4.49;
                case 5 -> money = 6.87;
            }
            sum += quantity * money;
        }
        System.out.println("Total retail value of all products sold is: $" + sum);
    }
    
    public static void task4() {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}