package ejerciciomatriz1;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[10][10];//Matriz
        int multiDiagonalPrincipal = 1;
        int multiDiagonalSecundaria = 1;  
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                matriz[i][j] = sc.nextInt();
                //matriz[i][j] = sc.nextInt();
                //Principal
                if(i == j){
                    multiDiagonalPrincipal *= matriz[i][j];
                }                
                //Secundaria
                if(i+j == (matriz.length - 1)){
                    multiDiagonalSecundaria *= matriz[i][j];
                }
            }
        }  
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }     
        System.out.println("La multiplicacion de la diagonal primaria es : "+multiDiagonalPrincipal);
        System.out.println("La multiplicacion de la diagonal secundaria es : "+multiDiagonalSecundaria);
    }
}
