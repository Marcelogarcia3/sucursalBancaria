abstract class Cuenta {
	private int numeroCuenta;
	private String fechaApertura;
	private double saldo;
	private Sucursal sucursal;

	public Cuenta(int numeroCuenta, String fechaApertura, double saldo, Sucursal sucursal) {
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
		this.sucursal = sucursal;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}
}
