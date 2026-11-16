
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PROJECT_DILLAN_REID_WILSON
{
    public static void main(String[] args)
    {
        ArrayList<Policy> policies = new ArrayList<Policy>();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        try
        {
            Scanner fileInput = new Scanner(new File("PolicyInformation.txt"));

            while (fileInput.hasNextLine())
            {
                String policyLine = fileInput.nextLine().trim();

                if (!policyLine.equals(""))
                {
                    int policyNumber = Integer.parseInt(policyLine);

                    String providerName = fileInput.nextLine().trim();
                    String firstName = fileInput.nextLine().trim();
                    String lastName = fileInput.nextLine().trim();
                    int age = Integer.parseInt(fileInput.nextLine().trim());
                    String smokingStatus = fileInput.nextLine().trim();
                    double height = Double.parseDouble(fileInput.nextLine().trim());
                    double weight = Double.parseDouble(fileInput.nextLine().trim());

                    Policy policy = new Policy(policyNumber,
                            providerName, firstName, lastName, age,
                            smokingStatus, height, weight);

                    policies.add(policy);
                }
            }

            fileInput.close();

            for (int i = 0; i < policies.size(); i++)
            {
                Policy policy = policies.get(i);

                System.out.println("Policy Number: " +
                        policy.getPolicyNumber());
                System.out.println("Provider Name: " +
                        policy.getProviderName());
                System.out.println("Policyholder's First Name: " +
                        policy.getFirstName());
                System.out.println("Policyholder's Last Name: " +
                        policy.getLastName());
                System.out.println("Policyholder's Age: " +
                        policy.getAge());
                System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " +
                        policy.getSmokingStatus());
                System.out.println("Policyholder's Height: " +
                        policy.getHeight() + " inches");
                System.out.println("Policyholder's Weight: " +
                        policy.getWeight() + " pounds");
                System.out.printf("Policyholder's BMI: %.2f%n",
                        policy.calculateBMI());
                System.out.printf("Policy Price: $%.2f%n",
                        policy.calculatePolicyPrice());

                System.out.println();

                if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
                {
                    smokerCount++;
                }
                else
                {
                    nonSmokerCount++;
                }
            }

            System.out.println("The number of policies with a smoker is: " +
                    smokerCount);
            System.out.println("The number of policies with a non-smoker is: " +
                    nonSmokerCount);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: PolicyInformation.txt was not found.");
        }
    }
}
