package org.zerock.service;

import java.util.List;

import org.zerock.domain.SellItemVO;

public interface ItemService {
	
	public SellItemVO get(String itemNum);
	
/*	public PictureVO getPic(String itemNum);*/

	public List<SellItemVO> getAllList();
}
