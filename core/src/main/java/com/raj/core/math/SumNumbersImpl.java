package com.raj.core.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.core.vo.ValuesVO;

@Service
public class SumNumbersImpl implements SumNumbers {

	@Autowired
	ValuesVO values;
	
	public ValuesVO getValues() {
		return values;
	}

	public void setValues(ValuesVO values) {
		this.values = values;
	}


	
	private Integer SumOfTwoNumbers (ValuesVO values) {
		if (values.getNumOne() == null || values.getNumTwo() == null){
			return 0;
		}
		return values.getNumOne().intValue() + values.getNumTwo().intValue();
	}
	
	
}
