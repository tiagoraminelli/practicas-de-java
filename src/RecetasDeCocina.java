import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        /*Programa para hacer recetas de cocina
        * nombre de la receta
        * ingredientes
        * tiempo de preparacion (min)
        * dificultad ('facil,media, alta')*/
        var consola  = new Scanner(System.in);
        System.out.println("Recetas de cocina");
        System.out.println("nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.println("ingredientes de la receta: ");
        var ingredientes = consola.nextLine();
        System.out.println("tiempo en minutos de preparacion: ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.println("dificultad (facil,media,alta): ");
        var dificultad = consola.nextLine();

        System.out.println("\t--- Receta de cocina ---");
        System.out.println("\tNombre de la receta: "+ nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparacion: " + tiempo + " Min"); //se ajusto solo, %n se agrega un salto de linea
        System.out.println("\tDificultad: " + dificultad);
    }
}
