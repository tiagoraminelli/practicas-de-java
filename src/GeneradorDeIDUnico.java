import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class GeneradorDeIDUnico {
    public static void main(String[] args) {
        //Generador de id unico
        //el programa debe solicitar con consola
        //nombre, de deben tomar los 2 primeros digitos en MAY
        //apellido, de deben tomar los 2 primeros digitos en MAY
        //año de nacimiento, se toman los 2 ultimos digitos
        //el programa debe generar un numero aleatorio de 1 a 9999. si el numero generado es menor a 4 digitos se debe completar con 0 a la izquierda
        //ejemplo de como debe quedar
        // nombre = Juan -> JU apellido = Perez -> PE año =1995 -> 95 NumeroAleatorio = 1233
        // ID GENERADO = JUPE951233
        //var root = "root";
        System.out.println("---ID GENERATOR%n");
        var consola = new Scanner(System.in);
        var random = new Random();
        var numeroGenerado = random.nextInt(1,9999);
        var numeroRoot = 1;
        System.out.println("numeroGenerado = " + numeroGenerado);

        var numeroDepurado = String.format("%04d",numeroGenerado);

        
        System.out.println("Cual es tu nombre?");
        var nombre = consola.nextLine();
        var primeroCaracteresNombre = nombre.trim().substring(0,2).toUpperCase();
        System.out.println("Cual es tu apellido?");
        var apellido = consola.nextLine();
        var primeroCaracteresApellido = apellido.trim().substring(0,2).toUpperCase();
        System.out.println("Cual es tu año de nacimiento?");
        var año = consola.nextLine();
        var añoPartido = año.substring(2,4);
        //System.out.println("nombre = " + nombre);
        //System.out.println("apellido = " + apellido);
        //System.out.println("año = " + año);
        //System.out.println("primeroCaracteresNombre = " + primeroCaracteresNombre);
        //System.out.println("primeroCaracteresApellido = " + primeroCaracteresApellido);
        //System.out.println("añoPartido = " + añoPartido);
        //System.out.println("numeroDepurado = " + numeroGenerado);
        var IdGenerado = (primeroCaracteresNombre+primeroCaracteresApellido+añoPartido+numeroDepurado);
        System.out.println("Felicidades, el IdGenerado es = " + IdGenerado);
    }




}
