package estruturais.flyweight.Insuranceexemple;

import java.util.HashMap;
import java.util.Map;

public class InsurancePolicyFactory {
    private static Map<String, InsurancePolicy> policeCache = new HashMap<>();

    public InsurancePolicy getLifeInsurancePolicy(final String policyHolderName) {
        InsurancePolicy insurancePolicy = policeCache.get(policyHolderName);

        if (insurancePolicy == null) {
            insurancePolicy = new LifeInsurancePolicy(policyHolderName);
            policeCache.put(policyHolderName, insurancePolicy);
        }

        return insurancePolicy;
    }

    public static int getInstanceCount() {
        return policeCache.size();
    }
}
