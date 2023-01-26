package br.com.zero.to.hero.productms.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zero.to.hero.productms.dto.ProductDTO;
import br.com.zero.to.hero.productms.model.Product;
import br.com.zero.to.hero.productms.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<ProductDTO> create(ProductDTO request) {
        ModelMapper mapper = new ModelMapper();
        //Mapear os valores recebidos na request para a classe Product
        Product product = mapper.map(request, Product.class);

        //Salvar e atualizar o produto no banco
        productRepository.saveAndFlush(product);

        //Mapear os valores do produto para a classe ProductDTO
        ProductDTO response = mapper.map(product, ProductDTO.class);

        //Retornar a res
        return Optional.of(response);
    }

}
