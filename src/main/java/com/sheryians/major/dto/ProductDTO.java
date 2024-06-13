package com.sheryians.major.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private int categoryId;
    private Double price;
    private String author;
    private String imageName;

}
