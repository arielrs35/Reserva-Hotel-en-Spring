/**
 * 
 */
package com.hostalpeatonal.ereservation.negocio.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hostalpeatonal.ereservation.modelo.Cliente;
import com.hostalpeatonal.ereservation.negocio.repository.ClienteRepository;


/**
 * Clase para definir los servicion de Cliente
 * 
 * @author Kyozuke
 *
 */
@Service
@Transactional(readOnly = true)
public class ClienteService {
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	/**
	 * Método para realizar la operación de guardar un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de actualizar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de eliminar un cliente
	 * 
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	/**
	 * Método para consulta un cliente por su identificación
	 * 
	 * @param identificacionCli
	 * @return
	 */
	
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	
	/**
	 * Método para devolver lista de clientes
	 * @return
	 */
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
	/**
	* Metodo para buscar un cliente por su apellido
	* @param apellidoCli
	* @return
	*/
	public List<Cliente> findByApellidoCli(String apellidoCli){
		return this.clienteRepository.findByApellidoCli(apellidoCli);
	}
	
	/**
	* Metodo para buscar un cliente por su Email
	* @param email
	* @return
	*/
	public Cliente findByEmailAccount(String email) {
		return this.findByEmailAccount(email);
	}
}
