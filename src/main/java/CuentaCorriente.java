import java.util.Date;
class CuentaCorriente extends Cuenta {
	private double lineaSobregiro;

	public CuentaCorriente(int numeroCuenta, String fechaApertura, double saldo, Sucursal sucursal, double lineaSobregiro) {
		super(numeroCuenta, fechaApertura, saldo, sucursal);
		this.lineaSobregiro = lineaSobregiro;
	}

	public double getLineaSobregiro() {
		return lineaSobregiro;
	}
}
