package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {

        int multi = 0;

        System.out.println("Tabla de Multiplicar");
        System.out.print("Ingresa la tabla que deseas ver: ");
        Scanner set_numb = new Scanner(System.in);
        int numb = set_numb.nextInt();

        System.out.println("");

        System.out.print("Ahora ingresa el limite al cual quieres llegar: ");
        Scanner set_lim = new Scanner(System.in);
        int limit = set_lim.nextInt();

        System.out.println("");

        System.out.println("Tabla de "+numb);
        for (int i = 1; i <= limit; i++) {
            multi = numb * i;
            System.out.println(numb +" * "+ i +" = " + multi);
        }
    }
}
