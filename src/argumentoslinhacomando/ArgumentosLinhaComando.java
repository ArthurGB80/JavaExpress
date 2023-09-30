package ArgumentosLinhaComando;

public class ArgumentosLinhaComando {

    public static void main (String[] args){
        System.out.println("Número de Argumentos: " + args.length);

        for( int i = 0; i < args.length; i++) {
            System.out.println("Argumentos " + (i + 1) + ": " + args[i]);
        }
    }
}
// Numero de Argumentos: 3
// Argumento 1: arg1
// Argumento 2: arg2
// Argumento 3: arg3
