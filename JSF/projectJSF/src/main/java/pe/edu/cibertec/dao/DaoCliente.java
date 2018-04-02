package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.Cliente;

public interface DaoCliente {

    public List<Cliente> listarCliente();

    
    public String eliminarCliente(int id);

    public Cliente obtenerCliente(Integer idCliente);

    public String insertarCliente(Cliente cliente);

    public String modificarCliente(Cliente cliente);

}



