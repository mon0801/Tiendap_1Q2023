/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tiendap_1Q2023.dao;

import com.Tiendap_1Q2023.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Monserrat Najera
 */
public interface UsuarioDao  extends CrudRepository<Usuario, Long> {
   
    Usuario finByUsername(String username);

    public Usuario findByUsername(String username);
}
