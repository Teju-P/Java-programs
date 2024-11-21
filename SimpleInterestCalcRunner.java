import java.math.BigDecimal;

class SimpleInterestCalcRunner{
    public static void main(String[] args) {
        SimpleInterestCalc x = new SimpleInterestCalc("4500.00","7.5");
        BigDecimal total = x.calcTotalValue(5);
        System.out.println(total);
    }
}