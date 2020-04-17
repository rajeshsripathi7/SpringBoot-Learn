package com.raj.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.raj.core.math.SumNumbers;
import com.raj.core.math.SumNumbersImpl;


@SpringBootTest
class CoreApplicationTests {

	@Autowired
	SumNumbers sumNum;
	
	
	@Test
	private void testSumNumbers () {
		sumNum = new SumNumbersImpl();
		Assert.notNull(sumNum);
	}
	
	

}
