/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tiendap_1Q2023.service;
import com.Tiendap_1Q2023.dao.UsuarioDao;
import com.Tiendap_1Q2023.domain.Rol;
import com.Tiendap_1Q2023.domain.Usuario;
 import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.UserDetailsService;
/**
 *
 * @author Monserrat Najera
 */
@Service("userDetailsService")
@Slf4j
public class UsuarioService implements UserDetailsService{
      @Autowired
    private UsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Busca el usuario por el username en la tabla   
        Usuario usuario = usuarioDao.findByUsername(username);;
        //Si no existe el usuario lanza una excepción    
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        //Si está acá es porque existe el usuario... sacamos los roles que tiene   
        var roles = new ArrayList<GrantedAuthority>();
        for (Rol rol : usuario.getRoles()) {   //Se sacan los roles   
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        //Se devuelve User (clase de userDetails)    
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
    }
}
