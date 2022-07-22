package org.zerock.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.zerock.domain.CartVO;
import org.zerock.domain.GoodsVO;

public interface CartService {
	List<CartVO> getCart();
	
	public Map<String, List> getMyCartItem();

	public List<GoodsVO> selectGoodsList(List<CartVO> cartList) throws DataAccessException;
}
