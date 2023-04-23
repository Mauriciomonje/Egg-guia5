import java.util.Scanner;
/*
Los profesores del curso de programación de Egg necesitan 
llevar un registro de las notas adquiridas por sus 10 alumnos 
para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 
por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio 
y se guarda en el arreglo. Al final del programa los 
profesores necesitan obtener por pantalla la cantidad de aprobados
 y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
public class extra_4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String[]nombre= new String[10];
        double[]promedio= new double[10];
        int aprobados=0;
        int desaprobados=0;
        relleno(nombre,promedio);
        //aprobados-desaprobados(nombre[],promedio[]);
    }
    public static void relleno(String []nombre,double[]promedio) {
        Scanner leer=new Scanner(System.in);
        int nota;
        for (int i = 0; i < promedio.length; i++) {
            System.out.println("Ingrese nombre del alumno de la posicion "+i);
            nombre[i]=leer.nextLine();
            System.out.println("Ingrese la nota del primer TP evaluativo ");
            nota=(int)(Math.random()*9)+3;
            System.out.println(nota);
            promedio[i]+=nota*0.1;
            System.out.println("Ingrese nota de segundo TP evaluativo");
            nota=(int)(Math.random()*9)+3;
            System.out.println(nota);
            promedio[i]+=nota*0.15;
            System.out.println("Ingrese nota del primer integrador");
            nota=(int)(Math.random()*9)+3;
            System.out.println(nota);
            promedio[i]+=nota*0.25;
            System.out.println("Ingrese nota del segundo integrador");
            nota=(int)(Math.random()*9)+1;
            System.out.println(nota);
            promedio[i]+=nota*0.5;
            System.out.println(promedio[i]+" promedio");
        }
    }
}