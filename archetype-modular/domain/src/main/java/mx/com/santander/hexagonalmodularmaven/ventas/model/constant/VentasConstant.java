package mx.com.santander.hexagonalmodularmaven.ventas.model.constant;

public class VentasConstant {
    public static final String CLIENT_NOT_FOUND = "No se encontró el cliente con id %s";
    public static final String PRODUCT_NOT_FOUND = "No se encontró el producto con id %s";
    public static final String PRODUCT_STOCK_INSUFFICIENT = "Stock insuficiente para el producto '%s'. Stock disponible: %s, solicitado: %s";
    public static final String SALE_NO_PRODUCTS = "La venta debe contener al menos un producto";
    public static final String INVALID_AMOUNT = "La cantidad de productos debe ser mayor a cero";
    public static final String VENTA_NOT_FOUND = "No se encontró una venta con id %s";
}
