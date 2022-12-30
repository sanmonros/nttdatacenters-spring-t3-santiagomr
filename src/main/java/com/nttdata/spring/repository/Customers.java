package com.nttdata.spring.repository;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase Clientes
 * 
 * @author santiagomr
 *
 */
@Entity
@Table(name = "CUSTOMERS")
public class Customers implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador del cliente */
	private long customerId;

	/** Nombre del cliente */
	private String name;

	/** Apellido del cliente */
	private String lastName;

	/** Segundo apellido del cliente */
	private String secondLastName;

	/** Fecha de nacimiento del cliente */
	private String birthDate;

	/** Dni del cliente */
	private String dni;

	/**
	 * Devolver el identificador del cliente
	 * 
	 * @return the customerId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	public long getCustomerId() {
		return customerId;
	}

	/**
	 * Fijar el identificador del cliente
	 * 
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	/**
	 * Devolver el nombre del cliente
	 * 
	 * @return the name
	 */
	@Column(name = "CUSTOMERS_NAME")
	public String getName() {
		return name;
	}

	/**
	 * Fijar el nombre del cliente
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devolver el primer apellido del cliente
	 * 
	 * @return the lastName
	 */
	@Column(name = "CUSTOMERS_LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Fijar el primer apellido del cliente
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Devolverel segundo apellido del cliente
	 * 
	 * @return the secondLastName
	 */
	@Column(name = "CUSTOMERS_SECOND_LAST_NAME")
	public String getSecondLastName() {
		return secondLastName;
	}

	/**
	 * Fijar el segundo apellido del cliente
	 * 
	 * @param secondLastName the secondLastName to set
	 */
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	/**
	 * Devolver la fecha de nacimiento del cliente
	 * 
	 * @return the birthDate
	 */
	@Column(name = "BIRTHDATE")
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * Fijar la fecha de nacimiento del cliente
	 * 
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Devolver el dni del cliente
	 * 
	 * @return the dni
	 */
	@Column(name = "CUSTOMERS_DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * Fijar el dni del cliente
	 * 
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", name=" + name + ", lastName=" + lastName + ", secondLastName="
				+ secondLastName + ", birthDate=" + birthDate + ", dni=" + dni + "]";
	}

}
