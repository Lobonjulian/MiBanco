package banco;

public class pruebaSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        sistema.autentica(gerente1);
        sistema.autentica(admin);
    }
}
