package strategy;

import java.math.BigDecimal;
import java.util.function.Function;

public class StrategyByFunctionalInterface {

    public static void main(String[] args) {
        Invoice invoice =  new Invoice(BigDecimal.valueOf(1000));
        Function<Invoice, BigDecimal> vatTax = iv -> iv.getCost().multiply(BigDecimal.valueOf(0.1)) ;
        Function<Invoice, BigDecimal> GalaxyTax = iv -> iv.getCost().multiply(BigDecimal.valueOf(0.9)) ;

        System.out.println("VAT tax : " +Calculator.calculateTax(vatTax, invoice));
        System.out.println("Galaxy tax : " +Calculator.calculateTax(GalaxyTax, invoice));
    }

    public static class Calculator{
        public static BigDecimal calculateTax(Function<Invoice, BigDecimal> function, Invoice invoice) {
            return function.apply(invoice);
        }
    }
}
