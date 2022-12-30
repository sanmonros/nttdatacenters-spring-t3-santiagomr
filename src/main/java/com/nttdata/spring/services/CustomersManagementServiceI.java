package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.repository.Customers;

/**
 * Interfaz de clientes
 * 
 * @author santiagomr
 *
 */
public interface CustomersManagementServiceI {

	/**
	 * Insertar clientes
	 * 
	 * @param c
	 */
	public void insertCustomers(Customers c);

	/**
	 * Actualizar clientes
	 * 
	 * @param c
	 */
	public void updateCustomers(Customers c);

	/**
	 * Borrar clientes
	 * 
	 * @param c
	 */
	public void deleteCustomers(Customers c);

	/**
	 * Borrar a un cliente por su Id
	 * 
	 * @param customerId
	 */
	public void deleteCustomersById(Long customerId);

	/**
	 * Creación de Clientes
	 * 
	 * @param name
	 * @param lastName
	 * @param secondLastName
	 * @param birthDate
	 * @param dni
	 * @return
	 */
	public Customers generateCustomers(String name, String lastName, String secondLastName, String birthDate,
			String dni);

	/**
	 * Búscar a un cliente por su Id
	 * 
	 * @param customerId
	 * @return
	 */
	public Customers getCustomersById(Long customerId);

	/**
	 * Buscar a un cliente por su nombre completo
	 * 
	 * @param name
	 * @param lastName
	 * @param secondlastName
	 * @return
	 */
	public List<Customers> getCustomersByFullName(String name, String lastName, String secondlastName);

	/**
	 * Obtener la información de todos los clientes almacenados
	 * 
	 * @return
	 */
	public List<Customers> getAllCustomers();

}
