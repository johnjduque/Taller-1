package com.taller1.maquinadispensadora.domain;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDispensadoraDeMecato {

    private List<Producto> productos;

    public MaquinaDispensadoraDeMecato() {
        this.productos = new ArrayList<>();
    }

    public void cargarProductoAMaquina(Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6, Producto producto7, Producto producto8, Producto producto9, Producto producto10){
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);
    }

    public void cargarInventario(String codigo, byte cantidad){
        boolean existePdto = false;
        Producto producto= new Producto();
        for (Producto pdto:productos) {
            if (pdto.getCodigo().equals(codigo)){
                existePdto=true;
                producto=pdto;
            }
        }
        if (existePdto){
            if ((producto.getCantidadActual() + cantidad) > producto.getCantidadMaxima()) {
                producto.setCantidadActual((byte) 8);
            }
            else{
                byte cantidadActual = (byte) (producto.getCantidadActual() + cantidad);
                producto.setCantidadActual(cantidadActual);
            }
        }
    }

    public void sacarProductoNombre(String nombre, short dinero){
        boolean existePdto = false;
        Producto producto= new Producto();
        for (Producto pdto:productos) {
            if (pdto.getNombre().equals(nombre)){
                existePdto=true;
                producto=pdto;
            }
        }
        if (existePdto){
            if (producto.getNombre().equals(nombre) && producto.getCantidadActual()>0 && producto.getPrecio()<=dinero){
                byte cantidadActual = (byte) (producto.getCantidadActual() - 1);
                producto.setCantidadActual(cantidadActual);
                System.out.println("Disfrute su "+ producto.getNombre() + " su cambio es de: "+ (dinero - producto.getPrecio()) + " pesos");
            }
            else {
                System.out.println("Producto no disponible, su cambio es de: "+ dinero +" pesos");
            }
        }
        else {
            System.out.println("Producto no disponible, su cambio es de: "+ dinero +" pesos");
        }
    }

    public void sacarProductoCodigo(String codigo, short dinero){
        boolean existePdto = false;
        Producto producto= new Producto();
        for (Producto pdto:productos) {
            if (pdto.getCodigo().equals(codigo)){
                existePdto=true;
                producto=pdto;
            }
        }
        if (existePdto) {
            if (producto.getCodigo().equals(codigo) && producto.getCantidadActual() > 0 && producto.getPrecio() <= dinero) {
                byte cantidadActual = (byte) (producto.getCantidadActual() - 1);
                producto.setCantidadActual(cantidadActual);
                System.out.println("Disfrute su " + producto.getNombre() + " su cambio es de: " + (dinero - producto.getPrecio()) + " pesos");
            }
            else {
                System.out.println("Producto no disponible, su cambio es de: "+ dinero +" pesos");
            }
        }
        else {
            System.out.println("Producto no disponible, su cambio es de: "+ dinero +" pesos");
        }
    }

    public List<Producto> consultarProductosAgotados(){
        List<Producto> productosAgotados = new ArrayList<>();
        productos.forEach(producto -> {
            if(producto.getCantidadActual()==0){
                productosAgotados.add(producto);
            }
        });

        return productosAgotados;
    }

    public Producto consultarUndsUnPdto(String codigo){
        Producto pdto = new Producto();
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                pdto = producto;
                break;
            }
        }
        return pdto;
    }

    public List<Producto> cosultarTotalUndsTodosPdtos(){
        List<Producto> inventarioTodos = new ArrayList<>();
        productos.forEach(producto -> {
            inventarioTodos.add(producto);
        });

        return inventarioTodos;
    }
}
