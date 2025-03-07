package com.tarcioteles.hr_payroll.service;

import org.springframework.stereotype.Service;

import com.tarcioteles.hr_payroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
}
