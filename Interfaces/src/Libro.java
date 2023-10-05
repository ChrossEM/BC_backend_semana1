import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    protected List<Imprimible> paginas;
    private  Persona autor;
    private  String titulo;
    private  Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public  Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder( "Titulo: ").append(titulo);
        sb.append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Imprimible pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }

}
