package ejercicio02;

public class Ejercicio02 {

    public static void main(String[] args) {

        int acumulador = 2;
        int contador = 2;
        String mensaje = "";

        while (contador <= 110) {

            mensaje = mensaje + contador + "\n";
            acumulador = acumulador + 2;
            contador = contador + acumulador;
        }

        System.out.println(mensaje);

    }

}
