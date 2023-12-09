package strategy;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Invoice invoice);
}
