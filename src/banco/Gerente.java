package banco;

//gerente hereda de trabajadores todoas las funciones
public class Gerente extends Trabajadores implements Autenticable{
    // Sobre-escritura de metodo
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        return false;
    }

}
