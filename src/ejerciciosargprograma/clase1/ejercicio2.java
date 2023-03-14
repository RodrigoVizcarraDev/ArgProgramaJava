package ejerciciosargprograma.clase1;

import javax.swing.JOptionPane;
public class ejercicio2 {
    public static void main(String[] args) {
        /*
    Las variables base son:
    ingresosMensualesLimite = 489.083
    vehiculosLimite = 3
    inmueblesLimites = 3
         */
        float ingresosMensualesLimite = 489.083F;
        int vehiculosLimite = 3;
        int inmueblesLimites = 3;

        String ingresosMensuales = JOptionPane.showInputDialog("Ingrese sus ingresos mensuales");
        float ingresosMensualesFloat = Float.parseFloat(ingresosMensuales);

        String cantidadVehiculos = JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos que tiene");
        int cantidadVehiculosInt = Integer.parseInt(cantidadVehiculos);

        String inmuebles = JOptionPane.showInputDialog("Ingrese la cantidad de inmuebles que tiene");
        int inmueblesInt = Integer.parseInt(inmuebles);

        if (ingresosMensualesFloat >= ingresosMensualesLimite
                && cantidadVehiculosInt >= vehiculosLimite
                && inmueblesInt >= inmueblesLimites) {
            System.out.println("Usted pertenece al segmento de ingresos Altos");
        } else {
            System.out.println("Usted no pertenece al segmente de ingresos altos");
        }
    }
}
