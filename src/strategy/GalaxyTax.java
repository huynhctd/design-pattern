package strategy;

import java.math.BigDecimal;

public class GalaxyTax implements Tax{
    public BigDecimal calculate(Invoice invoice) {
        return invoice.getCost()
                .multiply(BigDecimal.valueOf(0.9));
    }
}
