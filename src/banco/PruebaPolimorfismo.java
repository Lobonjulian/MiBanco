package banco;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        // Elemento mas generico puede ser adaptado al elemento mas especifico
        Trabajadores trabajadores = new Gerente();
        trabajadores.setNombre("Julian");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jillian");

        trabajadores.setSalario(1500);
        gerente.setSalario(5000);

        gerente.iniciarSesion("hola-rola");

    }
}
