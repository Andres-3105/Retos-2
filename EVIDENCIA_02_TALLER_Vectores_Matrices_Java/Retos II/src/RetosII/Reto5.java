// Reto 5: Juego de Concentrece
package RetosII;
import java.util.*;
public class Reto5 {
    public static void main(String[] args) {
        int intentos = 0;
        int paresEncontrados = 0;
        int fila1, columna1;
        int fila2, columna2;
        Scanner capturar = new Scanner(System.in);

        char[][] tablero = { 
            { 'A', 'B', 'C', 'D' },
            { 'E', 'F', 'G', 'H' },
            { 'A', 'B', 'C', 'D' },
            { 'E', 'F', 'G', 'H' }
        };

        char[][] tableroVisual = { 
            { '?', '?', '?', '?' },
            { '?', '?', '?', '?' },
            { '?', '?', '?', '?' },
            { '?', '?', '?', '?' }
        };

        List<String> combinacionesEncontradas = new ArrayList<>();

        while (paresEncontrados < 8) { // 8 pares en total
            System.out.println("Ingrese la posición de la primera carta: Primero ingrese la columna y luego la fila");
            fila1 = capturar.nextInt();
            columna1 = capturar.nextInt();

            if (tableroVisual[fila1][columna1] != '?') {
                System.out.println("Esa posición ya ha sido revelada. Intente nuevamente.");
                continue;
            }

            tableroVisual[fila1][columna1] = tablero[fila1][columna1];

            System.out.println("Ingrese la posición de la segunda carta: Primero ingrese la columna y luego la fila");
            fila2 = capturar.nextInt();
            columna2 = capturar.nextInt();

            if (tableroVisual[fila2][columna2] != '?') {
                System.out.println("Esa posición ya ha sido revelada. Intente nuevamente.");
                continue;
            }

            tableroVisual[fila2][columna2] = tablero[fila2][columna2];
            intentos++;

            if (tablero[fila1][columna1] == tablero[fila2][columna2]) {
                System.out.println("¡Encontraste un par!");
                paresEncontrados++;
                String combinacion = "(" + fila1 + "," + columna1 + ") y (" + fila2 + "," + columna2 + ")";
                combinacionesEncontradas.add(combinacion);
            } else {
                System.out.println("No es un par. Inténtalo de nuevo.");
                tableroVisual[fila1][columna1] = '?';
                tableroVisual[fila2][columna2] = '?';
            }

            System.out.println("Tablero:");
            for (int i = 0; i < tableroVisual.length; i++) {
                for (int j = 0; j < tableroVisual[i].length; j++) {
                    System.out.print(tableroVisual[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("¡Felicidades, has encontrado todas las parejas!");
        System.out.println("Número de intentos: " + intentos);

        System.out.println("Combinaciones de parejas encontradas:");
        for (String combinacion : combinacionesEncontradas) {
            System.out.println(combinacion);
        }
        capturar.close();
    }
}