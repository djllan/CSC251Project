
public class Policy
{
    // Policy information
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Creates a Policy object with default values.
     */
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    /**
     * Creates a Policy object with the specified information.
     *
     * @param policyNumber the policy number
     * @param providerName the insurance provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */
    public Policy(int policyNumber, String providerName,
                  String firstName, String lastName, int age,
                  String smokingStatus, double height, double weight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber the policy number
     */
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Sets the insurance provider name.
     *
     * @param providerName the insurance provider name
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * Sets the policyholder's first name.
     *
     * @param firstName the policyholder's first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Sets the policyholder's last name.
     *
     * @param lastName the policyholder's last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Sets the policyholder's age.
     *
     * @param age the policyholder's age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Sets the policyholder's smoking status.
     *
     * @param smokingStatus the policyholder's smoking status
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Sets the policyholder's height.
     *
     * @param height the policyholder's height in inches
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Sets the policyholder's weight.
     *
     * @param weight the policyholder's weight in pounds
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * Returns the policy number.
     *
     * @return the policy number
     */
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Returns the insurance provider name.
     *
     * @return the insurance provider name
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Returns the policyholder's first name.
     *
     * @return the policyholder's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Returns the policyholder's last name.
     *
     * @return the policyholder's last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Returns the policyholder's age.
     *
     * @return the policyholder's age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Returns the policyholder's smoking status.
     *
     * @return the policyholder's smoking status
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * Returns the policyholder's height.
     *
     * @return the policyholder's height in inches
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Returns the policyholder's weight.
     *
     * @return the policyholder's weight in pounds
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Calculates the policyholder's body mass index (BMI).
     *
     * @return the policyholder's BMI
     */
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates the insurance policy price.
     *
     * @return the total insurance policy price
     */
    public double calculatePolicyPrice()
    {
        double price = 600.0;

        if (age > 50)
        {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price += 100.0;
        }

        if (calculateBMI() > 35)
        {
            price += (calculateBMI() - 35) * 20;
        }

        return price;
    }
}
