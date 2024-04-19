
import java.util.HashMap;

import java.util.Map;
class Cajero {
    private String id;
    private Map<String, Cliente> clientes;

    public Cajero(String id) {
        this.id = id;
        this.clientes = new HashMap<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    public void retirar(String idCliente, String numeroCuenta, double monto) {
        Cliente cliente = clientes.get(idCliente);
        if (cliente != null) {
            cliente.retirar(numeroCuenta, monto);
        }
    }

    public void depositar(String idCliente, String numeroCuenta, double monto) {
        Cliente cliente = clientes.get(idCliente);
        if (cliente != null) {
            cliente.depositar(numeroCuenta, monto);
        }
    }

    public void transferir(String idClienteOrigen, String numeroCuentaOrigen, String idClienteDestino, String numeroCuentaDestino, double monto) {
        Cliente clienteOrigen = clientes.get(idClienteOrigen);
        Cliente clienteDestino = clientes.get(idClienteDestino);
        if (clienteOrigen != null && clienteDestino != null) {
            clienteOrigen.transferir(numeroCuentaOrigen, clienteDestino, numeroCuentaDestino, monto);
        }
    }

    public void imprimirSaldo(String idCliente, String numeroCuenta) {
        Cliente cliente = clientes.get(idCliente);
        if (cliente != null) {
            cliente.imprimirSaldo(numeroCuenta);
        }
    }
}
