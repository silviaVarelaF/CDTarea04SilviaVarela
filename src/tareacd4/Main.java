package tareacd4;

import banco.CtaCorriente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CtaCorriente miCuenta;
        double saldoActual;

        miCuenta = new CtaCorriente("Koldo García Ábalos","0001-2345-07-1234567890",5000,0);
        saldoActual = miCuenta.getSaldocuenta();
        logger.log("El saldo inicial es de "+ saldoActual +" euros");

        try {
            Scanner entrada = new Scanner(System.in);
            logger.log("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            logger.log("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            logger.log("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            logger.log("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            logger.log(importe);
            logger.log("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            logger.log("Fallo al ingresar");
        }
    }
}