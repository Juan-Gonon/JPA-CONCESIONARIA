package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.modifAuto(auto);
    }

    public List<Automovil> obtenerAutos() {
        return this.controlPersis.obtenerAutos();
    }

    public void borrarAuto(int idAuto) {
        this.controlPersis.borrarAuto(idAuto);
    }

    public Automovil obtenerAuto(int idAuto) {
        return this.controlPersis.obtenerAutos(idAuto);
    }

    public void modifAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
    }
    
}
