/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tiendap_1Q2023.service;

import com.Tiendap_1Q2023.domain.Articulo;
import java.util.List;

/**
 *
 * @author Monserrat Najera
 */
public interface ArticuloService {
   public List<Articulo>getArticulos(boolean activos); 
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo); // Para insertar o midificar(si viene el idArticulo o no)
    public void delete(Articulo articulo); 
}
