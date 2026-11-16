

import java.util.Scanner;

public class PROJECT_DILLAN_REID_WILSON
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();
        System.out.println();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = keyboard.nextLine();
        System.out.println();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = keyboard.nextLine();
        System.out.println();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();
        System.out.println();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = keyboard.nextDouble();
        System.out.println();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = keyboard.nextDouble();

        Policy policy = new Policy(policyNumber, providerName,
                firstName, lastName, age, smokingStatus,
                height, weight);

        System.out.println();
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println();
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println();
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println();
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println();
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println();
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println();
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println();
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.println();
        System.out.printf("Policyholder’s BMI: %.2f%n", policy.calculateBMI());
        System.out.println();
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());

        keyboard.close();
    }
}
