package modelo;

import java.util.Scanner;

public class Banco {


    public void simularCredito(double monto, int cuotas) {
        double tasaInteres = getTasaInteres(monto, cuotas);
        double montoTotal = calcularMontoTotal(monto, tasaInteres);
        double cuotaMensual = montoTotal / cuotas;

        System.out.println("Monto total a pagar: " + montoTotal);
        System.out.println("Cuota mensual: " + cuotaMensual);
    }

    public double getTasaInteres(double monto, int cuotas) {
        if (monto <= 1000000) {
            if (cuotas <= 12) {
                return 0.25;
            } else if (cuotas <= 23) {
                return 0.30;
            } else {
                return 0.35;
            }
        } else {
            if (cuotas <= 12) {
                return 0.15;
            } else if (cuotas <= 23) {
                return 0.20;
            } else {
                return 0.25;
            }
        }
    }

    public double calcularMontoTotal(double monto, double tasaInteres) {
        return monto * (1+tasaInteres) ;
    }

    public double calcularCuotaMensual(double montoTotal, int cuotas) {
        return montoTotal / cuotas;
    }
}






