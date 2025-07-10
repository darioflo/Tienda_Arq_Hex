package mx.com.santander.hexagonalmodularmaven.producto.model.entity;

import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoCreateCommand;

public class Producto {
    private ProductoID id;
    private ProductoNombre nombre;
    private ProductoPrecio precio;
    private ProductoStock stock;


    public Producto (Long id, String nombre , double precio, int stock){
        this.id = new ProductoID(id);
        this.nombre = new ProductoNombre(nombre);
        this.precio = new ProductoPrecio(precio);
        this.stock = new ProductoStock(stock);
    }

     public Producto(){}

    public Producto createProducto(ProductoCreateCommand producto){
        this.nombre = new ProductoNombre(producto.getNombre());
        this.precio = new ProductoPrecio(producto.getPrecio());
        this.stock = new ProductoStock(producto.getStock());

        return this;
    }

    public Long getId(){
        return this.id.getId();
    }

    public String getNombre(){
        return this.nombre.getNombre();
    }

    public double getPrecio(){
        return this.precio.getPrecio();
    }

    public int getStock(){
        return this.stock.getStock();
    }
}
