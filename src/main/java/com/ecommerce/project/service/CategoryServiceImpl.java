package com.ecommerce.project.service;

import com.ecommerce.project.exceptions.APIException;
import com.ecommerce.project.exceptions.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;
import com.ecommerce.project.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
When you create the CategoryServiceImpl class, you’re implementing the methods defined
in the CategoryService interface, which will contain the actual business logic (How).
*/

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryResponse getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()){
            throw new APIException("No categories found!");
        }
        List<CategoryDTO> categoryDTOS = categories.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .toList();
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setContent(categoryDTOS);
        return categoryResponse;
    }
        @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = modelMapper.map(categoryDTO, Category.class);
        Category categoryDb = categoryRepository.findByCategoryName(category.getCategoryName());
        if (categoryDb != null){
            throw new APIException("Category with the name " + category.getCategoryName() + " already exists!");
        }
        Category savedCategory = categoryRepository.save(category);
        return modelMapper.map(savedCategory, CategoryDTO.class);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category", "CategoryId", categoryId));

        categoryRepository.delete(category);
        return "Category with categoryId: " + categoryId + " deleted successfully !!";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Category savedCategory =  categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category", "CategoryId", categoryId));

        category.setCategoryId(categoryId);
        savedCategory = categoryRepository.save(category);
        return savedCategory;
    }
}



/*  MY EXAMPLE

@Override
public CategoryResponse getAllCategoriesAs() {
    List<Category> categoriesInDB = categoryRepository.findAll();

    List<CategoryDTO> categoryDTOS = categoriesInDB.stream()
            .filter(category -> category.getCategoryName().toLowerCase().startsWith("a"))
            .map(category -> modelMapper.map(category, CategoryDTO.class))
            .toList();
    if(categoryDTOS.isEmpty()){
        throw new APIException("No categories found! With A");
    }
    CategoryResponse categoryResponse= new CategoryResponse();
    categoryResponse.setContent(categoryDTOS);
    return categoryResponse;
}
*/