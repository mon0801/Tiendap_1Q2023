package com.Tiendap_1Q2023.controller;

import com.Tiendap_1Q2023.domain.cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.Tiendap_1Q2023.service.ArticuloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Monserrat Najera
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    ArticuloService articuloService;

    @GetMapping("/")
    public String page(Model model) {

        log.info("Ahora desde MVC");

        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);

        return "index";
    }
}
