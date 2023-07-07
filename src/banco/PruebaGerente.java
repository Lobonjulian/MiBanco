package banco;

public class PruebaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(2580000);
        gerente.setClave("Julitomuxik");
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("Julitomuxik"));
    }
}
