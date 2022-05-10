
package com.example.demo.services;

import com.example.demo.models.RegistroSanitario;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.RegistroSanitarioRepository;

@Service
public class RegistroSanitarioService {
    @Autowired
    RegistroSanitarioRepository registroSanitarioRepository;
    
    public ArrayList<RegistroSanitario> obtenerRegistroSanitario() {
        return (ArrayList<RegistroSanitario>) registroSanitarioRepository.findAll();
    }
    
    public ArrayList<RegistroSanitario> obtenerRegistroSanitarioPorDenominacionDistintiva(String denominacionDistintiva) {
        return (ArrayList<RegistroSanitario>) registroSanitarioRepository.findByDenominacionDistintiva(denominacionDistintiva);
    }
}
