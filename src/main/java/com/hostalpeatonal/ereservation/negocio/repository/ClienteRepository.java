/**
 * 
 */
package com.hostalpeatonal.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.hostalpeatonal.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de bd relacionadas con cliente
 * @author Kyozuke
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	/**
	 * Definicion de método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	/**
	 * Definicion de método para buscar los clientes por su identificacion
	 * @param identificacionCli
	 * @return
	 */
	
	public Cliente findByIdentificacion(String identificacionCli);
	
	/**
	 * Definicion de método para buscar los clientes por su cuenta de Email
	 * @param email
	 * @return
	 */
	
	@Query("Select c from Cliente c where c.emailCli like %:email")
	public Cliente findByEmailAccount(@Param("email") String email);

}
