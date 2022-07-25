package org.zerock.domain;

import lombok.Data;

@Data
public class CartVO {
	private String userId;
	private String itemNum;
	private int cartNum;
	private int quantity;
}
