package repositorio.Articulo;

import modelo.Articulo;
import modelo.Articulo;
import modelo.Direccion;

import java.util.List;

public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
        PaginableRepositorio, CrudRepositorio, ContableRepositorio {
    List<Articulo> listar();

    List<Articulo> listar(String campo, Direccion dir);
}
