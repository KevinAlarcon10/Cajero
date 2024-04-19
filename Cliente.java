import java.util.ArrayList;

import java.util.List;


class Cliente {
    private String id;
    private String nombre;
    private List<CuentaBancaria> cuentas;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void retirar(String numeroCuenta, double monto) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumero().equals(numeroCuenta)) {
                cuenta.retirar(monto);
                return;
            }
        }
        System.out.println("La cuenta especificada no pertenece a este cliente.");
    }

    public void depositar(String numeroCuenta, double monto) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumero().equals(numeroCuenta)) {
                cuenta.depositar(monto);
                return;
            }
        }
        System.out.println("La cuenta especificada no pertenece a este cliente.");
    }

    public void transferir(String numeroCuentaOrigen, Cliente destinatario, String numeroCuentaDestino, double monto) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumero().equals(numeroCuentaOrigen)) {
                cuenta.retirar(monto);
                destinatario.depositar(numeroCuentaDestino, monto);
                return;
            }
        }
        System.out.println("La cuenta especificada no pertenece a este cliente.");
    }

    public void imprimirSaldo(String numeroCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumero().equals(numeroCuenta)) {
                System.out.println("Saldo de la cuenta " + numeroCuenta + ": " + cuenta.getSaldo());
                return;
            }
        }
        System.out.println("La cuenta especificada no pertenece a este cliente.");
    }
}
