package com.bharath.core;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.core.services.PaymentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {
	
	@Autowired
	PaymentServiceImpl paymentServiceImpl;

	@Test
	public void testDependencyInjection() {
		
		assertNotNull(paymentServiceImpl.getPaymentDao());
	}

}
