


public class CajeroAutomatico {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("123456789", "John Doe");
        CuentaBancaria cuenta1Cliente1 = new CuentaBancaria("001", 1000);
        cliente1.agregarCuenta(cuenta1Cliente1);

        Cliente cliente2 = new Cliente("987654321", "Jane Smith");
        CuentaBancaria cuenta1Cliente2 = new CuentaBancaria("002", 2000);
        cliente2.agregarCuenta(cuenta1Cliente2);

      
        Cajero cajero = new Cajero("CAJ001");

  
        cajero.agregarCliente(cliente1);
        cajero.agregarCliente(cliente2);

        cajero.retirar("123456789", "001", 500);
        cajero.depositar("987654321", "002", 1000);
        cajero.transferir("123456789", "001", "987654321", "002", 200);

     
        cajero.imprimirSaldo("123456789", "001");
        cajero.imprimirSaldo("987654321", "002");
    }
}