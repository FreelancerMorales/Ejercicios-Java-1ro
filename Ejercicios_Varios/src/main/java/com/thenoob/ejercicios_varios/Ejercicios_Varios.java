package com.thenoob.ejercicios_varios;

import java.util.Scanner;

public class Ejercicios_Varios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Ejercicios Varios");
        System.out.println("");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. (Números impares)");
        System.out.println("3. (Números de 5 en 5)");
        System.out.println("4. (Tablas de Multiplicar)");
        System.out.println("5. (Pirámide Bonita)");
        System.out.println("");
        System.out.print("Ingrese el número del ejercicio que desea realizar: ");
        int option = scanner.nextInt();
        System.out.println("");

        switch (option) {
            case 1:
                No1();
            break;
            case 2:
                No2();
            break;
            case 3:
                No3();
            break;
            case 4:
                No4();
            break;
            case 5:
                No5();
            break;
            default:
                System.out.println("Opción no válida");
            break;
        }
    }

    public static void No1(){
        System.out.println("Números Pares hasta el 10: ");
        for (int i = 2; i <= 10; i+=2) {
            if (i == 10) {
                System.out.print(i+".");
            }else{
                System.out.print(i+", ");
            }
        }
    }

    public static void No2(){
        System.out.println("Números Impares hasta el 10: ");
        for (int i = 1; i <= 10; i+=2) {
            if (i == 9) {
                System.out.print(i+".");
            }else{
                System.out.print(i+", ");
            }
        }
    }

    public static void No3(){
        System.out.println("Números de 5 en 5: ");
        for (int i = 5; i <= 50; i+=5) {
            if (i == 50) {
                System.out.print(i+".");
            }else{
                System.out.print(i+", ");
            }
        }
    }

    public static void No4(){
        System.out.println("Tabla de multiplicar");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i+"*"+j+" = "+(i*j));
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static void No5(){
        System.out.println("Pirámide bonita");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Piramide inversa");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
