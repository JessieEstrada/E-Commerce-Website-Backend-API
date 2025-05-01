package com.ecommerce.project.payload;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {

    private Long cartId;

    private Double totalprice = 0.0;

    private List<ProductDTO> products = new ArrayList<>();

    public CartDTO() {
    }

    public CartDTO(Long cartId, Double totalprice, List<ProductDTO> products) {
        this.cartId = cartId;
        this.totalprice = totalprice;
        this.products = products;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}
