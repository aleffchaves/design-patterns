package estruturais.flyweight.Insuranceexemple;

public class LifeInsurancePolicy implements InsurancePolicy {
    private String policyHolderName;
    private static int instanceCount;

    LifeInsurancePolicy(final String policyHolderName) {
        this.policyHolderName = policyHolderName;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public void issuePolicy(final String policyNumber) {
        System.out.println("Issue a life insurance policy with number: " + policyNumber);
    }
}
