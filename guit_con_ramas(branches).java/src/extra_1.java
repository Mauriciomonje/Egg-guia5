import java.util.Scanner;

public class extra_1 {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int N,valor;
        valor=0;
        System.out.println("Ingrese el tamanio del vector");
        N=leer.nextInt();
        int[]vector=new int[N];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para la posicion "+i);
            vector[i]=leer.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            valor+=vector[i];
        }
        System.out.println("La suma del vector da como resultado "+valor);
    }
}
