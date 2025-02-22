
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter ");
        System.out.println("----------------------");

        while (true) {
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius ");
            System.out.println("3: Exit");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } 

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.println("Enter the Temperature");
            double Temperature = sc.nextDouble();
            double convertedTemp;
            switch (choice) {
                case 1:
                    convertedTemp=(Temperature*9/5)+32;
                    System.out.println(Temperature+" Celcius is equal to "+convertedTemp+" Fahrenheit");
                    break;
                case 2:
                    convertedTemp=(Temperature-32)*5/9;
                    System.out.println(Temperature+" Fahrenheit is equal to "+convertedTemp+" Celcius");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}
