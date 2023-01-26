package br.com.zero.to.hero.productms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zero.to.hero.productms.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
