package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.service.CartService;
import org.zerock.service.ItemService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/item/*")
@AllArgsConstructor
public class ItemController {

	private ItemService service;
	
	private CartService cartService;
	
	@GetMapping("/vegiForm")
	public String itemForm(@RequestParam("itemNum") String itemNum, Model model)
	{
		log.info("itemNum: "+itemNum);
		
		model.addAttribute("vegi", service.get(itemNum));
//		model.addAttribute("goodsList", service.getAllList());
		
//		log.info(service.get(itemNum));
		
		return "/item/vegiForm";
	}
	
	@GetMapping("/cart")
	public String viewCart(/*@RequestParam("itemNum") String itemNum, */Model model)
	{

			log.info("Shopping Cart");
			
			model.addAttribute("cart", cartService.getCartItem());
			
			return "/item/cart";
	}
	
}


/*@GetMapping({"/get","/modify"})
public void get(@RequestParam("bno") Long bno, 
		@ModelAttribute("cri") Criteria cri, Model model) {
	log.info("/get or modify");
	model.addAttribute("board", service.get(bno));
}*/