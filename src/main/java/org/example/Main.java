package org.example;

import modelo.Banco;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        inicializar();

    }


    public static void inicializar(){

        Scanner entrada = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el monto del crédito: ");
        double monto = entrada.nextDouble();
        System.out.println("Ingrese el número de cuotas: ");
        int cuotas = entrada.nextInt();

        // Simular el crédito
        Banco banco = new Banco();
        banco.simularCredito(monto, cuotas);


    }
}