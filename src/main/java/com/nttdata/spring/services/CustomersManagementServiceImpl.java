package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Customers;
import com.nttdata.spring.repository.CustomersRepository;

/**
 * Servicio de Clientes
 * 
 * @author santiagomr
 *
 */
@Service
public class CustomersManagementServiceImpl implements CustomersManagementServiceI {

	@Autowired
	CustomersRepository customersRe;

	@Override
	public void insertCustomers(Customers c) {
		customersRe.save(c);

	}

	@Override
	public void updateCustomers(Customers c) {
		customersRe.save(c);

	}

	@Override
	public void deleteCustomers(Customers c) {
		customersRe.delete(c);

	}

	@Override
	public void deleteCustomersById(Long customerId) {
		customersRe.deleteById(customerId);

	}

	@Override
	public Customers getCustomersById(Long customerId) {
		Customers customer = null;
		customer = customersRe.findById(customerId).get();

		return customer;

	}

	@Override
	public List<Customers> getCustomersByFullName(String name, String lastName, String secondLastName) {
		return customersRe.findByNameAndLastNameAndSecondLastName(name, lastName, secondLastName);

	}

	@Override
	public List<Customers> getAllCustomers() {
		return customersRe.findAll();
	}

	@Override
	public Customers generateCustomers(String name, String lastName, String secondLastName, String birthDate,
			String dni) {
		Customers genericCustomer = new Customers();
		genericCustomer.setName(name);
		genericCustomer.setLastName(lastName);
		genericCustomer.setSecondLastName(secondLastName);
		genericCustomer.setBirthDate(birthDate);
		genericCustomer.setDni(dni);

		return genericCustomer;
	}

}
