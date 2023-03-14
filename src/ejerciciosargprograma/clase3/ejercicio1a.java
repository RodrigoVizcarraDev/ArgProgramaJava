package ejerciciosargprograma.clase3;

public class ejercicio1a {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*a. 
        Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        el String
        */

        String palabra = "Hola a todos, solo soy un objeto intanciado de la clase String, adios.";
        char letra = 'a';
        int contadorRepeticionLetra = 0;
        System.out.println("El String a evaluar es el siguiente:");
        System.out.println(palabra);
        for(int i = 0; i < palabra.length(); i++){

            if(palabra.charAt(i) == letra){
                contadorRepeticionLetra++;
            }
        }

        System.out.println("La cantidad de veces que \"" + letra + "\" aparece en el String es: " + contadorRepeticionLetra);
    }
}
