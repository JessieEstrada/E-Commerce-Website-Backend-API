package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;

/*
The CategoryService interface is essentially a contract or blueprint
that defines what methods the CategoryServiceImpl class should have.
*/

public interface CategoryService {
    CategoryResponse getAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    String deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);

    /*  MY EXAMPLE
     CategoryResponse getAllCategoriesAs();
    */
}
