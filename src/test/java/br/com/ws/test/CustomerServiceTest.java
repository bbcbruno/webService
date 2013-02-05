package br.com.ws.test;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ws.customerservice.CustomerService;
import br.com.ws.customerservice.NoSuchCustomerException;
import br.com.ws.customerservice.model.Customer;
import br.com.ws.test.base.TestCase;

public class CustomerServiceTest extends TestCase {

	@Autowired
	private CustomerService customerService;

	@Test
	public void deveRetornarUmCustomer() {
		
		Customer customer = null;
		try {
			customer = customerService.getCustomerById(99);
		} catch (NoSuchCustomerException e) {
			e.printStackTrace();
		}
		
		Assert.assertNotNull(customer);
		Assert.assertNotNull(customer.getName());
		Assert.assertNotNull(customer.getBirthDate());
		
	}

}
