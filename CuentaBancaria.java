public class CuentaBancaria{
    private double saldoCuentaCorriente;
    private double saldoAhorros;
    public static int numCuentas = 0;
    public static double total = 0;

    public CuentaBancaria (){
        this.saldoCuentaCorriente = 0.0;
        this.saldoAhorros = 0.0;
        numCuentas++;
    }

    public double getSaldoCuentaCorriente(){
        return this.saldoCuentaCorriente;
    }

    public double getsaldoAhorros(){
        return this.saldoAhorros;
    }
    
    public void depositar(double monto, String nombreCuenta){
        if (nombreCuenta.equals("Cuenta Corriente")){
            saldoCuentaCorriente += monto;
            total += monto;
        } else if (nombreCuenta.equals("Ahorros")){
            saldoAhorros += monto;
            total += monto;
        } else{
            System.out.println("Ingrese un nombre de cuenta válido.");
        }
        String mensaje = "Se ha depositado " + monto + " dólares a cuenta de tipo: " + nombreCuenta;
        System.out.println(mensaje);
        System.out.println("El nuevo monto total es: " + total + "dólares.");
    }

    public String retirar(double monto, String nombreCuenta){
        if (nombreCuenta.equals("Cuenta Corriente") && (saldoCuentaCorriente>monto)){
            saldoCuentaCorriente -= monto;
            total -= monto;
        } else if (nombreCuenta.equals("Ahorros") && (saldoAhorros>monto)){
            saldoAhorros -= monto;
            total -= monto;
        } else if ((saldoCuentaCorriente<monto) || (saldoAhorros<monto)) {
            System.out.println("Saldo insuficiente.");
            return "Saldo insuficiente.";
        } else {
            System.out.println("Ingrese un nombre de cuenta válido.");
            return "Ingrese un nombre de cuenta válido.";
        }
        String mensaje = "Se ha retirado " + monto + " dólares de la cuenta de tipo: " + nombreCuenta;
        System.out.println(mensaje);
        System.out.println("El nuevo monto total es: " + total + " dólares.");
        return mensaje;
    }

    public void verSaldo (String nombreCuenta){
        if (nombreCuenta.equals("Cuenta Corriente")){
            String mensaje = " El saldo de la cuenta de tipo: " + nombreCuenta + " es de $" + saldoCuentaCorriente;
            System.out.println (mensaje);
        } else if (nombreCuenta.equals("Ahorros")){
            String mensaje = " El saldo de la cuenta de tipo: " + nombreCuenta + " es de $" + saldoAhorros;
            System.out.println (mensaje);
        } else{
            System.out.println("Ingrese un nombre de cuenta válido.");
        }
    }
}