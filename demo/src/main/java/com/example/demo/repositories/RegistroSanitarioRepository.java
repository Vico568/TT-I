
package com.example.demo.repositories;

import com.example.demo.models.RegistroSanitario;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroSanitarioRepository extends CrudRepository<RegistroSanitario, Long>{
    public abstract ArrayList<RegistroSanitario> findByDenominacionDistintiva(String denominacionDistintiva);
}
