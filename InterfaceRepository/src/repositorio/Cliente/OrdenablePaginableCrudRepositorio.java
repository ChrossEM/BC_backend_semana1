package repositorio.Cliente;

import modelo.Cliente;
import modelo.Direccion;

import java.util.List;

public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
        PaginableRepositorio, CrudRepositorio, ContableRepositorio {
    List<Cliente> listar();

    List<Cliente> listar(String campo, Direccion dir);
}
