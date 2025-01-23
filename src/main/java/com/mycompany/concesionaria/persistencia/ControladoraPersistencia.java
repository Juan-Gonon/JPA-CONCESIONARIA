package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {
    
    private AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        this.autoJpa.create(auto);
    }

    public List<Automovil> obtenerAutos() {
        return this.autoJpa.findAutomovilEntities();
    }
    
}
