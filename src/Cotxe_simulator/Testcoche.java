package Cotxe_simulator;

/*

-Project: Cotxe_simulator.Coche_Joshua_Mas

-Date: 10/12/2020

-Created by: Joshua Mas

*/
public class Testcoche {    public static void main(String[] args) throws Exception {
    Cotxe_Joshua_Mas c1= new Cotxe_Joshua_Mas("Ferrari","xD",TipusCanvi.CanviAutomatic);

    System.out.println(c1.getRevolucions());
    System.out.println(c1.comprovaMotor());
    c1.arrancarMotor();
    System.out.println(c1.comprovaMotor());
    System.out.println(c1.getRevolucions());
    c1.aturarMotor();
    System.out.println(c1.comprovaMotor());

    }
}

