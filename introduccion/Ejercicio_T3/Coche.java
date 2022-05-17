public class Coche {

    public int puertas;

    public Coche() {
        puertas = 2;
    }

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.incrementarPuertas();
        System.out.println(coche.puertas);
    }

    public void incrementarPuertas() {
        puertas++;
    }
}
