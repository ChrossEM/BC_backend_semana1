public class TvLcd extends Electronico {
    protected int Pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        Pulgada = pulgada;
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
