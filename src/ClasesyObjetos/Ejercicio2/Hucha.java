package ClasesyObjetos.Ejercicio2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hucha {
    Map<String, Integer> monedasBilletes;
    boolean estaAbierta;
    private String contrasena;

    public Hucha() {
        this.monedasBilletes = new HashMap<>();
        inicializarHucha();
    }

    public Hucha(Map<String, Integer> monedasBilletes) {
        this.monedasBilletes = new HashMap<>();
        inicializarHucha();
        agregarDinero(monedasBilletes);
    }

    public Hucha(double cantidadInicial) {
        this.monedasBilletes = new HashMap<>();
        inicializarHucha();
        desglosarDinero(cantidadInicial);
    }

    public void abrirHucha(String contrasena) {
        if (this.contrasena.equals(contrasena)) {
            estaAbierta = true;
            System.out.println("Hucha abierta.");
        } else {
            System.out.println("Contraseña incorrecta. Hucha cerrada.");
        }
    }

    public void cerrarHucha() {
        estaAbierta = false;
        System.out.println("Hucha cerrada.");
    }

    public void cambiarContrasena(String nuevaContrasena) {
        contrasena = nuevaContrasena;
        System.out.println("Contraseña cambiada con éxito.");
    }

    public void mostrarInformacion() {
        if (estaAbierta) {
            System.out.println("Información de la hucha:");
            for (Map.Entry<String, Integer> entry : monedasBilletes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Valor total: " + calcularValorTotal() + " euros");
        } else {
            System.out.println("La hucha está cerrada. Abre la hucha para ver la información.");
        }
    }

    public void retirarDinero(String tipo, int cantidad) {
        if (estaAbierta) {
            int cantidadDisponible = monedasBilletes.getOrDefault(tipo, 0);
            int cantidadRetirada = Math.min(cantidad, cantidadDisponible);
            monedasBilletes.put(tipo, cantidadDisponible - cantidadRetirada);
            System.out.println("Se retiraron " + cantidadRetirada + " " + tipo + "(s) correctamente.");
        } else {
            System.out.println("La hucha está cerrada. Abre la hucha para realizar retiros.");
        }
    }

    private void inicializarHucha() {
        monedasBilletes.put("1 euro", 0);
        monedasBilletes.put("2 euros", 0);
        monedasBilletes.put("5 euros", 0);
        monedasBilletes.put("10 euros", 0);
        monedasBilletes.put("20 euros", 0);
        monedasBilletes.put("50 euros", 0);
        estaAbierta = false;
        contrasena = "1234";
    }

    private void agregarDinero(Map<String, Integer> dinero) {
        for (Map.Entry<String, Integer> entry : dinero.entrySet()) {
            String tipo = entry.getKey();
            int cantidad = entry.getValue();
            monedasBilletes.put(tipo, monedasBilletes.getOrDefault(tipo, 0) + cantidad);
        }
    }

    private void desglosarDinero(double cantidad) {
        if (estaAbierta) {
            List<String> denominacionesOrdenadas = Arrays.asList("50 euros", "20 euros", "10 euros", "5 euros", "2 euros", "1 euro");

            for (String denominacion : denominacionesOrdenadas) {
                double valorDenominacion = Double.parseDouble(denominacion.split(" ")[0]);

                int cantidadNecesaria = (int) (cantidad / valorDenominacion);
                monedasBilletes.put(denominacion, cantidadNecesaria);

                cantidad -= cantidadNecesaria * valorDenominacion;
            }

            System.out.println("Desglose de " + calcularValorTotal() + " euros realizado correctamente.");
            mostrarInformacion();
        } else {
            System.out.println("La hucha está cerrada. Abre la hucha para realizar desgloses.");
        }    }

    private double calcularValorTotal() {
        double valorTotal = 0;
        for (Map.Entry<String, Integer> entry : monedasBilletes.entrySet()) {
            String tipo = entry.getKey();
            int cantidad = entry.getValue();
            double valor = Double.parseDouble(tipo.split(" ")[0]) * cantidad;
            valorTotal += valor;
        }
        return valorTotal;
    }
}

