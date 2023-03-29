package com.Tiendap_1Q2023.dao;

import com.Tiendap_1Q2023.domain.cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Monserrat Najera
 */
public interface clienteDao extends CrudRepository<cliente,Long> {
   
//    public List<cliente>findByNombre(String nombre);
//    public List<cliente>findByTelefono(String telefono);
//    public List<cliente>findByNombreandApellidos(String nombre , String apellidos);
//    
}


