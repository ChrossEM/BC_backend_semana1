abstract public class Electronico extends Producto implements IElectronico{
    protected String Fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        Fabricante = fabricante;
    }

    @Override
    public String getFabricante(String fabricante) {
        return fabricante;
    }

    @Override
    public double getPrecioVenta(double precioVenta) {
        return precioVenta;
    }

    @Override
    public int getPrecio(int precioVenta) {
        return precioVenta;
    }
}
