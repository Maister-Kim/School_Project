package org.zerock.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.domain.CartVO;
import org.zerock.domain.GoodsVO;
import org.zerock.mapper.CartMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService{

	private CartMapper mapper;
	
	@Override
	public List<CartVO> getCart() {
		log.info("Show Cart~~~~");

		return mapper.getCart();
	}
	
	@Override
	public List<GoodsVO> selectGoodsList(List<CartVO> cartList) throws DataAccessException {
		List<GoodsVO> myGoodsList = mapper.selectGoodsList(cartList);
		
		return myGoodsList;
	}	
	
	public Map<String, List> getMyCartItem()
	{
		Map<String, List> cartMap = new HashMap<String, List>();
		List<CartVO> myCartList = mapper.getCart();
		if(myCartList.size()==0) { // 카트가 비어있음
			return null;
		}
		
		List<GoodsVO> myGoodsList = selectGoodsList(myCartList);
		
		cartMap.put("myCartList", myCartList);
		cartMap.put("myGoodsList", myGoodsList);
		
		return cartMap; 
	}

	
/*	public Map<String ,List> myCartList(CartVO cartVO) throws Exception{
		Map<String,List> cartMap=new HashMap<String,List>();
		List<CartVO> myCartList=cartDAO.selectCartList(cartVO);
		if(myCartList.size()==0){ //īƮ�� ����� ��ǰ�̾��� ���
			return null;
		}
		List<GoodsVO> myGoodsList=cartDAO.selectGoodsList(myCartList);
		cartMap.put("myCartList", myCartList);
		cartMap.put("myGoodsList",myGoodsList);
		return cartMap;
	}*/

}
