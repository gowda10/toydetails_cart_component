package com.kidzoo.toydetails.dto.cart;

import com.kidzoo.toydetails.model.Product;
import com.kidzoo.toydetails.model.Cart;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class CartItemDto {
    private UUID basketId;
    private @NotNull Integer quantity;
    private @NotNull Product product;

    public CartItemDto() {
    }

    public CartItemDto(Cart cart) {
        this.setBasketId(cart.getBasketId());
        this.setQuantity(cart.getQuantity());
        this.setProduct(cart.getProduct());
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "basketId=" + basketId +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UUID getBasketId() {
        return basketId;
    }

    public CartItemDto setBasketId(UUID basketId) {
        this.basketId = basketId;
        return this;
    }
}
