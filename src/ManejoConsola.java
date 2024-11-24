import java.util.Scanner; //se agrega de manera automatica

public class ManejoConsola {
    public static void main(String[] args) {
        //introducir datos por consola
        var consola = new Scanner(System.in); //in de INPUT
        System.out.println("escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
