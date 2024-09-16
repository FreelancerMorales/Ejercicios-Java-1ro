package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner set_num = new Scanner(System.in);
        int multi = 0;

        System.out.println("Tabla de Multiplicar");
        System.out.print("Ingresa la tabla que deseas ver: ");
        int numb = set_num.nextInt();

        System.out.println("");

        System.out.print("Ahora ingresa el limite al cual quieres llegar: ");
        int limit = set_num.nextInt();

        set_num.close();

        System.out.println("");

        System.out.println("Tabla de "+numb);
        for (int i = 1; i <= limit; i++) {
            multi = numb * i;
            System.out.println(numb +" * "+ i +" = " + multi);
        }
    }
}
