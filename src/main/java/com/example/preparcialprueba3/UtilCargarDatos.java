package com.example.preparcialprueba3;

import com.example.preparcialprueba3.model.*;

import java.time.LocalDate;

public  class UtilCargarDatos {
    public UtilCargarDatos() {
    }

    public static Restaurante cargarDatos () {

        Restaurante restaurante=new Restaurante();

        Producto producto=new Producto();
        producto.setCodigo("123");
        producto.setNombre("bandeja paisa");
        producto.setPrecio(1200.F);

        Producto producto2=new Producto();
        producto2.setCodigo("321");
        producto2.setNombre("arroz pollo");
        producto2.setPrecio(1200.F);

        Clientes clientes=new Clientes();
        clientes.setCodigo("03");
        clientes.setCedula("1094883247");
        clientes.setTipoDocumento(TipoDocumento.CEDULA);
        clientes.setNombre("Juan pablo");
        clientes.setApellido("buitrago");
        clientes.setTelefono("3128638699");

        Clientes clientes2=new Clientes();
        clientes2.setCodigo("04");
        clientes2.setCedula("1094");
        clientes2.setTipoDocumento(TipoDocumento.TARGETAIDENTIDAD);
        clientes2.setNombre("lisa");
        clientes2.setApellido("maya");
        clientes2.setTelefono("42424242424");

        restaurante.agrefarProductos(producto);
        restaurante.agrefarProductos(producto2);

        restaurante.agregarCliente(clientes);
        restaurante.agregarCliente(clientes2);

        Pedidos pedidos=new Pedidos();
        pedidos.setFecha(String.valueOf(LocalDate.now()));
        pedidos.setTotal(123f);
        pedidos.setClientes(clientes);
        pedidos.setProducto(producto);
        restaurante.agregarPedido(pedidos);

        return restaurante;

    }

}
