package Calculo_Fechas;/*

-Project: Programacion-cotxe

-Date: 16/12/2020

-Created by: Joshua Mas

*/

/*

-Project: Programacion-cotxe

-Date: 16/12/2020

-Created by: Joshua Mas

*/
public class TestDiesEntreDates {
    private static DiesEbtreDates_Joshua_Mas calcul;
    private static DataXS inici, desti;

    public static void main(String[] args) {
        calcul = new DiesEbtreDates_Joshua_Mas();
        try {
            inici = new DataXS("12/12/2017");
            desti = new DataXS("1/1/2018");
            System.out.println(calcul.nombreDiesTotals(inici,desti));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
