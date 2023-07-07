package banco;

public class PruebaTrabajadores {
    public static void main(String[] args) {
        Trabajadores julian = new Trabajadores();
        julian.setNombre("Julian");
        julian.setDocumento("256401254");
        julian.setSalario(2000);
        julian.setTipo(0);

        System.out.println(julian.getSalario());
        System.out.println(julian.getBonificacion());
    }
}
