

import java.util.List;

public class Order {
    private int orderId;
    private List<OrderItem> orderItems;
    private OrderStatus orderStatus;

    public Order(int orderId, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.orderItems = orderItems;
        this.orderStatus = OrderStatus.PENDING;
    }
    public int getOrderId() {
        return orderId;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public OrderStatus getOrderStatus() {
    return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
