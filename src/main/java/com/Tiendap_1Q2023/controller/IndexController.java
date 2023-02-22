package com.Tiendap_1Q2023.controller;

import com.Tiendap_1Q2023.domain.cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.Tiendap_1Q2023.service.ClienteService;
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
    ClienteService ClienteService;

    @GetMapping("/")
    public String page(Model model) {

        log.info("Ahora desde MVC");

        var clientes = ClienteService.getClientes();
        model.addAttribute("clientes", clientes);

        return "index";
    }
@GetMapping("/nuevocliente")
 public String nuevocliente(cliente cliente){
 return "modificarCliente";
         }
 @PostMapping("guardarCliente")
 public String guardarCliente(cliente cliente){
     ClienteService.save(cliente);
     return"redirect:/";
 }
 @GetMapping ("/modificarCliente/{idCliente}")
 public String modificarCliente(cliente cliente , Model model){
     cliente = ClienteService.getCliente(cliente);
     model.addAttribute("cliente",cliente);
     return"modificarCliente";
 }
  @GetMapping ("/eliminarCliente/{idCliente}")
 public String eliminarCliente(cliente cliente ){
      ClienteService.delete(cliente);
     return"redirect:/";
 }
}
