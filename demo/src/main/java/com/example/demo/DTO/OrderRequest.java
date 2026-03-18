
import com.OrderProcessing.practice.Model.OrderItem;

import java.util.List;

public class OrderRequest {
    private int orderId;
    private List<OrderItem> orderItems;

    public OrderRequest(int orderId, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.orderItems = orderItems;

    }

    public int getOrderId() {
        return orderId;

    }

    public List<OrderItem> getOrderItems() {

        return orderItems;
    }
}
