package Cotxe_simulator;

public class Testcotxesegonapart {
    public static void main(String[] args) {
        CotxeSegonaPart_Joshua_Mas c1= new CotxeSegonaPart_Joshua_Mas("Ferrari", "asd", TipusCanvi.CanviAutomatic);
        try {
            c1.canmbiarmarxaA('+');
            System.out.println(c1.getEstatmarxaM());
            c1.canmbiarmarxaA('-');
            System.out.println(c1.getEstatmarxaM());
            c1.encenderAire();
            System.out.println(c1.getAireacondicionat());
            c1.apagarAire();
            System.out.println(c1.getAireacondicionat());
            c1.apagarAire();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
