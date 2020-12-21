package Calculo_Fechas;/*

-Project: Programacion-cotxe

-Date: 16/12/2020

-Created by: Joshua Mas

*/

public class DiesEntreDates_Joshua_Mas extends CalcularDiesEntreDates {
    // Atributos que utilizamos en cada metodo
    int diesMesInicial;
    int diesMesDesti;
    int diesMes;
    int diesResteAnyInicial;
    int diesResteAnyDesti;
    int diesNumAniosCompletos;
    boolean anyDeTraspas;

    // Observamos los dias.
    @Override
    protected int diesMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                this.diesMes = 31;
                break;
            case 2:
                this.diesMes = 28;
                break;
            case 4: case 6: case 9: case 11:
                this.diesMes = 30;
                break;
        }
        return this.diesMes;
    }
    // Calcular los dias que quedan del mes inicial.

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        diesMesInicial = diesMes(dataXS.mes) - dataXS.dia;
        return this.diesMesInicial;
    }

    // Calcular los dias que han pasado en el mes destino
    @Override
    protected int diesMesDesti(DataXS dataXS) {
        diesMesDesti = dataXS.dia;
        return this.diesMesDesti;
    }

    // Calcular los dias que quedan del año inicial hasta los que han pasado del mes inicial
    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        datainicial.mes++;
        while (datainicial.mes <= 12){
            diesResteAnyInicial += diesMes(datainicial.mes);
            datainicial.mes++;
        }
        return this.diesResteAnyInicial;
    }

    @Override
    // Calcular los dias que han pasado del destino hasta los años que han pasado del mes destino.
    protected int diesResteAnyDesti(DataXS datadesti) {
        datadesti.mes--;
        while (datadesti.mes >= 1){
            diesResteAnyDesti += diesMes(datadesti.mes);
            datadesti.mes--;
        }
        return this.diesResteAnyDesti;
    }
    // Calcular los dias de los años completos entre las 2 fechas de años no bisiestos
    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        diesNumAniosCompletos = ((datadesti.any - datainicial.any) -1) * 365;
        return diesNumAniosCompletos;
    }

    @Override
    // Calcular los dias de los años completos entre las 2 fechas de años bisietros.
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diaBisiesto = 0;
        for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
            if (anyDeTraspas(datainicial.any + i)){
                diaBisiesto++;
            }
        }
        if (anyDeTraspas(datadesti.any)){
            diaBisiesto++;
        }
        return diaBisiesto;
    }
    // Calcular si el año es bisiesto o no.
    @Override
    protected boolean anyDeTraspas(int any) {
        if (any % 400 == 0 || ((any % 4 == 0) && !(any % 100 == 0))){
            anyDeTraspas = true;
        }
        else {
            anyDeTraspas = false;
        }
        return this.anyDeTraspas;
    }
}
