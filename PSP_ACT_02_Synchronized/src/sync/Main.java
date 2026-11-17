package sync;
public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1000);

        Cliente cliente1 = new Cliente("Hilo 1", cuenta, 300);
        Cliente cliente2 = new Cliente("Hilo 2", cuenta, 400);
        Cliente cliente3 = new Cliente("Hilo 3", cuenta, 500);
        Cliente cliente4 = new Cliente("Hilo 4", cuenta, 200);
        Cliente cliente5 = new Cliente("Hilo 5", cuenta, 250);

        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

        try {
           	// join() bloquea el hilo principal hasta que el hilo especificado 
        	// termine su ejecución, de esta manera, el hilo principal esperará 
        	// a que todos los hilos de los clientes terminen antes de continuar.
            cliente1.join();
            cliente2.join();
            cliente3.join();
            cliente4.join();
            cliente5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------");
        System.out.println("Saldo final: " + cuenta.getSaldo() + " €");
    }
}