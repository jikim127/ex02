package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Criterial {

	private int pageNum;  //2, 3
	private int amount; //page당 몇개 보여줄꺼니?  10
	
	public Criterial() {
		this(1,10);
	}

	public Criterial(int pageNum, int amout) {
		this.pageNum = pageNum;
		this.amount = amout;
	}
}
