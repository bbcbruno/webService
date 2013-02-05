package br.com.ws.customerservice.impl;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.stereotype.Service;

import br.com.ws.customerservice.CustomerService;
import br.com.ws.customerservice.NoSuchCustomerException;
import br.com.ws.customerservice.model.Customer;

import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomerById(Integer customerId) throws NoSuchCustomerException {
		Customer customer = new Customer();
		customer.setName("Bruno");
		try {
			customer.setBirthDate(DatatypeFactoryImpl.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		return null;
	}

	@Override
	public void deleteCustomerById(Integer customerId) throws NoSuchCustomerException {
		System.out.println("OK - deleteCustomerById - " + customerId);
	}

}
