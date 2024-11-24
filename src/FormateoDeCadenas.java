public class FormateoDeCadenas {
    public static void main(String[] args) {
        System.out.println("---formateo de cadenas---");
        var cadena = "matias";
        var edad = 24;
        var salario = 25577.1;
        
        //string.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f",cadena,edad,salario); //se reemplaza el $s por la cadena, %d se sustituye por un tipo entero, $f se reemplaza por tipo float
        System.out.println(mensaje);
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n",cadena,edad,salario);
        var numeroEmpleado = 12;
        mensaje = """
                %nDetalle de la persona:\s
                --------------------------
                \tNombre: %s
                \tEdad: %d años
                \tSalario: $%.2f
                \tNumEmpl: %04d 
                
                """.formatted(cadena,edad,salario,numeroEmpleado);
        //%04d se rellenan con 0 hacia la izq si no llega a 4 digitos
        System.out.println(mensaje);
        //formateo con textlog y printf directamente
        System.out.printf("""
                %nDetalle de la persona:\s
                --------------------------
                \tNombre: %s
                \tEdad: %d años
                \tSalario: $%.2f
                \tNumEmpl: %04d 
                
                """,cadena,edad,salario,numeroEmpleado);
    }
}
