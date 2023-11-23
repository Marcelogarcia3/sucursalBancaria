import java.util.Date;

class CuentaAhorro extends Cuenta {
	private double porcentajeReajusteAnual;

	public CuentaAhorro(int numeroCuenta, String fechaApertura, double saldo, Sucursal sucursal, double porcentajeReajusteAnual) {
		super(numeroCuenta, fechaApertura, saldo, sucursal);
		this.porcentajeReajusteAnual = porcentajeReajusteAnual;
	}

	public double getPorcentajeReajusteAnual() {
		return porcentajeReajusteAnual;
	}
}
