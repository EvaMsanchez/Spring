package com.eva.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
    @GetMapping({"", "/", "/home"}) // para indicar varias rutas
    public String home()
    {
        // 2 formas de redirigir a otra ruta
        return "redirect:/list"; 
        //return "forward:/list"; 
    }
}
