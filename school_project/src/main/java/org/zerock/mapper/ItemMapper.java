package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.GoodsVO;

public interface ItemMapper {

	public GoodsVO read(String itemNum);
	
//	public SellItemVo picture(String itemNum);
	
	public List<GoodsVO> readAllList();
	
	public GoodsVO insertCart(String itemNum);
	
}
