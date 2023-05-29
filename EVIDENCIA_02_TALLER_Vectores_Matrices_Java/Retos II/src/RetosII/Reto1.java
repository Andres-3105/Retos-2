// Reto 1: Calcular el promedio de notas
package RetosII;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        int cantnotas;
        double promdec=0;
        Scanner capturar = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("| ¡Bienvenido al programa! Podra ingresar las notas de la materia y conocer la nota final de cada alumno |");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese la cantidad de notas que desee: ");
        cantnotas = capturar.nextInt();
        int [] notas = new int [cantnotas];
        System.out.println("-----------------------------------------------");
        for (int i = 0; i<cantnotas; i++) {
            System.out.println("Ingrese la nota numero " + (i+1));
            notas[i] = capturar.nextInt();
            if (notas[i]>50) {
                System.out.println("Ingrese una nota valida");
                i--;
                continue;
            }
            promdec+=notas[i];
        }
        promdec = promdec / cantnotas;
        int prom = (int) Math.round(promdec);
        if (prom<30) {
            System.out.println("Lo sentimos :( tu nota final fue de " + prom + " por lo que has reprobado");
        } else if (prom>=30 && prom<=40) {
            System.out.println("Felicidades pero ¡Ten cuidado! :/ tu nota final fue de " + prom + " por lo que pasaste raspando");
        } else
        System.out.println("Felicidades :) tu nota final fue de " + prom + " por lo que has pasado con buenos resultados");
        capturar.close();
    }
}