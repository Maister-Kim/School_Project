package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class GoodsVO {
	private String itemNum;
	private int item;
	private String itemName;
	public String seller;
	private int price;
	private int deliveryPrice;
	private Date deliveryDate;
	private String sellerInfo;
	private String itemIntro;
	private String imageName;
	private String catName;
}
