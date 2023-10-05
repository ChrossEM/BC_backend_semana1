package repositorio.Articulo;

import modelo.Articulo;
import modelo.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ArticuloListRepositorio implements OrdenablePaginableCrudRepositorio{
    private List<Articulo> dataSource;
    public ArticuloListRepositorio() {this.dataSource = new ArrayList<>();}

    @Override
    public List<Articulo> listar() {
        return dataSource;
    }

    @Override
    public Articulo porId(Integer id) {
        Articulo resultado = null;
        for (Articulo cli:dataSource
        ) { if (cli.getId() != null && cli.getId().equals(id)){
            resultado = cli;
            break;
        }

        }
        return resultado;
    }

    @Override
    public void crear(Articulo articulo) {
        this.dataSource.add(articulo);
    }

    @Override
    public void editar(Articulo articulo) {
        Articulo c = this.porId(articulo.getId());
        c.setNombre(articulo.getNombre());
        c.setFabricante(articulo.getFabricante());
    }

    @Override
    public void eliminar(int id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Articulo> listar(String campo, Direccion dir) {
        List<Articulo> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            } else if(dir == Direccion.DESC){
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Articulo> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    public static int ordenar(String campo, Articulo a,Articulo b){
        int resultado =0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case  "fabricante"->
                    resultado = a.getFabricante().compareTo(b.getNombre());

        }
        return resultado;
    }
    @Override
    public int total() {
        return this.dataSource.size();
    }

}
