package Cotxe_simulator;

/*
        -Project: Programacion-cotxe

        -Date: 21/02/2021

        -Created by: Joshua Mas

        */
enum MarxesA{
    F,
    N,
    R;
}
enum MarxesM {
    R,
    N,
    G1,
    G2,
    G3,
    G4,
    G5,
    G6;
}


/** En esta actividad actualizamos el programa del simulador de coche añadiendo 2 metodos,
 * Cambiar las marchas del coche según si es automatico o manual **/

public class CotxeSegonaPart_Joshua_Mas extends Cotxe_Joshua_Mas {
    // Atributos
    private MarxesA estatmarxaA = MarxesA.N;
    private MarxesM estatmarxaM = MarxesM.N;
    private MarxesA marxaA;
    private MarxesM marxaM;


    // Constructor
    public CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi, MarxesA estatmarxaA, MarxesM estatmarxaM, MarxesA marxaA, MarxesM marxaM) {
        super(marca, model, tipuscanvi);
        this.estatmarxaA = estatmarxaA;
        this.estatmarxaM = estatmarxaM;
        this.marxaA = marxaA;
        this.marxaM = marxaM;
    }

    // Constructor default
    CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    // Creamos un metodo para cambiar las marchas en un coche automatico.

    void CanviarMarxaAutomatic(MarxesA marxa) throws Exception {

       /* Comprobamos si el coche está encendido, después si es un coche automático para poder seguir,
          si no introduce una marxa que exista te saltará Marxa incorrecta.*/

        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            if (tipuscanvi == TipusCanvi.CanviAutomatic) {
                if (marxa == MarxesA.F || marxa == MarxesA.N || marxa == MarxesA.R) {

                    // Si estamos en la marxa N...

                    if (this.estatmarxaA.equals(MarxesA.N)) {
                        if (marxa == MarxesA.F) {
                            this.estatmarxaA = MarxesA.F;
                            System.out.println("F");
                        } else if (marxa == MarxesA.R) {
                            this.estatmarxaA = MarxesA.R;
                            System.out.println("R");
                        } else throw new Exception("Marxa incorrecta");

                        // Si estamos en la marxa F...

                    } else if (this.estatmarxaA.equals(MarxesA.F)) {
                        if (marxa == MarxesA.N) {
                            estatmarxaA = MarxesA.N;
                            System.out.println("N");
                        } else throw new Exception("Marxa incorrecta");

                        // Si estamos en la marxa R...

                    } else if (this.estatmarxaA.equals(MarxesA.R)) {
                        if (marxa == MarxesA.N) {
                            this.estatmarxaA = MarxesA.N;
                            System.out.println("N");
                        } else throw new Exception("Marxa incorrecta");
                    }
                } else throw new Exception("Marxa incorrecta");
            } else throw new Exception("Cotxe manual. No pots fer un canvi automàtic");
        } else throw new Exception("El cotxe està aturat. No pots canviar de marxa");
    }

     /* Creamos un metodo para cambiar las marchas en un coche manual. Comprobamos si el coche está encendido,
       después si es un coche manual para poder seguir, si no introduce una marxa que exista, te saltará Marxa incorrecta.*/

    void CanviarMarxaManual(MarxesM marxa2) throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            if (tipuscanvi == TipusCanvi.CanviManual) {
                if (marxa2 == MarxesM.R || marxa2 == MarxesM.N || marxa2 == MarxesM.G1
                        || marxa2 == MarxesM.G2 || marxa2 == MarxesM.G3 || marxa2 == MarxesM.G4
                        || marxa2 == MarxesM.G5 || marxa2 == MarxesM.G6) {

// Si estamos en la marxa R...

                    if (this.estatmarxaM.equals(MarxesM.R)) {
                        if (marxa2 == MarxesM.N) {
                            this.estatmarxaM = MarxesM.N;
                            System.out.println("N");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa N...

                    } else if (this.estatmarxaM.equals(MarxesM.N)) {
                        if (marxa2 == MarxesM.G1) {
                            this.estatmarxaM = MarxesM.G1;
                            System.out.println("G1");
                        } else if (marxa2 == MarxesM.R) {
                            this.estatmarxaM = MarxesM.R;
                            System.out.println("R");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G1...

                    } else if (this.estatmarxaM.equals(MarxesM.G1)) {
                        if (marxa2 == MarxesM.N) {
                            this.estatmarxaM = MarxesM.N;
                            System.out.println("N");
                        } else if (marxa2 == MarxesM.G2) {
                            this.estatmarxaM = MarxesM.G2;
                            System.out.println("G2");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G2...

                    } else if (this.estatmarxaM.equals(MarxesM.G2)) {
                        if (marxa2 == MarxesM.G1) {
                            this.estatmarxaM = MarxesM.G1;
                            System.out.println("G1");
                        } else if (marxa2 == MarxesM.G3) {
                            this.estatmarxaM = MarxesM.G3;
                            System.out.println("G3");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G3...

                    } else if (this.estatmarxaM.equals(MarxesM.G3)) {
                        if (marxa2 == MarxesM.G2) {
                            this.estatmarxaM = MarxesM.G2;
                            System.out.println("G2");
                        } else if (marxa2 == MarxesM.G4) {
                            this.estatmarxaM = MarxesM.G4;
                            System.out.println("G4");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G4...

                    } else if (this.estatmarxaM.equals(MarxesM.G4)) {
                        if (marxa2 == MarxesM.G3) {
                            this.estatmarxaM = MarxesM.G3;
                            System.out.println("G3");
                        } else if (marxa2 == MarxesM.G5) {
                            this.estatmarxaM = MarxesM.G5;
                            System.out.println("G5");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G5...

                    } else if (this.estatmarxaM.equals(MarxesM.G5)) {
                        if (marxa2 == MarxesM.G4) {
                            this.estatmarxaM = MarxesM.G4;
                            System.out.println("G4");
                        } else if (marxa2 == MarxesM.G6) {
                            this.estatmarxaM = MarxesM.G6;
                            System.out.println("G6");
                        } else throw new Exception("Marxa incorrecta");

// Si estamos en la marxa G6...

                    } else if (this.estatmarxaM.equals(MarxesM.G6)) {
                        if (marxa2 == MarxesM.G5) {
                            this.estatmarxaM = MarxesM.G5;
                            System.out.println("5");
                        } else throw new Exception("Marxa incorrecta");
                    }
                } else throw new Exception("Marxa incorrecta");
            } else throw new Exception("Cotxe automàtic. No pots fer un canvi manual");
        } else throw new Exception("El cotxe està aturat. No pots canviar de marxa");
    }
    // Getters & Setters

    public MarxesA getEstatmarxaA() {
        return estatmarxaA;
    }

    public void setEstatmarxaA(MarxesA estatmarxaA) {
        this.estatmarxaA = estatmarxaA;
    }

    public MarxesM getEstatmarxaM() {
        return estatmarxaM;
    }

    public void setEstatmarxaM(MarxesM estatmarxaM) {
        this.estatmarxaM = estatmarxaM;
    }

    public MarxesA getMarxaA() {
        return marxaA;
    }

    public void setMarxaA(MarxesA marxaA) {
        this.marxaA = marxaA;
    }

    public MarxesM getMarxaM() {
        return marxaM;
    }

    public void setMarxaM(MarxesM marxaM) {
        this.marxaM = marxaM;
    }
}