/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chard
 */
public class CarritoCompra {
    private List<ItemCarrito> productos;
    private double total;

    public CarritoCompra() {
        this.total = 0.00;
        this.productos = new ArrayList();
    }

    public List<ItemCarrito> getProductos() {
        return productos;
    }

    public void setProductos(List<ItemCarrito> productos) {
        this.productos = productos;
    }

    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void agregarAlCarrito(ItemCarrito i){
        productos.add(i);
    }
    
    
}
