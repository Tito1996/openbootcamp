package Ejercicio_T4;

/**
 * EjercicioT4
 */
public class EjercicioT4 {

    public static int numeroIf, numeroWhile, numeroDoWhile;
    public static String estacion;

    public static void main(String[] args) {
        usandoIf(numeroIf = 3);
        usandoIf(numeroIf = -3);
        usandoIf(numeroIf = 0);

        usandoWhile(numeroWhile = -4);

        usandoDoWhile(numeroDoWhile = 80);

        usandoFor();

        usandoSwitch(estacion = "primavera");
        usandoSwitch(estacion = "verano");
        usandoSwitch(estacion = "invierno");
        usandoSwitch(estacion = "otoño");
        usandoSwitch(estacion = "invierano");
    }

    public static void usandoIf(int x) {
        if (x > 0) {
            System.out.println("Es mayor que 0");
        } else if(x < 0){
            System.out.println("Es menor que 0");
        }else {
            System.out.println("Es igual a 0");
        }
    }

    public static void usandoWhile(int x) {
        while (x < 3) {
            System.out.println(x);
            x++;
        }
    }

    public static void usandoDoWhile(int x) {
        do {
            System.out.println(x);
            x = 3;
        } while (x < 3);
    }

    public static void usandoFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void usandoSwitch(String x) {
        switch (x) {
            case "primavera":
            case "verano":
            case "otoño":
            case "invierno":
                System.out.println("Estamos en " + x);
                break;
        
            default:
                System.out.println("Esa estación no existe en este palenta");
                break;
        }
    }
}