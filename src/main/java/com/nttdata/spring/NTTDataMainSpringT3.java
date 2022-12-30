package com.nttdata.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Customers;
import com.nttdata.spring.services.CustomersManagementServiceI;

/**
 * Tercer - Taller - Spring
 * 
 * @author santiagomr
 *
 */
@SpringBootApplication()
public class NTTDataMainSpringT3 implements CommandLineRunner {

	@Autowired
	private CustomersManagementServiceI customerService;

	/**
	 * Método principal para inicializar nuestra aplicación
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMainSpringT3.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creación de clientes

		Customers c1 = customerService.generateCustomers("Alba", "Salcedo", "Delgado", "30/12/2000", "44532432C");
		Customers c2 = customerService.generateCustomers("Juan", "Coronado", "Luque", "15/02/1995", "15563412Z");
		Customers c3 = customerService.generateCustomers("Claudia", "Oliva", "Nuñez", "11/08/2001", "33521456F");
		Customers c4 = customerService.generateCustomers("Julia", "Montaño", "Serrano", "06/03/1997", "88512332K");
		Customers c5 = customerService.generateCustomers("Arancha", "Ruíz", "Moreno", "13/03/1992", "63532552L");
		Customers c6 = customerService.generateCustomers("José", "Sánchez", "Pérez", "09/09/2004", "32532546R");

		// Inserción de clientes

		customerService.insertCustomers(c1);
		customerService.insertCustomers(c2);
		customerService.insertCustomers(c3);
		customerService.insertCustomers(c4);
		customerService.insertCustomers(c5);
		customerService.insertCustomers(c6);

		// Borrado de clientes
		customerService.deleteCustomers(c6);

		// Borrado de clientes por ID
		customerService.deleteCustomersById(5L);

		// Búsqueda de cliente por nombre
		List<Customers> customerList = customerService.getCustomersByFullName("Alba", "Salcedo", "Delgado");
		for (Customers customers : customerList) {
			System.out.println("Cliente: " + customers.getName() + " " + customers.getLastName() + " "
					+ customers.getSecondLastName());
		}

		// Listado de todos los clientes
		List<Customers> allCustomerList = customerService.getAllCustomers();
		for (Customers customers : allCustomerList) {
			System.out.println(customers.toString());
		}

	}

}
