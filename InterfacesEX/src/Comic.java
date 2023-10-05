import java.util.Date;

public class Comic extends Libro implements ILibro{
    protected String Personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        Personaje = personaje;

    }

    @Override
    public Date getFechaDePublicacion(Date fechaPublicacion) {
        return super.getFechaDePublicacion(fechaPublicacion);
    }

    @Override
    public String getAutor(String autor) {
        return super.getAutor(autor);
    }

    @Override
    public String getTitulo(String titulo) {
        return super.getTitulo(titulo);
    }

    @Override
    public String getEditorial(String editorial) {
        return super.getEditorial(editorial);
    }

    @Override
    public double getPrecioVenta(double precioVenta) {
        return super.getPrecioVenta(precioVenta);
    }

    @Override
    public int getPrecio(int precioVenta) {
        return super.getPrecio(precioVenta);
    }
}
