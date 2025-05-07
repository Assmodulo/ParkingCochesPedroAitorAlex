package org.example.tucochealquileres;

public class TiposDeVehiculos {

    String nombre;
    String tipo;
    Double tarifaAdicional;

    public TiposDeVehiculos(String nombre, String tipo, Double tarifaAdicional) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tarifaAdicional = tarifaAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(Double tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    @Override
    public String toString() {
        return "TiposDeVehiculos{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + tipo + '\'' +
                ", tarifaAdicional=" + tarifaAdicional +
                '}';
    }
}
