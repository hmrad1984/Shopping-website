// filepath: /c:/Users/hamid/SRC/Java/shopping-website/backend/src/main/java/com/example/shopping/repository/UserRepository.java
package com.example.shopping.repository;

import com.example.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}