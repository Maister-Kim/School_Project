package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.GoodsVO;
import org.zerock.mapper.ItemMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService{

	private ItemMapper mapper;
	
	@Override
	public GoodsVO get(String itemNum) {
		log.info("get...."+ itemNum);
		
		return mapper.read(itemNum);
	}

/*	@Override
	public PictureVO getPic(String itemNum) {
		log.info("get picture..."+itemNum);
		
		return mapper.picture(itemNum);
	}*/

	@Override
	public List<GoodsVO> getAllList() {
		log.info("get All picture...");
		return mapper.readAllList();
	}


}
