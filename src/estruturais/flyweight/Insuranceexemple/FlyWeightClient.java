package estruturais.flyweight.Insuranceexemple;

public class FlyWeightClient {

    public static void main(String[] args) {

        InsurancePolicyFactory policyFactory = new InsurancePolicyFactory();

        InsurancePolicy policy1 = policyFactory.getLifeInsurancePolicy("Alef Chaves");
        policy1.issuePolicy("L001");

        InsurancePolicy policy2 = policyFactory.getLifeInsurancePolicy("Pamela Moreira");
        policy2.issuePolicy("L002");

        InsurancePolicy policy3 = policyFactory.getLifeInsurancePolicy("Aleff Chaves");
        policy3.issuePolicy("L003");

        InsurancePolicy policy4 = policyFactory.getLifeInsurancePolicy("Paulo Jose");
        policy4.issuePolicy("L004");

        System.out.println(LifeInsurancePolicy.getInstanceCount());
    }
}
