package ExpresionesRegulares.Ejercicio3;

public class Compra {
    private String mueble;
    private int cantidad;
    private float precio;

    public Compra(String mueble, int cantidad, float precio) {
        this.mueble = mueble;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getMueble() {
        return mueble;
    }

    public void setMueble(String mueble) {
        this.mueble = mueble;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Compra{" +
                "mueble='" + mueble + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
