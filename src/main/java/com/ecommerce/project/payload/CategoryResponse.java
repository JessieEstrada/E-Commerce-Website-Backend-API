package com.ecommerce.project.payload;

import java.util.List;
/*
The CategoryResponse class is used to wrap the
response data you plan to send back to the client.
*/
public class CategoryResponse {
    private List<CategoryDTO> content;

    public CategoryResponse() {
    }

    public CategoryResponse(List<CategoryDTO> content) {
        this.content = content;
    }

    public List<CategoryDTO> getContent() {
        return content;
    }

    public void setContent(List<CategoryDTO> content) {
        this.content = content;
    }
}
