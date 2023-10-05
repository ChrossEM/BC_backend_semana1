package modelo;

import java.util.Objects;

public class Articulo {

    private  Integer id;
    private String nombre;
    private String fabricante;
    private static int ultimoId;
    public  Articulo(){
        this.id = ++ultimoId;
    }
    public Articulo(Integer id, String nombre, String fabricante) {
        this();
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Articulo.ultimoId = ultimoId;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articulo articulo)) return false;
        return Objects.equals(getId(), articulo.getId()) && Objects.equals(getNombre(), articulo.getNombre()) && Objects.equals(getFabricante(), articulo.getFabricante());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getFabricante());
    }
}
