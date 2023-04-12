/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tiendap_1Q2023;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Monserrat Najera
 */
public class Encriptar {

    public static void main(String[] args) {
        var codigo = new BCryptPasswordEncoder();
        System.out.println("juan (123): " + codigo.encode("123"));
        System.out.println("rebeca (456): " + codigo.encode("456"));
        System.out.println("pedro (789): " + codigo.encode("789"));
    }
}
