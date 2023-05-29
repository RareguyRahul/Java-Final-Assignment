package in.ineuron.controller;
import in.ineuron.user.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.dao.OrderRepository;
import in.ineuron.order.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/user/{userId}")
    public List<Order> getOrdersByUser(@PathVariable Integer userId) {
        User user = new User();
        user.setId(userId);
        return orderRepository.findByUser(user);
    }

}
