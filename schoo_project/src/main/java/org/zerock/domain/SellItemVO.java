package org.zerock.domain;

import lombok.Data;

@Data
public class SellItemVO {
	private String itemNum;
	private String item;
	private String itemName;
	private String seller;
	private int price;
	private String picName;
}
