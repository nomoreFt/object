package christmas.v1;

import christmas.v1.order.Order;

public interface EventPolicy {
    void applyEvent(Order order);
}
