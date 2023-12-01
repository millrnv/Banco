package modelo;

public class Banco {

    public static void main(String[] args) {
        // Prueba 1
        Banco banco = new Banco();
        double monto = 1000000;
        int cuotas = 10;
        banco.simularCredito(monto, cuotas);

        // Prueba 2
        banco = new Banco();
        monto = 500000;
        cuotas = 25;
        banco.simularCredito(monto, cuotas);

        // Prueba 3
        banco = new Banco();
        monto = 2500000;
        cuotas = 20;
        banco.simularCredito(monto, cuotas);
    }

    public void simularCredito(double monto, int cuotas) {
        double tasaInteres = getTasaInteres(monto, cuotas);
        double montoTotal = calcularMontoTotal(monto, tasaInteres, cuotas);
        double cuotaMensual = calcularCuotaMensual(montoTotal, cuotas);

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

    public double calcularMontoTotal(double monto, double tasaInteres, int cuotas) {
        return monto * (1 + tasaInteres) * cuotas;
    }

    public double calcularCuotaMensual(double montoTotal, int cuotas) {
        return montoTotal / cuotas;
    }



}




