package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ImageTableVO {
	private int imageNum;
	private String itemNum;
	private String imageName;
	private String imageFormat;
	private Date regDate;
}
