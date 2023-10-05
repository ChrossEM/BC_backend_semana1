public class Iphone extends Electronico {
    private String Modelo;
    private String Color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        Modelo = modelo;
        Color = color;
    }

    @Override
    public String getFabricante(String fabricante) {
        return super.getFabricante(fabricante);
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
