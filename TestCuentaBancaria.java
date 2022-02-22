public class TestCuentaBancaria{
    public static void main (String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("La cuenta ha sido creada exitosamente");

        // Realizando un depósito a la cuenta corriente
        cuenta1.depositar(20,"Cuenta Corriente");

        // Realizando un depósito a la cuenta de ahorros
        cuenta1.depositar(65,"Ahorros");

        // Realizando un retiro de la cuenta corriente
        cuenta1.retirar(10, "Cuenta Corriente");

        // Realizando un retiro de la cuenta de ahorros
        cuenta1.retirar(24 , "Ahorros");

        // Intentando realizar un retiro por un monto mayor al disponible en la cuenta corriente
        cuenta1.retirar (80, "Cuenta Corriente");

        // Intentando realizar un retiro por un monto mayor al disponible en la cuenta corriente
        cuenta1.retirar (100, "Cuenta Ahorros");

        // Revisando el saldo de la Cuenta Corriente
        cuenta1.verSaldo("Cuenta Corriente");

        // Revisando el saldo de la Cuenta Ahorros
        cuenta1.verSaldo("Ahorros");
    }
}