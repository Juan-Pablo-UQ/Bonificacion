package com.example.preparcialprueba3.model;

public class Pedidos {
    private String fecha;
    private float total;
    private Clientes clientes;
    private Producto producto;

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedidos() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }


    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "fecha='" + fecha + '\'' +
                ", total=" + total +
                ", clientes=" + clientes +
                ", producto=" + producto +
                '}';
    }
}
