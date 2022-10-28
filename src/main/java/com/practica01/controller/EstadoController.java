package com.practica01.controller;

import com.practica01.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.practica01.service.EstadoService;

@Controller
public class EstadoController {

    //provaca que el objeto se cree si no existe o se use el que exista.... no hace más de 1 objeto
    //Esto se conoce como inyección de dependecias...
    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado) {
        return "modificarEstado";
    }

    @PostMapping("/estado/guardar")
    public String estadoGuardar(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/actualiza/{id_pais}")
    public String estadoActualiza(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return "modificarEstado";
    }
    
    @GetMapping("/estado/elimina/{id_pais}")
    public String estadoElimina(Estado estado) {
        estadoService.delete(estado);
        return "redirect:/";
    }

}

