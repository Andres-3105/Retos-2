//  Reto 3: Ahorcado con arrays
package RetosII;
import java.util.Scanner;
import java.util.Random;
public class Reto3 {
    public static void main(String[] args) {
        // Variables
        String letra, opcion;
        // Arreglo de palabras
        String[] palabras = {"Optimus", "MarcusFenix", "Ellie", "Kratos", "MasterChief"};
        // Arreglo de intentos para cada palabra
        int[] intentosPorPalabra = {11, 15, 9, 10, 15};
        Scanner capturar = new Scanner(System.in);
        do {
            System.out.println("------------------------------------");
            System.out.println("| Bienvenido al juego del ahorcado |");
            System.out.println("------------------------------------");
            //Objeto random de la clase Random para generar un numero aleatorio
            Random random = new Random();
            // Creo una variable llamada aletorio que almacena el numero generado aleatoriamente de las posiciones del array Palabras
            int aleatorio = random.nextInt(palabras.length);
            // Se almacena la palabraAleatoria del array palabras usando el numero aleatorio de la variable aleatorio
            String palabraAleatoria = palabras[aleatorio];
            // Se muestra la cantidad de letras en la palabra aleatoria.
            System.out.println("La palabra cuenta con " + palabraAleatoria.length() + " letras");
            // Se muestra la cantidad de letras de la palabra con _
            StringBuilder palabraOculta = new StringBuilder("_".repeat(palabraAleatoria.length()));
            // Se crea la variable intentos que almacena los intentos de la palabra aleatoria
            int intentos = intentosPorPalabra[aleatorio];
            // Se crea una variable que almacena las letras ingresadas 
            String letrasIngresadas = "";
            // Se ejecuta mientras los intentos sean mayores a 0 y que la palabra aleatoria sea diferente a la palabra que guarda las letras ingresadas
            while (intentos > 0 && !palabraAleatoria.equalsIgnoreCase(palabraOculta.toString())) {
                System.out.println("Palabra oculta: " + palabraOculta);
                System.out.println("--------------------" + "-".repeat(palabraOculta.length()));
                System.out.println("Ingrese una letra");
                letra = capturar.nextLine();
                //Convierto la letra en minuscula
                letra = letra.toLowerCase();
                // Comprueba si la letra ingresada por el jugador ya ha sido ingresada anteriormente.
                if (letrasIngresadas.contains(letra)) {
                    System.out.println("Ya has ingresado esa letra. ¡Intenta con otra!");
                    continue;
                }
                // Agregar la letra en una adivinada en otra varible para que se sume a la palabra
                letrasIngresadas += letra;
                // Siempre sera falso la variable acierto pero si adivina sera verdadero
                boolean acierto = false;
                for (int i = 0; i < palabraAleatoria.length(); i++) {
                    // Actualiza la palabra oculta si la variable acierto es verdadero
                    if (letra.charAt(0) == palabraAleatoria.toLowerCase().charAt(i)) {
                        palabraOculta.setCharAt(i, palabraAleatoria.charAt(i));
                        acierto = true;
                    }
                }
                if (acierto) {
                    System.out.println("¡La letra " + letra + " está en la palabra!");
                } else {
                    intentos--;
                    System.out.println("La letra " + letra + " no está presente en la palabra.");
                    System.out.println("Le quedan " + intentos + " intentos.");
                }
            }
            // Muestro la palabra oculta al final para que la vea antes de felicitarlo o decirle que ha perdido
            System.out.println("Palabra oculta: " + palabraOculta);
            if (palabraAleatoria.equalsIgnoreCase(palabraOculta.toString())) {
                System.out.println("-------------------------------------------------------------------" + "-".repeat(palabraAleatoria.length()));
                System.out.println("| ¡Felicidades :) adivinaste la palabra!. La palabra secreta era " + palabraAleatoria + " |");
                System.out.println("-------------------------------------------------------------------" + "-".repeat(palabraAleatoria.length()));
            } else {
                System.out.println("--------------------------------------------------------------------------" + "-".repeat(palabraAleatoria.length()));
                System.out.println("¡Lo sentimos :( has perdido. Intenta nuevamente! La palabra secreta era " + palabraAleatoria + " |");
                System.out.println("--------------------------------------------------------------------------" + "-".repeat(palabraAleatoria.length()));
            }            
            System.out.println("----------------------------");
            System.out.println("| ¿Quieres volver a jugar? |");
            System.out.println("----------------------------");
            opcion = capturar.nextLine();
        } while (opcion.equalsIgnoreCase("Si"));
        capturar.close();
    }
}