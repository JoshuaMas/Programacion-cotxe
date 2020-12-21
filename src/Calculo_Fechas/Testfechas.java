package Calculo_Fechas;/*

-Project: Programacion-cotxe

-Date: 18/12/2020

-Created by: Joshua Mas

*/


public class Testfechas {
    public static void main(String[] args) {
        try {
            DiesEntreDates_Joshua_Mas d1 = new DiesEntreDates_Joshua_Mas();
            DataXS fechaInicial = new DataXS("22/11/1998");
            DataXS fechaDestino = new DataXS("30/06/2020");
            System.out.println("Han pasado " + d1.nombreDiesTotals(fechaInicial, fechaDestino) + " dias.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
