package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.CartVO;
import org.zerock.mapper.CartMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService{

	private CartMapper mapper;
	
	@Override
	public List<CartVO> getCartItem() {
		log.info("Show Cart~~~~");

		return mapper.getCart();
	}

}
