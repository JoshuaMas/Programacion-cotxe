public class CotxeSegonaPart_Joshua_Mas extends Coche_Joshua_Mas {

    // Atributos
    private MarxesA estatmarxaA = MarxesA.N;
    private MarxesM estatmarxaM = MarxesM.N;

    //Constructor
    CotxeSegonaPart_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    //Creamos un metodo para cambiar las marchas entre modo Forward, Neutro o Hacia atrás.

    public void canviAutomatic(char a) throws Exception {
        if (a == '+') {
            if (this.estatmarxaA.equals(MarxesA.N)) {
                this.estatmarxaA = MarxesA.F;
                System.out.println("Modo furioso.");
            } else if (this.estatmarxaA.equals(MarxesA.R)){
                this.estatmarxaA = MarxesA.N;
                System.out.println("Modo neutro.");
            } else if (this.estatmarxaA.equals(MarxesA.F))
                System.out.println("Es imposible acelerar más");
        }else if(a=='-'){
            System.out.println("Working in it");

        }else throw new Exception("Pon + o - Crack fiera mastodonte");


        /*(a=='-')
            if (this.estatmarxa=MarxesA.F) this.estatmarxa=MarxesA.N;
        */

    }
}
