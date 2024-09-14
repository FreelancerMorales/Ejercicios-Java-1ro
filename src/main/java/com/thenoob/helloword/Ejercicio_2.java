package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.print("Ingrese su nombre: ");
        Scanner set_name = new Scanner(System.in);
        String name = set_name.nextLine();
        set_name.close();
        
        System.out.println("Buenos dias mi estimado " + name);
    }
}
