package strategy;

import java.math.BigDecimal;

public class VATTax implements Tax {
    public BigDecimal calculate(Invoice invoice) {
        return invoice.getCost()
                .multiply(BigDecimal.valueOf(0.1));
    }
}
