//MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL PRIMARIA Y SECUNDARIA
package ejerciciomatriz1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjercicioMatriz1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables
        int [][] matriz = new int[10][10];//Matriz
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        //Creamos un bucle
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                matriz[i][j] = sc.nextInt();
                //matriz[i][j] = sc.nextInt();
                //Suma de la diagonal Principal
                if(i == j){
                    sumaDiagonalPrincipal += matriz[i][j];
                }      
                //Suma de la diagonal Secundaria
                if(i+j == (matriz.length - 1)){
                    sumaDiagonalSecundaria += matriz[i][j];
                }
            }
        }  
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        System.out.println("La suma de la diagonal primaria es : "+sumaDiagonalPrincipal);
        System.out.println("La suma de la diagonal secundaria es : "+sumaDiagonalSecundaria);
    }
}