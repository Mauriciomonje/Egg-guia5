import java.util.Scanner;
/*
 * Crear una función rellene un vector con números aleatorios,
 * pasándole un arreglo por parámetro. Después haremos otra 
 * función o procedimiento que imprima el vector.
 */
public class extra_3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] vec_1= new int [3];
        relleno(vec_1);
        imprime(vec_1);
    }
    public static void relleno(int []vec_1) {
        for (int i = 0; i < vec_1.length; i++) {
            vec_1[i]=(int) (Math.random()*9)+1;
        }
    }
    public static void imprime(int [] vec_1) {
        for (int i = 0; i < vec_1.length; i++) {
            System.out.print("["+vec_1[i]+"]");
        }
    }
}
