// Reto 2: Competencia de natación
package RetosII;
import java.util.*;
public class Reto2 {
    public static void main(String[] args) {
        int cantComp, ganador;
        Scanner capturar = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ¡Bienvenido al programa! Podra ingresar la cantidad de competidores que van a participar, sus nombres, tiempo y saber quien gano |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese la cantidad de competidores que van a participar en la competencia de natación");
        cantComp = capturar.nextInt();
        capturar.nextLine();
        String [] competidores = new String [cantComp];
        String [] nombres = new String [cantComp];
        int [] tiempo = new int [cantComp];;
        for (int i = 0; i < competidores.length; i++) {
            System.out.println("Ingrese el nombre del competidor " + (i+1));
            nombres[i] = capturar.nextLine();
            System.out.println("El nombre del competidor " + (i+1) + " es " + nombres[i]);
            System.out.println("Ingrese el tiempo del competidor " + (i+1));
            tiempo[i] = capturar.nextInt();
            capturar.nextLine();
            System.out.println("El tiempo del competidor " + (i+1) + " es " + tiempo[i] + " minutos");
        }
        ganador = 0;
        for (int i = 1; i < cantComp; i++) {
            if (tiempo[i] < tiempo[ganador]) {
                ganador = i;
            }
        }
        System.out.println("El ganador de la competencia de natación es: " + nombres[ganador] + " con un tiempo de " + tiempo[ganador] + " minutos.");
        capturar.close();
    }
}