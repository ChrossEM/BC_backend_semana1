import java.util.Date;

public class Libro extends Producto implements ILibro{
    protected Date FechaPublicacion;
    protected String Autor;
    protected String Titulo;
    protected String Editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        FechaPublicacion = fechaPublicacion;
        Autor = autor;
        Titulo = titulo;
        Editorial = editorial;
    }

    @Override
    public Date getFechaDePublicacion(Date fechaPublicacion) {
        return fechaPublicacion;
    }

    @Override
    public String getAutor(String autor) {
        return null;
    }

    @Override
    public String getTitulo(String titulo) {
        return null;
    }

    @Override
    public String getEditorial(String editorial) {
        return null;
    }

    @Override
    public double getPrecioVenta(double precioVenta) {
        return 0;
    }

    @Override
    public int getPrecio(int precioVenta) {
        return 0;
    }
}
