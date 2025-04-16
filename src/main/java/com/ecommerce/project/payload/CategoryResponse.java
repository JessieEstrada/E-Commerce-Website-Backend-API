package com.ecommerce.project.payload;

import java.util.List;
/*
The CategoryResponse class is used to wrap the
response data you plan to send back to the client.
*/
public class CategoryResponse {
    private List<CategoryDTO> content;
    private Long totalElements;
    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalPages;
    private boolean lastPage;

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

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }
}
