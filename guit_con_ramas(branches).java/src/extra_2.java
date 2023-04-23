import java.util.Scanner;
/*Escriba un programa que averigüe si dos vectores de N 
enteros son iguales (la comparación deberá detenerse en 
cuanto se detecte alguna diferencia entre los elementos). */
import java.util.concurrent.SynchronousQueue;

public class extra_2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int[]vec_1=new int [3];
        int[]vec_2=new int [3];
        int aux=0;
        boolean bandera=true;
        for (int i = 0; i < vec_2.length; i++) {
            System.out.println("Ingrese valor de vec_1");
            vec_1[i]=leer.nextInt();
            System.out.println("Ingrese valor de vec_2");
            vec_2[i]=leer.nextInt();
        }
        for (int i = 0; i < vec_2.length; i++) {
           if(vec_1[i]!=vec_2[i]){
            bandera=false;
            break;
           }
        }
        if (bandera) {
            System.out.println("Ambos vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}
