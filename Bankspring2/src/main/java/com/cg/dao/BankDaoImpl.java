package com.cg.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.CustomerDetails;

@Repository
@Component
public class BankDaoImpl implements BankDao {

	public CustomerDetails setInfo() {
		CustomerDetails customer = new CustomerDetails();
		customer.setFirstName("Prabhusai");
		customer.setLastName("Kotha");
		customer.setEmailId("kotha@gmail.com");
		customer.setAadharNo("705331994557");
		customer.setMobileNo("8790321879");
		customer.setPancardNo(98765);
		customer.setPassword("prabhusai");
		customer.setAddress("Hyd");
		customer.setBalance(500);
		customer.setAccountNo(100);
		return customer;
	}

	public CustomerDetails register(@RequestBody CustomerDetails cd) {
		// TODO Auto-generated method stub
		return cd;
	}

	public int login(ArrayList<CustomerDetails> custList, CustomerDetails c) {
		// TODO Auto-generated method stub
		int accNo = 0;
		System.out.println(c.getAccountNo());
		for (CustomerDetails customerDetails : custList) {
			if(customerDetails.getAccountNo() == c.getAccountNo() && customerDetails.getPassword().equals(c.getPassword())) {
				accNo = c.getAccountNo();
			}
		}
		return accNo;
	}
}
