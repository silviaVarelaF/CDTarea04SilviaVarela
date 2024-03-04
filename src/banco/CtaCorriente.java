package banco;

public class CtaCorriente {

    /**
     * @return the saldocuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * @param saldocuenta the saldocuenta to set
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    public double interes;

    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    public double saldocuenta()
    {
        return getSaldocuenta();
    }
    
    private static final String ERROR_CANTIDAD_NEGATIVA = "No se puede ingresar una cantidad negativa";
    private static final String ERROR_CANTIDAD_RETIRADA_NEGATIVA = "No se puede retirar una cantidad negativa";
    private static final String ERROR_SALDO_INSUFICIENTE = "No se hay suficiente saldo";

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception(ERROR_CANTIDAD_NEGATIVA);
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception(ERROR_CANTIDAD_RETIRADA_NEGATIVA);
        if (getSaldocuenta() < cantidad)
            throw new Exception(ERROR_SALDO_INSUFICIENTE);
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
}