// filepath: /c:/Users/hamid/SRC/Java/shopping-website/backend/src/main/java/com/example/shopping/repository/ProductRepository.java
package com.example.shopping.repository;

import com.example.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}