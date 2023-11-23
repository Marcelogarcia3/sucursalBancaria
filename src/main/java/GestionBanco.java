import java.util.ArrayList;
import java.util.List;
public class GestionBanco {
	private List<Cliente> clientes;
	private List<Cuenta> cuentas;
	private List<Sucursal> sucursales;

	public GestionBanco() {
		clientes = new ArrayList<>();
		cuentas = new ArrayList<>();
		sucursales = new ArrayList<>();
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void agregarCuenta(Cuenta cuenta, Cliente cliente) {
		cuentas.add(cuenta);
		cliente.agregarCuenta(cuenta);
	}

	public void agregarSucursal(Sucursal sucursal) {
		sucursales.add(sucursal);
	}

	public List<Cuenta> obtenerCuentasDeCliente(Cliente cliente) {
		return cliente.getCuentas();
	}

	public List<Cuenta> obtenerCuentasDeAhorroEnSucursal(Sucursal sucursal) {
		List<Cuenta> cuentasDeAhorro = new ArrayList<>();
		for (Cuenta cuenta : cuentas) {
			if (cuenta instanceof CuentaAhorro && cuenta.getSucursal().equals(sucursal)) {
				cuentasDeAhorro.add(cuenta);
			}
		}
		return cuentasDeAhorro;
	}

	public List<Cuenta> obtenerCuentasCorrientesEnSucursal(Sucursal sucursal) {
		List<Cuenta> cuentasCorrientes = new ArrayList<>();
		for (Cuenta cuenta : cuentas) {
			if (cuenta instanceof CuentaCorriente && cuenta.getSucursal().equals(sucursal)) {
				cuentasCorrientes.add(cuenta);
			}
		}
		return cuentasCorrientes;
	}
}