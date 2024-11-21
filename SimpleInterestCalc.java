import java.math.BigDecimal;

public class SimpleInterestCalc {
    BigDecimal principal, interest;
    SimpleInterestCalc(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    BigDecimal calcTotalValue(int noOfYears){
        BigDecimal numberOfYears = new BigDecimal(noOfYears);
        // totalValue = principal + principal * interest * noOfYears;
        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(numberOfYears));
        return totalValue;
    }
}
