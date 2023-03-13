package ejerciciosargprograma.clase1;
public class ejercicio1b {

   /*
    a)
    
    Utilizando un bucle While, imprima todos los numeros entre 2 variables
    "a" y "b". Su codigo puede arrancar 
    int numeroInicio = 5;
    int numeroFin = 14;
    Se deberian mostrar los numeros:
    5,6,7,8,9,10,11,12,13,14
    
    b) A lo anterior, solo muestre los numeros pares
    
    c) A lo anterior, con una variable extra, elija si se deben mostarar los
    numeros pares o impares
    
    d) Utilizando la sentencia for, hacer lo mismo que en b) pero invirtiendo
    el orden.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroInicio = 5;
        int numeroFin = 14;
        int rango = 5;
        while (rango >= numeroInicio && rango <= numeroFin){
            
            if(rango % 2 == 0){
                System.out.println("Los numeros pares son: " + rango);
            }
            rango++;
        }
    }
    
}