
package com.practica01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practica01.service.EstadoService;

@Controller
public class IndexController {
    //provaca que el objeto se cree si no existe o se use el que exista.... no hace más de 1 objeto
    //Esto se conoce como inyección de dependecias...
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var texto="Estamos en practica";/* Aquí se crea una variable String, llamada texto y se incluye dentro del objeto model, agregarle un atributo que se llama saludo */
        model.addAttribute("saludo", texto);/* nombre de una variable dentro de un html */
        
        
        var estados = estadoService.getEstados();
        
        model.addAttribute("estados", estados);
        return "index";
    
    }
   
    
}

