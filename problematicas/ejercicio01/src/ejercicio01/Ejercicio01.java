package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alexito
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        String mensaje = "";
        String opcion;
        String listaE = "";
        int edad;
        double estatura;
        boolean bandera = true;

        double sumaEdades = 0;
        double sumaEstaturas = 0;
        double totalEdades;
        double totalEstaturas;
        double contador = 0;

        do {

            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la edad de del jugador");
            edad = entrada.nextInt();

            System.out.println("Ingrese la posición del jugador en el campo "
                    + "de juego");
            entrada.nextLine();
            posicion = entrada.nextLine();

            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            
            contador = contador + 1;
            
            listaE = String.format("%s%d\n",listaE,edad);

            mensaje = String.format("%s%.0f. %s -%s-, edad %d, estatura %.2f\n",
                    mensaje,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);

            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            

            System.out.println("Si desea terminar el proceso, ingrese s "
                    + "de salir");
            opcion = entrada.nextLine();

            if ("s".equals(opcion)) {

                bandera = false;
            }

        } while (bandera);

        totalEdades = sumaEdades / contador;
        totalEstaturas = sumaEstaturas / contador;

        mensaje = String.format("%sLista de edades:\n%s"
                + "Promedio de edades: %.2f\n"
                + "Promedio de estaturas: %.2f",
                mensaje,
                listaE,
                totalEdades,
                totalEstaturas);

        System.out.println(mensaje);
    }

}
