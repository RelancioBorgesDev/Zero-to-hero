package br.com.zero.to.hero.productms.service;

import java.util.Optional;

import br.com.zero.to.hero.productms.dto.ProductDTO;

public interface ProductService {
    Optional<ProductDTO> create(ProductDTO request);
}