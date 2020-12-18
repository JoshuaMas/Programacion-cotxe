package Cotxe_simulator;
/*
        -Project: Programacion-cotxe

        -Date: 11/12/2020

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
    m1,
    m2,
    m3,
    m4,
    m5,
    m6;
}
enum Aireacondicionat {
    Obert,
    Tancat;
}

/** En esta actividad actualizamos el programa del simulador de coche añadiendo 4 metodos,
 * Cambiar las marchas del coche según si es automatico o manual, además de encender y apagar el aire acondicionado. **/

public class CotxeSegonaPart_Joshua_Mas extends Coche_Joshua_Mas {
    // Atributos
    private MarxesA estatmarxaA = MarxesA.N;
    private MarxesM estatmarxaM = MarxesM.N;
    private MarxesA marxaA;
    private MarxesM marxaM;
    private Aireacondicionat aireacondicionat = Aireacondicionat.Tancat;


    public MarxesA getEstatmarxaA() {
        return estatmarxaA;
    }

    public MarxesM getEstatmarxaM() {
        return estatmarxaM;
    }

    public CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi, MarxesA estatmarxaA, MarxesM estatmarxaM, MarxesA marxaA, MarxesM marxaM) {
        super(marca, model, tipuscanvi);
        this.estatmarxaA = estatmarxaA;
        this.estatmarxaM = estatmarxaM;
        this.marxaA = marxaA;
        this.marxaM = marxaM;
        this.aireacondicionat = aireacondicionat;
    }

    // Constructor
    CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    // Creamos un metodo para cambiar las marchas en un coche automatico.
    public void canmbiarmarxaA(char a) throws Exception {
        if (tipuscanvi == TipusCanvi.CanviAutomatic &&  a == '+') {
            if (this.estatmarxaA.equals(MarxesA.N)) {
                this.estatmarxaA = MarxesA.F;
                System.out.println("Modo forward.");
            } else if (this.estatmarxaA.equals(MarxesA.R)) {
                this.estatmarxaA = MarxesA.N;
                System.out.println("Modo neutro.");
            } else if (this.estatmarxaA.equals(MarxesA.F))
                System.out.println("Es imposible acelerar más");
        } else if (a == '-') {
            if (this.estatmarxaA.equals(MarxesA.N)) {
                this.estatmarxaA = MarxesA.R;
                System.out.println("Modo hacia atrás.");
            } else if (this.estatmarxaA.equals(MarxesA.F)) {
                this.estatmarxaA = MarxesA.N;
                System.out.println("Modo Neutro.");
            } else if (this.estatmarxaA.equals(MarxesA.R))
                System.out.println("no puedes bajar más marchas.");
        } else throw new Exception("Solo puedes poner + o - y tiene que ser un coche automatico.");
    }
    // Creamos un metodo para cambiar las marchas en un coche manual.
    public void canmbiarmarxaM(char b) throws Exception {
        if (tipuscanvi == TipusCanvi.CanviManual && b == '+') {
            if (this.estatmarxaM.equals(MarxesM.N)) {
                this.estatmarxaM = MarxesM.m1;
                System.out.println("Estableciendo la marcha 1.");
            } else if (this.estatmarxaM.equals(MarxesM.m1)) {
                this.estatmarxaM = MarxesM.m2;
                System.out.println("Estableciendo la marcha 2.");
            } else if (this.estatmarxaM.equals(MarxesM.m2)) {
                this.estatmarxaM = MarxesM.m3;
                System.out.println("Estableciendo la marcha 3");
            }else if (this.estatmarxaM.equals(MarxesM.m3)) {
                this.estatmarxaM = MarxesM.m4;
                System.out.println("Estableciendo la marcha 4.");
            } else if (this.estatmarxaM.equals(MarxesM.m4)) {
                this.estatmarxaM = MarxesM.m5;
                System.out.println("Estableciendo la marcha 5.");
            } else if (this.estatmarxaM.equals(MarxesM.m5)) {
                this.estatmarxaM = MarxesM.m6;
                System.out.println("Estableciendo la marcha 6.");
            } else if (this.estatmarxaM.equals(MarxesM.m6)) {
                System.out.println("No se puede acelerar mas.");
            } else if (this.estatmarxaM.equals(MarxesM.R)) {
                this.estatmarxaM = MarxesM.N;
                System.out.println("Estableciendo la marcha neutra.");
            }
        } else if (b == '-') {
            if (this.estatmarxaM.equals(MarxesM.N)) {
                this.estatmarxaM = MarxesM.R;
                System.out.println("Modo hacia atrás.");
            } else if (this.estatmarxaM.equals(MarxesM.m6)) {
                this.estatmarxaM = MarxesM.m5;
                System.out.println("Estableciendo la marcha 5");
            } else if (this.estatmarxaM.equals(MarxesM.m5)) {
                this.estatmarxaM = MarxesM.m4;
                System.out.println("Estableciendo la marcha 4");
            } else if (this.estatmarxaM.equals(MarxesM.m4)) {
                this.estatmarxaM = MarxesM.m3;
                System.out.println("Estableciendo la marcha 3");
            } else if (this.estatmarxaM.equals(MarxesM.m3)) {
                this.estatmarxaM = MarxesM.m2;
                System.out.println("Estableciendo la marcha 2");
            } else if (this.estatmarxaM.equals(MarxesM.m2)) {
                this.estatmarxaM = MarxesM.m1;
                System.out.println("Estableciendo la marcha 1");
            } else if (this.estatmarxaM.equals(MarxesM.m1)) {
                this.estatmarxaM = MarxesM.N;
                System.out.println("Estableciendo la marcha neutra");
            } else if (this.estatmarxaM.equals(MarxesM.R)) {
                System.out.println("No puedes bajar más marchas.");
            }
        } else throw new Exception("Solo puedes poner + o - y el coche tiene que ser manual. ");
    }
    // Metodo para encender el aire acondicionado.
    public void encenderAire() throws Exception {
        if (this.aireacondicionat == Aireacondicionat.Tancat) {
            this.aireacondicionat = Aireacondicionat.Obert;
        } else throw new Exception("El aire ya esta encendido ");

    }
    // Metodo para apagar el aire acondicionado.
    public void apagarAire() throws Exception{
        if (this.aireacondicionat==Aireacondicionat.Obert){
            this.aireacondicionat=Aireacondicionat.Tancat;
        }else throw new Exception("El aire ya esta apagado");
}

    // Getters & Setters

    public void setEstatmarxaA(MarxesA estatmarxaA) {
        this.estatmarxaA = estatmarxaA;
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

    public Aireacondicionat getAireacondicionat() {
        return aireacondicionat;
    }

    public void setAireacondicionat(Aireacondicionat aireacondicionat) {
        this.aireacondicionat = aireacondicionat;
    }
}
