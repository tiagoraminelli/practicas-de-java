import java.util.Random;
public class numerosAleatorios {
    public static void main(String[] args) {
        //numeros aleatorios
        Random random = new Random();
        /*Generar un numero entero aleatorio entre 0 y 9*/
        var numeroEntre0y9 = random.nextInt(10);
        System.out.println("numeroEntre0y9 = " + numeroEntre0y9);
        /*Generar un numero aleatorio entre 1 y 10*/
        var numeroEntre1y10 = random.nextInt(10)+1;
        System.out.println("numeroEntre1y10 = " + numeroEntre1y10);

        /*generar un numero flotante entre 0.0 y 1.0*/
        var flotanteRandom = random.nextFloat(); //por default es asi
        System.out.println("flotanteRandom = " + flotanteRandom);
        
        /*simular un dado */
        var dado = random.nextInt(6)+1;//para q se incluya el 6
        System.out.println("dado = " + dado);
        

    }
}
