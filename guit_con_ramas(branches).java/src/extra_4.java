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
        String[]nombre= new int[10];
        Double[]promedio= new int[10];
        int aprobados=0;
        int desaprobados=0;
        relleno(nombre[],promedio[]);
        aprobados_desaprobados(nombre[],promedio[],aprobados,desaprobados);
    }
    public static void aprobados_desaprobados(String []nombre,Double[]promedio,int aprobados,int desaprobados) {
        for (int i = 0; i < promedio.length; i++) {
            if(promedio[i]>=7){
                aprobados++;
            }
            else{
                desaprobados++;
            }
        }
        System.out.println("Cantidad de aprobados "+aprobados);
        System.out.println("Cantidad de desaprobados "+desaprobados);
    }
}