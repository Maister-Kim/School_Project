package org.zerock.controller;

import javax.servlet.http.HttpSession;

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
	public String itemForm(@RequestParam("itemNum") String itemNum, Model model) {
		log.info("itemNum: " + itemNum);

		model.addAttribute("vegi", service.get(itemNum));
//		model.addAttribute("goodsList", service.getAllList());

//		log.info(service.get(itemNum));

		return "/item/vegiForm";
	}

/*	@GetMapping("/cart")
	public String viewCart(@RequestParam("itemNum") String itemNum, Model model)
	{
 
		log.info("Shopping Cart");
			
		model.addAttribute("cart", cartService.getCartItem());
		// 아이템 데이터도 전송
			
		return "/item/cart";
	}*/

/*	@RequestMapping(value="/myCartList.do" ,method = RequestMethod.GET)
	public ModelAndView myCartMain(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		String viewName=(String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		HttpSession session=request.getSession();
		MemberVO memberVO=(MemberVO)session.getAttribute("memberInfo");
		String member_id=memberVO.getMember_id();
		cartVO.setMember_id(member_id);
		Map<String ,List> cartMap=cartService.myCartList(cartVO);
		session.setAttribute("cartMap", cartMap);//��ٱ��� ��� ȭ�鿡�� ��ǰ �ֹ� �� ����ϱ� ���ؼ� ��ٱ��� ����� ���ǿ� �����Ѵ�.
		//mav.addObject("cartMap", cartMap);
		return mav;
	}*/
}

/*@GetMapping({"/get","/modify"})
public void get(@RequestParam("bno") Long bno, 
		@ModelAttribute("cri") Criteria cri, Model model) {
	log.info("/get or modify");
	model.addAttribute("board", service.get(bno));
}*/