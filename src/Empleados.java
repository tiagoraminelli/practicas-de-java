import java.util.Scanner;

public class Empleados {
    public static void main(String[] args) {
        //nombre del empleado
        //edad (int)
        //salario (double)
        //es jefe de departamento (?) (bolean)
        var consola  = new Scanner(System.in);
        System.out.println("ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("ingresa tu salario: ");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.println("eres jefe de departamento?(true/false) ");
        var estatus = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\tDatos del empleado: ");
        System.out.println("\tnombre: "+ nombre);
        System.out.println("\tEdad: "+ edad + " años");
        System.out.printf("\tSalario: $%.2f%n", salario); //se ajusto solo, %n se agrega un salto de linea
        System.out.println("\tJefe: " + estatus);

    }
}
