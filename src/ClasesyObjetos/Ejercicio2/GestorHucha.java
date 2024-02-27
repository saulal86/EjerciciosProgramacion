package ClasesyObjetos.Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class GestorHucha {

    public static void retirarCantidadEuros(Hucha hucha, double cantidad) {
        if (hucha.estaAbierta) {
            List<String> denominacionesOrdenadas = Arrays.asList("50 euros", "20 euros", "10 euros", "5 euros", "2 euros", "1 euro");

            for (String denominacion : denominacionesOrdenadas) {
                int cantidadDisponible = hucha.monedasBilletes.get(denominacion);
                double valorDenominacion = Double.parseDouble(denominacion.split(" ")[0]);

                int cantidadNecesaria = (int) (cantidad / valorDenominacion);
                int cantidadRetirada = Math.min(cantidadNecesaria, cantidadDisponible);

                hucha.monedasBilletes.put(denominacion, cantidadDisponible - cantidadRetirada);

                cantidad -= cantidadRetirada * valorDenominacion;
            }

            System.out.println("Retiro de " + cantidad + " euros realizado correctamente.");
            hucha.mostrarInformacion();
        } else {
            System.out.println("La hucha está cerrada. Abre la hucha para realizar retiros.");
        }
    }

    public static void main(String[] args) {
        Hucha hucha = new Hucha();
        hucha.abrirHucha("1234");
        retirarCantidadEuros(hucha, 25.5);
        hucha.cerrarHucha();
    }
}

