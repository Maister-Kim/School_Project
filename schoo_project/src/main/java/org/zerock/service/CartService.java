package org.zerock.service;

import java.util.List;

import org.zerock.domain.CartVO;

public interface CartService {
	public List<CartVO> getCartItem();
}
