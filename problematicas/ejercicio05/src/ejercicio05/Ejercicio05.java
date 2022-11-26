package ejercicio05;

public class Ejercicio05 {

    public static void main(String[] args) {

        double contador = 0;
        double operacion = 1;
        double denominador = 3;
        String mensaje = "1";

        do {
            contador = contador + 1;

            if (contador % 2 == 0) {

                operacion = operacion + 1 / denominador;
                mensaje = String.format("%s + 1/%.0f", mensaje, denominador);

            } else {

                operacion = operacion - 1 / denominador;
                mensaje = String.format("%s - 1/%.0f", mensaje, denominador);

            }
            denominador = denominador + 2;
        } while (contador <= 6);

        System.out.printf("%s = %s\n", mensaje, operacion);

    }

}
