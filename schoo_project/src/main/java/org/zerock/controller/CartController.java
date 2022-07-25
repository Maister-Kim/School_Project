package org.zerock.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.domain.CartVO;
import org.zerock.mapper.CartMapper;
import org.zerock.service.CartService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/cart")
@Log4j
@AllArgsConstructor
public class CartController {

	private CartService cartService;
	
	@GetMapping("/myCart")
	public String CartList(Model model) {
		Map<String, List> cartMap = cartService.getMyCartItem();
		/*		List<CartVO> myCartList = mapper.getCart();*/
		
//		model.addAttribute("cart", cartService.getMyCartList());
		
		log.info("Shopping Cart");
		
		model.addAttribute("cartMap", cartMap);
		
		return "/cart/myCart";
	}
	
	@PostMapping("/addGoods")
	public @ResponseBody String addGoodsInCart(@RequestParam("itemNum") String itemNum, HttpServletRequest request, HttpServletResponse response) throws Exception {
		CartVO cartVO = new CartVO();
		cartVO.setItemNum(itemNum);
		boolean isAreadyExisted=cartService.findCartGoods(cartVO);
		System.out.println("isAreadyExisted:"+isAreadyExisted);
		if(isAreadyExisted==true){
			return "already_existed";
		}else{
			cartService.addGoodsInCart(cartVO);
			return "add_success";
		}
	}
	
/*	@RequestMapping(value="/addGoodsInCart.do" ,method = RequestMethod.POST,produces = "application/text; charset=utf8")
	public  @ResponseBody String addGoodsInCart(@RequestParam("goods_id") int goods_id,
			                    HttpServletRequest request, HttpServletResponse response)  throws Exception{
		HttpSession session=request.getSession();
		memberVO=(MemberVO)session.getAttribute("memberInfo");
		String member_id=memberVO.getMember_id();
		
		cartVO.setMember_id(member_id);
		//īƮ ������� �̹� ��ϵ� ��ǰ���� �Ǻ��Ѵ�.
		cartVO.setGoods_id(goods_id);
		cartVO.setMember_id(member_id);
		boolean isAreadyExisted=cartService.findCartGoods(cartVO);
		System.out.println("isAreadyExisted:"+isAreadyExisted);
		if(isAreadyExisted==true){
			return "already_existed";
		}else{
			cartService.addGoodsInCart(cartVO);
			return "add_success";
		}
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
model.add */
	
}
