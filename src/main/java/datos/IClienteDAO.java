package datos;

import zona_fit_dominio.Cliente;
import java.util.List;

public interface IClienteDAO {
    List<Cliente> listarCliente();
    boolean buscarClientePorId(Cliente cliente);
    boolean agregarCliente(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    boolean eliminarCliente(Cliente cliente);
}
