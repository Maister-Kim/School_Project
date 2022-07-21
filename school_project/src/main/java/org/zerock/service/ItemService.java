package org.zerock.service;

import java.util.List;

import org.zerock.domain.GoodsVO;

public interface ItemService {
	
	public GoodsVO get(String itemNum);
	
/*	public PictureVO getPic(String itemNum);*/

	public List<GoodsVO> getAllList();
}
