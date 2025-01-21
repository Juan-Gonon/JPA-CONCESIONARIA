package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;

public class ControladoraPersistencia {
    
    private AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        this.autoJpa.create(auto);
    }
    
}
