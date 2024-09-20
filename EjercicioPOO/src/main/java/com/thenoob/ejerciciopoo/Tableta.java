package com.thenoob.ejerciciopoo;

public class Tableta extends ProductoElectronico {
    private double tamanoPantalla;
    private String resolucionPantalla;

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
}
