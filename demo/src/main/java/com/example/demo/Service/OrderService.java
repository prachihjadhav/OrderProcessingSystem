
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderService {
    void createOrder(OrderRequest orderRequest);
    Order getOrder(int orderId);
    List<Order> getAllOrders();
    List<Order> getOrdersByStatus(OrderStatus status);
    void updateOrderStatus(int orderId, OrderStatus status);
    void cancelOrder(int orderId);


}
