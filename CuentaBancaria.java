
class CuentaBancaria {
    private String numero;
    private double saldo;

    public CuentaBancaria(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiró $" + monto + " de la cuenta " + numero);
        } else {
            System.out.println("Saldo insuficiente en la cuenta " + numero);
        }
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositó $" + monto + " en la cuenta " + numero);
    }
}