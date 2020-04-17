package com.raj.core.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValuesVO {

	Integer numOne;
	
	Integer numTwo;
	

	public Integer getNumOne() {
		return numOne;
	}

	public void setNumOne(Integer numOne) {
		this.numOne = numOne;
	}

	public Integer getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(Integer numTwo) {
		this.numTwo = numTwo;
	}
	
	
}
