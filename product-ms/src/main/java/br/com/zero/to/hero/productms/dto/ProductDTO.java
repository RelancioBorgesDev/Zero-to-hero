package br.com.zero.to.hero.productms.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProductDTO {

    @NotBlank(message = "O campo nome é obrigatório !")
    private String name;

    @Size(min = 50)
    private String description;

    @Positive
    private double price;

    private boolean available;
}
