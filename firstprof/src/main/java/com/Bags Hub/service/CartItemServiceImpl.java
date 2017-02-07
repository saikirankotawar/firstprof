package com.Bags Hub.service;

import com.Bags Hub.dao.CartItemDao;
import com.Bags Hub.model.Cart;
import com.Bags Hub.model.CartItem;
import com.Bags Hub.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
    	
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
    	System.out.println("In Remove Cart item service");
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByItemId (int itemId) {
        return cartItemDao.getCartItemByItemId(itemId);
    }
}
