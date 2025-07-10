package mx.com.santander.hexagonalmodularmaven.ventas.model.entity;
import java.time.LocalDateTime;
import java.util.List;

import lombok.NoArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.VentaCreateCommand;

@NoArgsConstructor
public class Venta {
    private VentaID idVenta;
    private VentaIdCliente idCliente;
    private CantidadProductos cantidadProductos;
    private ProductosComprados productosComprados;
    private PrecioTotal precioTotal;
    private FechaCompra fechaCompra;

    public Venta (Long idCliente ,int cantidadProductos , List<ProductoVentaCommand> productosComprados, int precioTotal , LocalDateTime fechaCompra) {

        this.cantidadProductos = new CantidadProductos(cantidadProductos);
        this.productosComprados = new ProductosComprados(productosComprados);
        this.precioTotal = new PrecioTotal(precioTotal);
        this.fechaCompra = new FechaCompra(fechaCompra);
    }

    public Venta createVenta(VentaCreateCommand venta){
        Venta ventaNueva = new Venta(
            venta.getIdCliente(),
            venta.getCantidadProductos(),
            venta.getProductosComprados(),
            venta.getPrecioTotal(),
            venta.getFechaCompra()
        );

        return ventaNueva;
    }


    public Long getIdVenta(){
        return this.idVenta.getIdVenta();
    }

    public Long getIdCliente(){
        return this.idCliente.getIdCliente();
    }

    public int getCantidadProductos(){
        return this.cantidadProductos.getCantidadProductos();
    }

    public List<ProductoVentaCommand> getProductosComprados(){
        return this.productosComprados.getProductosComprados();
    }

    public int getPrecioTotal(){
        return this.precioTotal.getPrecioTotal();
    }

    public LocalDateTime getFechaCompra(){
        return this.fechaCompra.getFechaCompra();
    }
}
