/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tiendap_1Q2023.service;

/**
 *
 * @author Monserrat Najera
 */
import com.Tiendap_1Q2023.dao.ArticuloDao;
import com.Tiendap_1Q2023.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticuloServiceImpl implements ArticuloService {
    
    @Autowired
    ArticuloDao articuloDao;
   
    @Override
    @Transactional(readOnly=true)
    public List<Articulo> getArticulos(boolean activos) {
        List<Articulo> lista= (List<Articulo>) articuloDao.findAll();
        
       if(activos){
            lista.removeIf(e->  !e.isActivo());
        }
       return lista;
    }
    
    

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Articulo articulo) {
       articuloDao.save(articulo);
    }

    @Override
    @Transactional
    public void delete(Articulo articulo) {
        articuloDao.deleteById(articulo.getIdArticulo());
    }
}

