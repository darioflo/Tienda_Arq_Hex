package mx.com.santander.hexagonalmodularmaven.ventas.model.entity;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.VentaCreateCommand;

@NoArgsConstructor
@Getter
@Setter
public class Venta {
    @Id
    private VentaID idVenta;
    private VentaIdCliente idCliente;
    private CantidadProductos cantidadProductos;
    private ProductosComprados productosComprados;
    private PrecioTotal precioTotal;
    private FechaCompra fechaCompra;

    public Venta(Long idCliente, int cantidadProductos, ProductosComprados productosComprados, int precioTotal, LocalDateTime fechaCompra) {
    this.idCliente = new VentaIdCliente(idCliente);
    this.cantidadProductos = new CantidadProductos(cantidadProductos);
    this.productosComprados = productosComprados;
    this.precioTotal = new PrecioTotal(precioTotal);
    this.fechaCompra = new FechaCompra(fechaCompra);
}

public Venta createVenta(VentaCreateCommand venta) {
    return new Venta(
        venta.getIdCliente(),
        venta.getCantidadProductos(),
        new ProductosComprados(venta.getProductosComprados()),
        venta.getPrecioTotal(),
        venta.getFechaCompra()
    );
}


public Long getIdVenta() {
    if (this.idVenta == null) {
        throw new IllegalStateException("El ID de la venta no ha sido inicializado");
    }
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
