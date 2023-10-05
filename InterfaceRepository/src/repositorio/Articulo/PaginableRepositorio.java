package repositorio.Articulo;


import modelo.Articulo;

import java.util.List;

public interface PaginableRepositorio {
    List<Articulo> listar(int desde, int hasta);
}
