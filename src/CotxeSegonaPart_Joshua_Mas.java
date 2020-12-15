public class CotxeSegonaPart_Joshua_Mas extends Coche_Joshua_Mas {
    // Atributos
    private MarxesA estatmarxaA = MarxesA.N;
    private MarxesM estatmarxaM = MarxesM.N;


    public MarxesA getEstatmarxaA() {
        return estatmarxaA;
    }

    public MarxesM getEstatmarxaM() {
        return estatmarxaM;
    }

    //Constructor
    CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    //Creamos un metodo para cambiar las marchas entre modo Forward, Neutro o Hacia atrás.
    public void canviarmarxaA(char a) throws Exception {
        if (a == '+') {
            if (this.estatmarxaA.equals(MarxesA.N)) {
                this.estatmarxaA = MarxesA.F;
                System.out.println("Modo rápido y furioso.");
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
        } else throw new Exception("Solo puedes poner + o -");
    }

    public void canviarmarxaM(char b) throws Exception {
        if (b == '+') {
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
        } else throw new Exception("Solo puedes poner + o -");
    }

}
