package banco;

public class Contador extends Trabajadores {
    @Override
    public double getBonificacion() {
        System.out.println("Llamando metodo del Contador");
        return 500;
    }
}
