package banco;
//logica de iniciar session
public class SistemaInterno {

    private String clave = "Julitomuxik.com";

    public boolean autentica(Autenticable gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }

}
