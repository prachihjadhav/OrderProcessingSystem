
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService service;
    public OrderController(OrderService service){
        this.service = service;
    }
    //create order
    @PostMapping
    public String createOrder(@RequestBody OrderRequest request){
        service.createOrder(request);
        return "Order Created";
    }

    //read order
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable String id){
        return service.getOrder(Integer.parseInt(id));
    }

    //List
    @GetMapping
    public List<Order> getAllOrders(){
        return service.getAllOrders();

    }

    //update
    @PutMapping("/{id}")
    public String updateStatus(@PathVariable int id,@RequestParam OrderStatus status){
        service.updateOrderStatus(id,status);
        return "Order Updated";
    }

    //cancel
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id){
        service.cancelOrder(id);
        return "Order Deleted";
    }
}
