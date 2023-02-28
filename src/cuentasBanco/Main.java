package cuentasBanco;
/**
 * Implementa el inicio del programa. Llama al método de operaciones con la cuenta bancaria.
 * @author Nuria
 * 
 */

public class Main {

    public static void main(String[] args) {
        CuentaBanco cuentaPersonal;
        double saldoActual;
	  float cantidad=0.0f;
        operativaCuenta(cantidad);
    }
    
/**
 * Método - Operaciones con la cuenta bancaria - retiradas o ingresos de dinero
 * Utiliza accesos a la clase CuentaBanco
 * @param cuentaPersonal - de tipo CuentaBanco
 * @param saldoActual - Inicializa al saldo de la cuenta
 * @param cantidad - Cantidad a ingresar o retirar de la cuenta
 */
	private static void operativaCuenta(float cantidad) {
	//Método que opera con la cuenta de un cliente del Banco
		CuentaBanco cuentaPersonal;
		double saldoActual;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
