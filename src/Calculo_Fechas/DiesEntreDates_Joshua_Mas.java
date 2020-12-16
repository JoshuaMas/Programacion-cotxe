package Calculo_Fechas;/*

-Project: Programacion-cotxe

-Date: 16/12/2020

-Created by: Joshua Mas

*/

public class DiesEntreDates_Joshua_Mas extends CalcularDiesEntreDates {
private int dies;
private int diesinicial;
private int diesdesti;
    @Override

    protected int diesMes(int mes) {

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dies=31;
                break;
            case 2:
                dies=28;
                break;

            case 4: case 6: case 9: case 11:
                dies=30;
                break;
        }
        return dies;
    }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
       this.diesinicial= dies - dataXS.dia;
        return this.diesinicial;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {
        this.diesdesti = dataXS.dia;
        return this.diesdesti;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        return 0;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        return 0;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected boolean anyDeTraspas(int any) {
        return false;
    }
}
