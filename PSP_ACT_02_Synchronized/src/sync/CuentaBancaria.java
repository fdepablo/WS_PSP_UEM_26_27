package sync;
public class CuentaBancaria {

    private int saldo;

    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    //public synchronized void retirar(int cantidad) {
    public void retirar(int cantidad) {

        System.out.println(
                Thread.currentThread().getName()
                + " intenta retirar " + cantidad
                + " €. Saldo actual: " + saldo + " €"
        );

        if (saldo >= cantidad) {

            try {
                // Para facilitar que aparezca la condición de carrera
            	// simulamos un pequeño retardo
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            saldo = saldo - cantidad;

            System.out.println(
                    Thread.currentThread().getName()
                    + " ha retirado " + cantidad
                    + " €. Saldo restante: " + saldo + " €"
            );

        } else {
            System.out.println(
                    Thread.currentThread().getName()
                    + " no puede retirar " + cantidad
                    + " €. Saldo insuficiente."
            );
        }
    }
}