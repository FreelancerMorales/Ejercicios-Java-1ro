package com.thenoob.tarea_no2;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner set_date = new Scanner(System.in);
        boolean valido_dia = false;
        boolean valido_año = true;

        // Pedir al usuario el día, mes y año
        System.out.print("Ingresa el día: ");
        int dia = set_date.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = set_date.nextInt();

        System.out.print("Ingresa el año: ");
        int año = set_date.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Ya no podemos hacer nada :c");
        }else{
            switch (mes) {
                case 2:
                    if (dia  >= 1 && dia <= 28) {
                        valido_dia = true;
                    }
                break;
    
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia >= 1 && dia <= 31) {
                        valido_dia = true;
                    }
                break;
    
                default:
                    if (dia >= 1 && dia <= 30) {
                        valido_dia = true;
                    }
                break;
            }
        }

        for (int i = 1900; i >= año; i*= 4){
            if (i == año) {
                System.out.println("El año " + año + " es bisiesto, no podremos validar tu fecha :c");
                valido_año = false;
                break;
            }
        }

        if (valido_dia && valido_año) {
            System.out.println("Su fecha '"+ dia +"/"+ mes +"/"+ año +"' es correcta");
        }else if(!valido_año){
            System.out.println("Lamentamos que sea año bisiesto");
        }else{
            System.out.println("Su fecha '"+ dia +"/"+ mes +"/"+ año +"' no es correcta");
        }
    }
}
