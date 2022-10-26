
package com.simplilearn.medicare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.Cart;
import com.simplilearn.medicare.entity.CartItem;
import com.simplilearn.medicare.entity.Product;
import com.simplilearn.medicare.entity.User;
import com.simplilearn.medicare.serviceImpl.CartService;
import com.simplilearn.medicare.serviceImpl.ProductService;
import com.simplilearn.medicare.view.CartItemEntry;
import com.simplilearn.medicare.view.CartView;
import com.simplilearn.medicare.view.CartViewItem;





@RestController
public class CartController {
    @Autowired
	private CartService service;
    
    @Autowired
    
    private ProductService productService;
   

	@PostMapping("/cart/{userToken}")
	@CrossOrigin(origins = "http://localhost:4200")
	public CartView addToCart(@PathVariable String userToken, @RequestBody CartItemEntry cartItemEntry) {
		//TODO fetch user from session
		User user = new User();
		user.setUserId(1);
		Product product=productService.findByProductId(cartItemEntry.getProductId());
		
		
		CartItem cartItem=new CartItem();
		cartItem.setProduct(product);
		cartItem.setQuantity(cartItemEntry.getQuantity());
		
				
		Cart cart=service.addToCart(user, cartItem);
		List<CartItem> cartItems=cart.getCartItems();
		List<CartViewItem> cartViewItems=new ArrayList<CartViewItem>();
		for(CartItem cItem: cartItems) {
			CartViewItem cartViewItem=new CartViewItem(cItem.getCartItemId(),cItem.getProduct(),
					cItem.getQuantity(),cItem.getSubTotal());
			cartViewItems.add(cartViewItem);
		}
		CartView cartView=new CartView(cart.getCartId(),cartViewItems,cart.getTotalAmount());
		
        return cartView;
	}
	
	
	//get cart
	
	@GetMapping("/cart/{userToken}")
	@CrossOrigin(origins = "http://localhost:4200")
	public CartView getCart(@PathVariable String userToken) {
		//TODO fetch user from session
		User user = new User();
		user.setUserId(1);
		Cart cartObj = service.fetchCart(user);

		List<CartItem> cartItems=cartObj.getCartItems();
		List<CartViewItem> cartViewItems=new ArrayList<CartViewItem>();
		for(CartItem cItem: cartItems) {
			CartViewItem cartViewItem=new CartViewItem();
			cartViewItem.setCartItemId(cItem.getCartItemId());
			cartViewItem.setProductId(cItem.getProduct().getPId());
			cartViewItem.setProductName(cItem.getProduct().getProductName());
			cartViewItem.setImageUrl(cItem.getProduct().getImageUrl());
			cartViewItem.setPrice(cItem.getProduct().getPrice());
			cartViewItem.setQuantity(cItem.getQuantity());
			cartViewItems.add(cartViewItem);
		}
		CartView cartView=new CartView(cartObj.getCartId(),cartViewItems,cartObj.getTotalAmount());
		
        return cartView;
	}
	
	
	

}
