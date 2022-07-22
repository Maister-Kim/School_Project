package org.zerock.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.zerock.domain.CartVO;
import org.zerock.domain.GoodsVO;


public interface CartMapper {

	public List<CartVO> getCart();
	
	public List<GoodsVO> selectGoodsList(List<CartVO> cartList);
	
}
