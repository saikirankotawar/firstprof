package com.Bags Hub.service;

import com.Bags Hub.model.Cart;


public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
