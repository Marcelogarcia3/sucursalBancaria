import java.util.ArrayList;
import java.util.List;
class Cliente {
	private int idCliente;
	private String nombre;
	private List<Cuenta> cuentas;

	public Cliente(int idCliente, String nombre) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		cuentas = new ArrayList<>();
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
}