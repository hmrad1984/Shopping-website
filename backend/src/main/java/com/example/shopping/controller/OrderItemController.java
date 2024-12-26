// filepath: /c:/Users/hamid/SRC/Java/shopping-website/backend/src/main/java/com/example/shopping/controller/OrderItemController.java
package com.example.shopping.controller;

import com.example.shopping.model.OrderItem;
import com.example.shopping.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.createOrderItem(orderItem);
    }
}