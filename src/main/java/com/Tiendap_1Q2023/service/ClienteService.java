
package com.Tiendap_1Q2023.service;

import com.Tiendap_1Q2023.domain.cliente;
import java.util.List;

/**
 *
 * @author Monserrat Najera
 */
public interface ClienteService {
   
    public List<cliente>getClientes(); 
    public cliente getCliente(cliente cliente);
    
    public void save(cliente cliente); // Para insertar o midificar(si viene el idCliente o no)
    public void delete(cliente cliente);
}
