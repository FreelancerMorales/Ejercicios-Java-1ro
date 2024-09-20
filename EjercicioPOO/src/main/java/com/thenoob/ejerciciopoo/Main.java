package com.thenoob.ejerciciopoo;

public class Main {
    public static void main(String[] args) {
        TelefonoMovil telefono = new TelefonoMovil();
        telefono.setPrecio(1199.99);
        telefono.setMarca("Samsung");
        telefono.setModelo("Galaxy A10");
        telefono.setCapacidadAlmacenamiento(32);
        telefono.setDuracionBateria(4);

        Tableta tablet = new Tableta();
        tablet.setPrecio(1499.99);
        tablet.setMarca("Apple");
        tablet.setModelo("iPad Pro Max Premium Platino");
        tablet.setTamanoPantalla(11);
        tablet.setResolucionPantalla("1980 x 1980");

        System.out.println("Datos Teléfono");
        System.out.println("");
        System.out.println("Marca: " + telefono.getMarca());
        System.out.println("Modelo: " + telefono.getModelo());
        System.out.println("Precio: " + telefono.getPrecio());
        System.out.println("Capacidad de Almacenamiento: " + telefono.getCapacidadAlmacenamiento() + "GB");
        System.out.println("Duración de la Batería: " + telefono.getDuracionBateria() + " horas");
        System.out.println("");
        System.out.println("Datos Tableta");
        System.out.println("");
        System.out.println("Marca: " + tablet.getMarca());
        System.out.println("Modelo: " + tablet.getModelo());
        System.out.println("Precio: " + tablet.getPrecio());
        System.out.println("Capacidad de Almacenamiento: " + tablet.getTamanoPantalla() + "CM");
        System.out.println("Duración de la Batería: " + tablet.getResolucionPantalla() + " Pixeles");
    }
}