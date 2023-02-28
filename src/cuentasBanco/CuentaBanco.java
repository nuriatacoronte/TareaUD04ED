package cuentasBanco;
/**
 Clase cuentaBanco, se creará una cuenta bancaria preguntando datos del cliente
@author Nuria

*/

public class CuentaBanco {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Contructor vacío de la cuenta
     */
    public CuentaBanco()
    {
    }

    /**
     * Constructor que inicializa los parámetros de la clase
     * @param nom - Nombre del propietario de la cuenta bancaria
     * @param cue - Número de la cuenta bancaria
     * @param sal - Saldo de la cuenta bancaria
     * @param tipo - Tipo de interés bancario
     */
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Constructor que muestra el estado de la cuenta
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que inicializa la cantidad a ingresar en cuenta
     * @param cantidad - Cantidad en euros a ingresar o retirar de la cuenta
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que inicializa la cantidad a retirar de la cuenta
     * @param cantidad - Cantidad en euros a ingresar o retirar de la cuenta
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

 /**
  * Métodos setter and getter de la clase
  */
    
    
 /**
 * Método que devuelve el nombre
 * @return
 */
	private String getNombre() {
		return nombre;
	}
/**
 * Método que inicializa el nombre
 * @param nombre - Nombre propietario de la cuenta bancaria
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Método que devuelve número cuenta
 * @return
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Método que inicializa la cuenta
 * @param cuenta - Número de cuenta del cliente
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Método que devuelve el saldo de la cuenta
 * @return
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Método que inicializa el saldo de la cuenta
 * @param saldo - Saldo de la cuenta bancaria
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Método que devuelve el tipo de interés
 * @return
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * Método que inicializa el tipo de interés
 * @param tipoInterés - Tipo de interés bancario
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
