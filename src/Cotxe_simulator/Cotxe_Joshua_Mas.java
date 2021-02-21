package Cotxe_simulator;

/*

-Project: Cotxe_Joshua_Mas

-Date: 21/02/2021

-Created by: Joshua Mas

*/
public class Cotxe_Joshua_Mas extends CotxeAbstracte {

    // Atributos
    public EstatsMotorCotxe estado = EstatsMotorCotxe.Aturat;
    int revoluciones = 0;

    // Constructor
    Cotxe_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    // Arrancamos el motor del coche
    public void arrancarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.Aturat)) {
            this.estado = EstatsMotorCotxe.EnMarxa;
            System.out.println("cotxe ences");
        } else
            throw new Exception("El cotxe ja està en marxa");
    }

    // Comprobamos el estado del motor, es decir, si está encendido o no.
    public EstatsMotorCotxe comprovaMotor() {
        return estado;
    }

    // Comprobamos las revoluciones del motor, en el caso de estar encendido, devolvemos un número aleatorio o si esta apagado, devolvemos 0.
    public int getRevolucions() {
        if (estado.equals(EstatsMotorCotxe.Aturat)) {
            return revoluciones;
        } else
            revoluciones = (int) (Math.random() * 6500 + 1);
        return revoluciones;
    }
    // Paramos el motor.
    public void aturarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            this.estado = EstatsMotorCotxe.Aturat;
            System.out.println("Cotxe aturat");
        } else
            throw new Exception("El cotxe ja està aturat");
    }
}
