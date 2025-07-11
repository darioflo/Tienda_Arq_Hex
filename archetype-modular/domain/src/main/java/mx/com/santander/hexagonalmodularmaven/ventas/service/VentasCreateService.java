package mx.com.santander.hexagonalmodularmaven.ventas.service;
import java.util.ArrayList;
import java.util.List;

import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;
import mx.com.santander.hexagonalmodularmaven.ventas.model.constant.VentasConstant;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.VentaCreateCommand;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.repository.VentaRepository;

public class VentasCreateService {
    
    private ClienteDAO clienteDAO;
    private ProductoDAO productoDAO;    
    private VentaRepository ventaRepository;

    public Venta createVenta(VentaCreateCommand venta){
        
        if (clienteDAO.findById(venta.getIdCliente())== null) {
            throw new IllegalArgumentException(VentasConstant.CLIENT_NOT_FOUND);
        }

        List<ProductoVentaCommand> productos = new ArrayList<>();
        
        double precioUnitario = 0.0;
        double precioTotal = 0.0;

        for (ProductoVentaCommand producto : venta.getProductosComprados()) {
            Producto productoComprado = productoDAO.getProductById(producto.getProductoId());

            if (productoComprado == null) {
                throw new IllegalArgumentException(VentasConstant.PRODUCT_NOT_FOUND);
            }

            if (producto.getCantidad() < 0) {
                throw new IllegalArgumentException(VentasConstant.INVALID_AMOUNT);
            }

            if (producto.getStock() < venta.getCantidadProductos()) {
                throw new IllegalArgumentException(String.format(
                    VentasConstant.PRODUCT_STOCK_INSUFFICIENT,
                    producto.getNombre(), producto.getStock(), venta.getCantidadProductos()
                ));
            }

            precioUnitario = producto.getPrecio();
            precioTotal += precioUnitario * venta.getCantidadProductos();

            productos.add(new ProductoVentaCommand(
                producto.getProductoId(),
                producto.getNombre(),
                producto.getPrecio(), 
                producto.getCantidad(),
                producto.getStock()
                ));

        }
            Venta ventaNueva = new Venta();
            Venta ventaGuardada = ventaNueva.createVenta(venta);

        ventaRepository.createVenta(ventaGuardada);

        return ventaGuardada;
    }
}
