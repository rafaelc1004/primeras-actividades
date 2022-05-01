package proyectosaludo;

/**
 *
 * @author Rafaelito
 */
public class Remuneraciones {

    public static void main(String arg[]) {

        if (arg.length < 6) {
            mostrarAyuda();
        }else{
            calcularRemuneraciones(arg);
        }
    }

    private static void mostrarAyuda() {

        System.out.println("Remuneraciones [Sueldo Base], [Colacion], [movilizacion], "
                + "[AFP], [Salud], [Tipo de contrato]");
        System.out.println("Ejemplo Remuneracion : 500000 30000 25000 Provida Fonasa Indefinido");

    }

    private static void calcularRemuneraciones(String[] arg) {
        int sueldoBase = Integer.parseInt(arg[0]);
        int colacion = Integer.parseInt(arg[1]);
        int movilizacion = Integer.parseInt(arg[2]);
        String afp = arg[3];
        String salud = arg[4];
        char tipoContrato = arg[5].charAt(0);
        
        int montoImponible = calcularMontoImponible(sueldoBase);
        int montoAFP = calcularMontoAFP(colacion, afp);
        
        System.out.println("El monto imponible es :"+montoImponible);
        System.out.println("AFP: "+afp);
        System.out.println("Monto AFP :"+montoAFP);

    }

    private static int calcularMontoImponible(int sueldoBase) {

        return sueldoBase;
    }

    private static int calcularMontoNoImponible(int colacion, int movilizacion) {
        return colacion + movilizacion;
    }

    private static int calcularMontoAFP(int montoImponible, String afp) {

        switch (afp) {
            case "Capital":
                return (int) (montoImponible * 0.1144);
            case "Cuprum":
                return (int) (montoImponible * 0.1144);
            case "Habitat":
                return (int) (montoImponible * 0.1127);
            case "Plan Vida":
                return (int) (montoImponible * 0.1116);
            case "Provida":
                return (int) (montoImponible * 0.1145);
            case "Modelo":
                return (int) (montoImponible * 0.1058);
            case "Uno":
                return (int) (montoImponible * 0.1069);

        }

        return 0;
    }

}
