
package com.example.demo.controllers;

import com.example.demo.models.RegistroSanitario;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.RegistroSanitarioService;

@RestController
@RequestMapping("/registrosanitario")
public class RegistroSanitarioController {
    @Autowired
    RegistroSanitarioService registroSanitarioService;
    
    @GetMapping()
    public ArrayList<RegistroSanitario> obtenerRegistroSanitario(){
        return registroSanitarioService.obtenerRegistroSanitario();
    }
    
    @GetMapping( path = "/query")
    public ArrayList<RegistroSanitario> obtenerRegistroSanitarioPorDenominacionDistintiva(@RequestParam("denominacionDistintiva") String denominacionDistintiva) {
        return this.registroSanitarioService.obtenerRegistroSanitarioPorDenominacionDistintiva(denominacionDistintiva);
    }
}
