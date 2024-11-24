import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //leer los datos
        //un tipo int
        var consola  = new Scanner(System.in);

        //el metodo nexline() SIEMPRE DEVUELVE UN TIPO STRING""""""""""""""""""""""""""
        //System.out.println("ingresa tu edad: ");
        //var edad = consola.nextInt();
        //System.out.println("edad = " + edad);
        
        //leer tipo double
        //System.out.println("ingresa tu altura: ");
        //var altura = consola.nextDouble();
        //System.out.println("altura = " + altura);

        //conversion de datos
        //System.out.println("proporciona un valor entero: ");
        //var EnteroString = consola.nextLine();
        //var entero =  Integer.parseInt(EnteroString); //se asigna la cadena para convertirlo en entero
        //System.out.println("entero = " + entero);

        System.out.println("proporciona un valor flotante: ");
        var flotante =  Float.parseFloat(consola.nextLine()); //se asigna la cadena para convertirlo en entero
        System.out.println("flotante = " + flotante);

        //realizar el llamado por consola
        //hacer la conversion
        // en ese orden



        
        
    }
}
