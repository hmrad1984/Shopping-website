// filepath: /c:/Users/hamid/SRC/Java/shopping-website/backend/src/test/java/com/example/shopping/service/OrderServiceTest.java
package com.example.shopping.service;

import com.example.shopping.model.Order;
import com.example.shopping.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllOrders() {
        Order order1 = new Order();
        Order order2 = new Order();

        List<Order> orders = Arrays.asList(order1, order2);

        when(orderRepository.findAll()).thenReturn(orders);

        List<Order> result = orderService.getAllOrders();
        assertEquals(2, result.size());
    }

    @Test
    public void testCreateOrder() {
        Order order = new Order();

        when(orderRepository.save(order)).thenReturn(order);

        Order result = orderService.createOrder(order);
        assertEquals(order, result);
    }
}