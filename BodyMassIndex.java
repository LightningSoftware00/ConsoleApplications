package LittleProjects;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bodyMassIndex = 0;

        System.out.println("\t\t******* Welcome to My BMI Project ******* \n\t\tThis is the Body Mass Index (BMI) program.");
        System.out.println("Please follow the instructions to get your BMI result.");

        System.out.print("\nPlease enter your height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        // BMI calculation
        bodyMassIndex = weight / (Math.pow(height / 100, 2));

        // Output the BMI value
        System.out.printf("Your Body Mass Index is: %.2f%n", bodyMassIndex);

        // Determine BMI category
        if (bodyMassIndex < 15) {
            System.out.println("Serious Underweight");
        } else if (bodyMassIndex >= 15 && bodyMassIndex < 16) {
            System.out.println("Severely Underweight");
        } else if (bodyMassIndex >= 16 && bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Normal (Healthy Weight)");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("Overweight");
        } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
            System.out.println("Obesity (Class 1)");
        } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
            System.out.println("Severe Obesity (Class 2)");
        } else {
            System.out.println("Morbid Obesity (Class 3)");
        }

        scanner.close();
    }
}
