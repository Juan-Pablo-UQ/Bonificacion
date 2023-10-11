package com.example.preparcialprueba3.model;

import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Clientes>listaClientes;
    private ArrayList<Producto>listaProductos;
    private ArrayList<Pedidos>listaPedidos;

    public Restaurante() {
        listaClientes=new ArrayList<>();
        listaProductos=new ArrayList<>();
        listaPedidos=new ArrayList<>();
    }

    public ArrayList<Pedidos> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedidos> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void agregarCliente(Clientes clientes){
        listaClientes.add(clientes);
    }
    public void agrefarProductos(Producto producto){
        listaProductos.add(producto);
    }
    public void agregarPedido(Pedidos pedidos){
        listaPedidos.add(pedidos);
    }

    public ArrayList<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

}
