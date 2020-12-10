/*

-Project: Cotxe_Joshua_Mas

-Date: 04/12/2020

-Created by: Joshua Mas

*/
public abstract class CotxeAbstracte implements InterfaceCotxe {

    protected String marca;
    protected String model;
    protected TipusCanvi tipuscanvi;

    public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
        this.marca=marca;
        this.model=model;
        this.tipuscanvi=tipuscanvi;
    }
}

