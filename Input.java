import java.util.Scanner;
public class Input
{
public static void main(String[] args) {
int edad,x;
//int x;
String nombre;
Scanner entrada= new Scanner(System.in);

System.out.println("Ingrese la edad: ");
edad = entrada.nextInt();

System.out.println("Ingrese el nombre: ");
nombre = entrada.next();

System.out.println("Hola "+ nombre+" tu edad es: "+ edad);

System.out.println("Ingrese un número: ");
x = entrada.nextInt();

System.out.println("El cuadrado del número ingresado es: "+(x*x));
}
}