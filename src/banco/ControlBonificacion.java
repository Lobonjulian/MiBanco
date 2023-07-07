package banco;

public class ControlBonificacion {
    private double suma;

    public double registrarSalarios(Trabajadores trabajadores){
        this.suma = trabajadores.getBonificacion() + this.suma;
        System.out.println("Dinero a pagar" + this.suma);
        return this.suma;
    }

}
