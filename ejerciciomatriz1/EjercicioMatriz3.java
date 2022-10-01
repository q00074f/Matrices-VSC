package ejerciciomatriz1;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[10][10];
        int [] sumF = new int [10];
        
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                matriz[i][j] = sc.nextInt();
                //matriz[i][j] = sc.nextInt();
                sumF[i] += matriz[i][j];
            }
        }
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        //Salida de datos
        for(int i=0; i < sumF.length;i++){
            System.out.println("La suma de la Fila "+(i+1)+" es : "+sumF[i]);
        }
    }
}
