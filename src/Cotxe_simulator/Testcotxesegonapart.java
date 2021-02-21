package Cotxe_simulator;

public class Testcotxesegonapart {
    public static void main(String[] args) {
        CotxeSegonaPart_Joshua_Mas c1= new CotxeSegonaPart_Joshua_Mas("Ferrari", "asd", TipusCanvi.CanviManual);
        CotxeSegonaPart_Joshua_Mas c2= new CotxeSegonaPart_Joshua_Mas("HI","lugsia", TipusCanvi.CanviAutomatic);
        try {

            c1.arrancarMotor();
            c1.CanviarMarxaManual(MarxesManual.R);
            c1.CanviarMarxaManual(MarxesManual.N);
            c1.CanviarMarxaManual(MarxesManual.G1);
            c1.CanviarMarxaManual(MarxesManual.G2);
            c1.CanviarMarxaManual(MarxesManual.G3);
            c1.CanviarMarxaManual(MarxesManual.G4);
            c1.CanviarMarxaManual(MarxesManual.G5);
            c1.CanviarMarxaManual(MarxesManual.G6);
            c2.arrancarMotor();
            c2.CanviarMarxaAutomatic(MarxesAutomatic.F);
            c2.CanviarMarxaAutomatic(MarxesAutomatic.N);
            c2.CanviarMarxaAutomatic(MarxesAutomatic.R);



            /*c1.aturarMotor();*/
            /*c1.CanviarMarxaAutomatic(MarxesA.F);
            System.out.println(c1.getEstatmarxaM());
            c1.CanviarMarxaAutomatic(MarxesA.N);
            System.out.println(c1.getEstatmarxaM());*/


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*            c1.encenderAire();
            System.out.println(c1.getAireacondicionat());
            c1.apagarAire();
            System.out.println(c1.getAireacondicionat());
            c1.apagarAire();*/