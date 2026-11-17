package sync;
public class Cliente extends Thread {

    private CuentaBancaria cuenta;
    private int cantidad;

    public Cliente(String nombre, CuentaBancaria cuenta, int cantidad) {
        super(nombre);
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        cuenta.retirar(cantidad);
    }
}