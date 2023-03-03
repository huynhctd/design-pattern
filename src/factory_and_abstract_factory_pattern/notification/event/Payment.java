package factory_and_abstract_factory_pattern.notification.event;

import java.math.BigDecimal;

public class Payment implements Event{
    String id;
    BigDecimal amount;

    public Payment(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{ "
                +"id = " + this.id
                +" ,amount =  " + this.amount
                +"} ";
    }
}
