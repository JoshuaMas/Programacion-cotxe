/*

-Project: Cotxe_Joshua_Mas

-Date: 04/12/2020

-Created by: Joshua Mas

*/
public class Coche_Joshua_Mas extends CotxeAbstracte {

    // Atributos
    private EstatsMotorCotxe estado = EstatsMotorCotxe.Aturat;
    int revoluciones = 0;

    // Constructor
    Coche_Joshua_Mas(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    // Arrancamos el motor del coche
    public void arrancarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.Aturat)) {
            this.estado = EstatsMotorCotxe.EnMarxa;
        } else
            throw new Exception("El motor ya esta encendidmo");

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

    public void aturarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            this.estado = EstatsMotorCotxe.Aturat;
        } else
            throw new Exception("El motor ya esta apagado");
    }
}
