/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tiendap_1Q2023.service;

import com.Tiendap_1Q2023.domain.Categoria;
import java.util.List;

/**
 *
 * @author Monserrat Najera
 */
public interface CategoriaService {
    public List<Categoria>getCategorias(boolean activos); 
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria); // Para insertar o midificar(si viene el idCategoria o no)
    public void delete(Categoria categoria);
}
