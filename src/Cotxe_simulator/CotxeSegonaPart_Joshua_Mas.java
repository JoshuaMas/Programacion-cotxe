package Cotxe_simulator;
/*
        -Project: Programacion-cotxe

        -Date: 21/02/2021

        -Created by: Joshua Mas

        */

/** En esta actividad actualizamos el programa del simulador de coche añadiendo 2 metodos,
 * Cambiar las marchas del coche según si es automatico o manual **/

public class CotxeSegonaPart_Joshua_Mas extends Cotxe_Joshua_Mas {
    // Atributos
    private MarxesAutomatic estatmarxaA = MarxesAutomatic.N;
    private MarxesManual estatmarxaM = MarxesManual.N;

    // Constructor
    public CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi, MarxesAutomatic estatmarxaA, MarxesManual estatmarxaM) {
        super(marca, model, tipuscanvi);
        this.estatmarxaA = estatmarxaA;
        this.estatmarxaM = estatmarxaM;
    }

    // Constructor default
    CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    // Creamos un metodo para cambiar las marchas en un coche automatico.

    void CanviarMarxaAutomatic(MarxesAutomatic marxa) throws Exception {

       /* Comprobamos si el coche está encendido, después si es un coche automático para poder seguir,
          si no introduce una marxa que exista te saltará Marxa incorrecta.*/

        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            if (tipuscanvi == TipusCanvi.CanviAutomatic) {
                if (marxa == MarxesAutomatic.F || marxa == MarxesAutomatic.N || marxa == MarxesAutomatic.R) {

                    // Si estamos en la marxa N...

                    if (this.estatmarxaA.equals(MarxesAutomatic.N)) {
                        if (marxa == MarxesAutomatic.F) {
                            this.estatmarxaA = MarxesAutomatic.F;
                            System.out.println("F");
                        } else if (marxa == MarxesAutomatic.R) {
                            this.estatmarxaA = MarxesAutomatic.R;
                            System.out.println("R");
                        } else throw new Exception("Marxa incorrecta");

                        // Si estamos en la marxa F...

                    } else if (this.estatmarxaA.equals(MarxesAutomatic.F)) {
                        if (marxa == MarxesAutomatic.N) {
                            estatmarxaA = MarxesAutomatic.N;
                            System.out.println("N");
                        } else throw new Exception("Marxa incorrecta");

                        // Si estamos en la marxa R...

                    } else if (this.estatmarxaA.equals(MarxesAutomatic.R)) {
                        if (marxa == MarxesAutomatic.N) {
                            this.estatmarxaA = MarxesAutomatic.N;
                            System.out.println("N");
                        } else throw new Exception("Marxa incorrecta");
                    }
                } else throw new Exception("Marxa incorrecta");
            } else throw new Exception("Cotxe manual. No pots fer un canvi automàtic");
        } else throw new Exception("El cotxe està aturat. No pots canviar de marxa");
    }

     /* Creamos un metodo para cambiar las marchas en un coche manual. Comprobamos si el coche está encendido,
       después si es un coche manual para poder seguir, si no introduce una marxa que exista, te saltará Marxa incorrecta.*/

    void CanviarMarxaManual(MarxesManual marxa2) throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            if (tipuscanvi == TipusCanvi.CanviManual) {
                if (marxa2 == MarxesManual.R || marxa2 == MarxesManual.N || marxa2 == MarxesManual.G1
                        || marxa2 == MarxesManual.G2 || marxa2 == MarxesManual.G3 || marxa2 == MarxesManual.G4
                        || marxa2 == MarxesManual.G5 || marxa2 == MarxesManual.G6) {

// Si estamos en la marxa R...

                    if (this.estatmarxaM.equals(MarxesManual.R)) {
                        if (marxa2 == MarxesManual.N) {
                            this.estatmarxaM = MarxesManual.N;
                            System.out.println("N");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa N...

                    } else if (this.estatmarxaM.equals(MarxesManual.N)) {
                        if (marxa2 == MarxesManual.G1) {
                            this.estatmarxaM = MarxesManual.G1;
                            System.out.println("G1");
                        } else if (marxa2 == MarxesManual.R) {
                            this.estatmarxaM = MarxesManual.R;
                            System.out.println("R");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G1...

                    } else if (this.estatmarxaM.equals(MarxesManual.G1)) {
                        if (marxa2 == MarxesManual.N) {
                            this.estatmarxaM = MarxesManual.N;
                            System.out.println("N");
                        } else if (marxa2 == MarxesManual.G2) {
                            this.estatmarxaM = MarxesManual.G2;
                            System.out.println("G2");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G2...

                    } else if (this.estatmarxaM.equals(MarxesManual.G2)) {
                        if (marxa2 == MarxesManual.G1) {
                            this.estatmarxaM = MarxesManual.G1;
                            System.out.println("G1");
                        } else if (marxa2 == MarxesManual.G3) {
                            this.estatmarxaM = MarxesManual.G3;
                            System.out.println("G3");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G3...

                    } else if (this.estatmarxaM.equals(MarxesManual.G3)) {
                        if (marxa2 == MarxesManual.G2) {
                            this.estatmarxaM = MarxesManual.G2;
                            System.out.println("G2");
                        } else if (marxa2 == MarxesManual.G4) {
                            this.estatmarxaM = MarxesManual.G4;
                            System.out.println("G4");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G4...

                    } else if (this.estatmarxaM.equals(MarxesManual.G4)) {
                        if (marxa2 == MarxesManual.G3) {
                            this.estatmarxaM = MarxesManual.G3;
                            System.out.println("G3");
                        } else if (marxa2 == MarxesManual.G5) {
                            this.estatmarxaM = MarxesManual.G5;
                            System.out.println("G5");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G5...

                    } else if (this.estatmarxaM.equals(MarxesManual.G5)) {
                        if (marxa2 == MarxesManual.G4) {
                            this.estatmarxaM = MarxesManual.G4;
                            System.out.println("G4");
                        } else if (marxa2 == MarxesManual.G6) {
                            this.estatmarxaM = MarxesManual.G6;
                            System.out.println("G6");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G6...

                    } else if (this.estatmarxaM.equals(MarxesManual.G6)) {
                        if (marxa2 == MarxesManual.G5) {
                            this.estatmarxaM = MarxesManual.G5;
                            System.out.println("G5");
                        } else throw new Exception("Marxa incorrecta");
                    }
                } else throw new Exception("Marxa incorrecta");
            } else throw new Exception("Cotxe automàtic. No pots fer un canvi manual");
        } else throw new Exception("El cotxe està aturat. No pots canviar de marxa");
    }
}