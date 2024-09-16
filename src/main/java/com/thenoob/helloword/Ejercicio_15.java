package com.thenoob.helloword;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        int num_Vocales = 0;
        char[] vocales = {'a','e','i','o','u','A','E','I','O','U'};
        Scanner set_String = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = set_String.nextLine();

        char fragmen[] = new char[100];
        fragmen = frase.toCharArray();
        
        for(int i = 0; i < fragmen.length; i++){
            for (int j = 0; j < vocales.length; j++) {
                if (fragmen[i] == vocales[j]) {
                    fragmen[i] = 'x';
                    num_Vocales++;
                }
            }
        }

        System.out.println("");
        System.out.println("Su frase '"+frase+"' contaba con "+num_Vocales+" Vocales");

        System.out.print("Frase sin vocales: '");
        for(int i = 0; i < fragmen.length; i++){
            System.out.print(fragmen[i]);
        }
        System.out.println("'");

        set_String.close();
    }
}
