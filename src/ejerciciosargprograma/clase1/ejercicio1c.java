package ejerciciosargprograma.clase1;
import javax.swing.JOptionPane;


public class ejercicio1c {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroInicio = 5;
        int numeroFin = 14;
        int rango = 5;
        String parImpar = JOptionPane.showInputDialog("Presione 'p' para mostrar los numeros pares o 'i' para mostrar los impares");
        while (rango >= numeroInicio && rango <= numeroFin){
            
            if(parImpar.equals("p")){
                if(rango % 2 == 0){
                    System.out.println("Los numeros pares son: " + rango);
                }
            } else if (parImpar.equals("i")){
                if(rango % 2 != 0){
                    System.out.println("Los numeros impares son: " + rango);
                }
            }
            
            rango++;
        }
    }
}
