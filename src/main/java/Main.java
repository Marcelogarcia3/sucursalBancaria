import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionBanco gestionBanco = new GestionBanco();

        // Agregar sucursales
        Sucursal sucursal1 = new Sucursal("S001", "12345");
        Sucursal sucursal2 = new Sucursal("S002", "54321");
        gestionBanco.agregarSucursal(sucursal1);
        gestionBanco.agregarSucursal(sucursal2);

        // Agregar clientes
        Cliente cliente1 = new Cliente(1, "Juan Pérez");
        Cliente cliente2 = new Cliente(2, "María López");
        gestionBanco.agregarCliente(cliente1);
        gestionBanco.agregarCliente(cliente2);

        // Agregar cuentas bancarias
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(1001, "2021-01-01", 5000.0, sucursal1, 0.05);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(1002, "2022-05-10", 10000.0, sucursal2, 0.03);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(2001, "2020-11-15", 8000.0, sucursal1, 2000.0);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(2002, "2021-09-20", 15000.0, sucursal2, 3000.0);
        gestionBanco.agregarCuenta(cuentaAhorro1, cliente1);
        gestionBanco.agregarCuenta(cuentaAhorro2, cliente2);
        gestionBanco.agregarCuenta(cuentaCorriente1, cliente1);
        gestionBanco.agregarCuenta(cuentaCorriente2, cliente2);

        // Obtener todas las cuentas de un cliente
        List<Cuenta> cuentasCliente1 = gestionBanco.obtenerCuentasDeCliente(cliente1);
        System.out.println("Cuentas de " + cliente1.getNombre());
        for (Cuenta cuenta : cuentasCliente1) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        }

        // Obtener todas las cuentas de ahorro asociadas a una sucursal
        List<Cuenta> cuentasAhorroSucursal1 = gestionBanco.obtenerCuentasDeAhorroEnSucursal(sucursal1);
        System.out.println("Cuentas de ahorro en la sucursal " + sucursal1.getCodigoSucursal());
        for (Cuenta cuenta : cuentasAhorroSucursal1) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        }

        // Obtener todas las cuentas corrientes asociadas a una sucursal
        List<Cuenta> cuentasCorrientesSucursal2 = gestionBanco.obtenerCuentasCorrientesEnSucursal(sucursal2);
        System.out.println("Cuentas corrientes en la sucursal " + sucursal2.getCodigoSucursal());
        for (Cuenta cuenta : cuentasCorrientesSucursal2) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        }
    }
}