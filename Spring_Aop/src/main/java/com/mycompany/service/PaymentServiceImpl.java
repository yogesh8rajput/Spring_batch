package com.mycompany.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment() {
		System.out.println("Payment Debited");
		System.out.println("Payment Credited");
		
	}

}
