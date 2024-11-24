import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //leer los datos
        //un tipo int
        var consola  = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        
        //leer tipo double 
        System.out.println("ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        
        
    }
}
