package ejerciciosargprograma.clase1;
import javax.swing.JOptionPane;

class ejercicio1d {
    public static void main(String[] args) {
        // TODO code application logic here

        int numeroInicio = 5;
        int numeroFin = 14;
        String parImpar = JOptionPane.showInputDialog("Presione 'p' para mostrar los numeros pares o 'i' para mostrar los impares");
        for (int i = numeroFin; i >= numeroInicio; i--) {
            

            if (parImpar.equals("p")) {
                if (i % 2 == 0) {
                    System.out.println("Los numeros pares son: " + i);
                }
            } else if (parImpar.equals("i")) {
                if (i % 2 != 0) {
                    System.out.println("Los numeros impares son: " + i);
                }
            }
        }

    }
}
