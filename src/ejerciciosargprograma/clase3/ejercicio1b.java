package ejerciciosargprograma.clase3;

public class ejercicio1b {
    public static void main(String[] args) {
        /*
         * Utilizando solo tipos primitivos, String (solo usar método length), vectores,
         * iteraciones simples y condicionales, genere una clase por ejercicio que posea
         * los
         * siguientes métodos:
         * Dados 3 números y un orden (ascendente o decreciente) que ordene los
         * mismos y los retorne en un vector de 3
         * 
         */
        int[] numeros = {2, 12, 7};

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > numeros[i+1] && numeros[i] > numeros[i+2]){
                System.out.println("El numero " + numeros[i] + " es el mayor");
                break;
            } else if(numeros[i+1] > numeros[i+2]){
                System.out.println("El numero " + numeros[i+1] + " es el mayor");
                break;
            } else {
                System.out.println("El numero " + numeros[i+2] + " es el mayor");
                break;
            }
        }
    }
}
