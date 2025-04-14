package com.ecommerce.project.payload;

/*
The CategoryDTO is like a simplified version of the
model (Category), but with only the necessary
fields that you want to expose to the user or
share between layers (like the controller and client).
*/
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;

    public CategoryDTO() {
    }

    public CategoryDTO(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
