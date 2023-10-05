package modelo;

import java.util.Objects;

public class Cliente {
    private  Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;
    public  Cliente(){
        this.id = ++ultimoId;
    }
    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(getId(), cliente.getId()) && Objects.equals(getNombre(), cliente.getNombre()) && Objects.equals(getApellido(), cliente.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void setUltimoId(int ultimoId) {
        Cliente.ultimoId = ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public static int getUltimoId() {
        return ultimoId;
    }
}
