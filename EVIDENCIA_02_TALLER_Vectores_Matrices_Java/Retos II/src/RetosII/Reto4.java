// Reto 4: Maquina Expendedora
package RetosII;
import java.util.*;
public class Reto4 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("| ¡Bienvenido al programa! Podrá elegir alguno de los 16 productos de la máquina expendedora |");
        System.out.println("----------------------------------------------------------------------------------------------");
        Object [][] productos = new Object[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el nombre del producto: ");
                Object producto = capturar.nextLine();
                System.out.print("Ingrese el código del producto: ");
                Object codigo = capturar.nextLine();
                System.out.print("Ingrese el precio del producto: ");
                Object precio = capturar.nextInt();
                capturar.nextLine();    
                String precioP = precio.toString();
                Object[] maquinaEx = {producto, codigo, precioP};
                productos[i][j] = maquinaEx;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Object[] maquinaEx = (Object[]) productos[i][j];
                System.out.println("-".repeat(String.valueOf(maquinaEx).length())+"-------");
                System.out.println("| Producto: " + maquinaEx[0] + " Código: " + maquinaEx[1] + " Precio: " + maquinaEx[2] + " |");
                System.out.println("-".repeat(String.valueOf(maquinaEx).length())+"-------");
            }
            System.out.println();
        }
        capturar.close();
    }
}