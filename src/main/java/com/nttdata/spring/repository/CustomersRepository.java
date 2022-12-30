package com.nttdata.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Clientes
 * 
 * @author santiagomr
 *
 */
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

	/**
	 * Método para buscar a un cliente por nombre completo
	 * 
	 * @param name
	 * @param lastName
	 * @param secondLastName
	 * @return
	 */
	public List<Customers> findByNameAndLastNameAndSecondLastName(String name, String lastName, String secondLastName);

}
