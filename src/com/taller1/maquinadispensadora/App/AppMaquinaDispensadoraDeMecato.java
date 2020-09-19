package com.taller1.maquinadispensadora.App;

import com.taller1.maquinadispensadora.domain.MaquinaDispensadoraDeMecato;
import com.taller1.maquinadispensadora.domain.Producto;

public class AppMaquinaDispensadoraDeMecato {
    public static void main(String[] args) {

        // Se crea maquina dispensadora.
        MaquinaDispensadoraDeMecato maquina;
        maquina = new MaquinaDispensadoraDeMecato();

        // Se crean varios productos.
        Producto papasDeLimon = new Producto("A1","Papas de limon", (short) 2000);
        Producto cocaCola = new Producto("B1", "Coca Cola", (short) 2500);
        Producto manzana = new Producto("C1", "Manzana", (short) 1900);
        Producto pepsi = new Producto("D1", "Pepsi", (short) 2300);
        Producto mani = new Producto("E1", "Mani", (short) 1200);
        Producto boliqueso = new Producto("A2", "Boliquesos", (short) 950);
        Producto golochips = new Producto("B2", "Golochips", (short) 800);
        Producto minichips = new Producto("C2", "Mini chips", (short) 900);
        Producto chocolatina = new Producto("D2", "Chocolatina", (short) 500);
        Producto jumbomani = new Producto("E2","Jumbo mani", (short) 2300);
        Producto hitmora = new Producto("F1", "Hit de mora", (short) 1750);
        Producto tostakos = new Producto("F2", "Tostakos", (short) 800);

        //se cargar los 10 productos a la máquina, según los objetos tipos Producto instanciados.
        maquina.cargarProductoAMaquina(papasDeLimon, cocaCola, manzana, pepsi, mani, boliqueso, golochips, minichips, chocolatina, jumbomani);

        //Aumentar cantidad de cada producto.
        maquina.cargarInventario("A1", (byte) 10);
        maquina.cargarInventario("B1", (byte) 8);
        maquina.cargarInventario("C1", (byte) 5);
        maquina.cargarInventario("D1", (byte) 7);
        maquina.cargarInventario("E1", (byte) 3);
        maquina.cargarInventario("A2", (byte) 2);
        maquina.cargarInventario("B2", (byte) 9);
        maquina.cargarInventario("C2", (byte) 15);
        maquina.cargarInventario("D2", (byte) 1);
        maquina.cargarInventario("E2", (byte) 0);

        System.out.println();
        System.out.println("Sacar producto según nombre o codigo:");

        maquina.sacarProductoCodigo("A1", (short) 2000);
        System.out.println();
        maquina.sacarProductoNombre("Chocolatina", (short) 1000);
        System.out.println();
        maquina.sacarProductoCodigo("E2", (short) 1500);
        System.out.println();
        maquina.sacarProductoNombre("Tostakos", (short) 1000);

        //Lista de productos agotados
        System.out.println();
        System.out.println("Lista de productos agotados:");

        maquina.consultarProductosAgotados().forEach(p ->{
            System.out.println("El producto " + p.getNombre() + " está agotado");
        });

        //Inventario producto determinado
        System.out.println();
        System.out.println("Inventario de un producto determinado");

        String codigo = "A1";
        System.out.println("El producto " + maquina.consultarUndsUnPdto(codigo).getNombre() + " tiene en inventario: " + maquina.consultarUndsUnPdto(codigo).getCantidadActual() + " unidades");

        //Inventario todos los productos
        System.out.println();
        System.out.println("Consultar las unidades de todos los productos:");

        maquina.cosultarTotalUndsTodosPdtos().forEach(p ->{
            System.out.println("El producto " + p.getNombre() + " tiene en inventario: " + p.getCantidadActual() + " unidades");
        });

    }
}
