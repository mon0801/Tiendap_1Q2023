/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tiendap_1Q2023.service;

import com.Tiendap_1Q2023.dao.CreditoDao;
import com.Tiendap_1Q2023.dao.clienteDao;
import com.Tiendap_1Q2023.domain.Credito;
import com.Tiendap_1Q2023.domain.cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Monserrat Najera
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    clienteDao clienteDao;
    
    @Autowired
    CreditoDao creditoDao;
   
    @Override
    @Transactional(readOnly=true)
    public List<cliente> getClientes() {
        return (List<cliente>) clienteDao.findAll();
    }

    @Override
    public cliente getCliente(cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(cliente cliente) {
       Credito credito= cliente.getCredito();
        credito= creditoDao.save(credito);
        
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

//    @Override
//    public List<cliente> getClientePorNombre(String nombre) {
//        return clienteDao.findByNombre(nombre);
//    }
//
//    @Override
//    public List<cliente> getClientePorTelefono(String telefono) {
//        return clienteDao.findByTelefono(telefono);
//    }
//
//    @Override
//    public List<cliente> getClientePorNombreApellidos(String nombre, String apellidos) {
//        return clienteDao.findByNombreandApellidos(nombre, apellidos);
//    }

   
    
}
