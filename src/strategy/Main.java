package strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new BigDecimal("1500"));

        Context galaxy = new Context(new GalaxyTax());
        Context vat = new Context(new VATTax());

        System.out.println("VAT tax : " +vat.calculateTax(invoice));
        System.out.println("Galaxy tax : " +galaxy.calculateTax(invoice));
    }
}
