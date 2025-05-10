package com.example.IntroToSpringboot.Repository;
import com.example.IntroToSpringboot.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// fetching data using ORM framework - JPA

@Repository
public interface ProductRepositoryV2 extends JpaRepository<Product, Long> {
}
