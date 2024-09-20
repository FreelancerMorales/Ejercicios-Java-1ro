package com.thenoob.ejerciciopoo;

public class TelefonoMovil extends ProductoElectronico {
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    // Métodos
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
}