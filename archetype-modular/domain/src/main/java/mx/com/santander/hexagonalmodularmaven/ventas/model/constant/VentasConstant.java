package mx.com.santander.hexagonalmodularmaven.ventas.model.constant;

public class VentasConstant {
    public static final String CLIENTE_NOT_FOUND = "No se encontró el cliente con id %s";
    public static final String PRODUCTO_NOT_FOUND = "No se encontró el producto con id %s";
    public static final String PRODUCTO_STOCK_INSUFICIENTE = "Stock insuficiente para el producto '%s'. Stock disponible: %s, solicitado: %s";
    public static final String VENTA_NO_CONTIENE_PRODUCTOS = "La venta debe contener al menos un producto";
    public static final String CANTIDAD_INVALIDA = "La cantidad de productos debe ser mayor a cero";
}
