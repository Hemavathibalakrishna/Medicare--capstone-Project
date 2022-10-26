package com.simplilearn.medicare.serviceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.simplilearn.medicare.entity.Cart;
import com.simplilearn.medicare.entity.CartItem;
import com.simplilearn.medicare.entity.User;
import com.simplilearn.medicare.repository.CartItemRepo;
import com.simplilearn.medicare.repository.CartRepo;

@Service
public class CartService {

	@Autowired
	CartRepo cartRepo;
	@Autowired
	CartItemRepo cartItemRepo;

	public Cart addToCart(User user, CartItem cartItem) {
     
		Cart cartObj = fetchCart(user);
		cartObj.getCartItems().add(cartItem);
		cartObj = cartRepo.save(cartObj);
		cartItem.setCart(cartObj);
		cartItem = cartItemRepo.save(cartItem);
		return cartObj;

	}

//	public boolean deleteCartItem(int id) {
//		cartRepo.deleteById(id);
//		return true;

	//}

	public Cart fetchCart(User user) {
//	Cart cart = new Cart();
//		cart.setUser(user);
		//Example<Cart> ex = Example.of(cart);

	//	Optional<Cart> foundCart = cartRepo.findOne(ex);
		Cart foundCart=cartRepo.findByUser(user);
		if (foundCart==null) {
			foundCart=new Cart();
			foundCart.setUser(user);
			foundCart.setCartItems(new ArrayList<CartItem>());
		} 
		return foundCart;

	}
}
