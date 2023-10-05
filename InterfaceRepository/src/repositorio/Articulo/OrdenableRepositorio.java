package repositorio.Articulo;

import modelo.Articulo;
import modelo.Direccion;

import java.util.List;

public interface OrdenableRepositorio {
    List<Articulo> listar(String campo, Direccion dir);
}
