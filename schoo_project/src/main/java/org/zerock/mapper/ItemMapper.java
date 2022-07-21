package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.SellItemVO;

public interface ItemMapper {

	public SellItemVO read(String itemNum);
	
//	public SellItemVo picture(String itemNum);
	
	public List<SellItemVO> readAllList();
	
}
