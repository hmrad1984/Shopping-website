// filepath: /c:/Users/hamid/SRC/Java/shopping-website/backend/src/main/java/com/example/shopping/repository/OrderItemRepository.java
package com.example.shopping.repository;

import com.example.shopping.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}