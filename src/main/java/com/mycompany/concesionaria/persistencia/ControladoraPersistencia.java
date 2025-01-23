package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    private AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        this.autoJpa.create(auto);
    }

    public List<Automovil> obtenerAutos() {
        return this.autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            this.autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil obtenerAutos(int idAuto) {
        return this.autoJpa.findAutomovil(idAuto);
    }

}
