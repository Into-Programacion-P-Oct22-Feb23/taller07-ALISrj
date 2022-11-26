package ejercicio03;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        int acumulador = 1;
        int contador = 2;
        String mensaje = "";

        do {
            
            mensaje = mensaje + contador + "\n";
            acumulador = acumulador + 2;
            contador = contador + acumulador;

        } while (contador <= 37);
        
        System.out.println(mensaje);
        
    }

}
