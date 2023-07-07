package banco;

public class PruebaControlBonificacion {
    public static void main(String[] args) {
        Trabajadores jUlian = new Trabajadores();
        jUlian.setSalario(1500);

        Gerente Jillian = new Gerente();
        Jillian.setSalario(5000);

        Contador Isabella = new Contador();
        Isabella.setSalario(2500);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalarios(jUlian);
		controlBonificacion.registrarSalarios(Jillian);
		controlBonificacion.registrarSalarios(Isabella);
    }
}
