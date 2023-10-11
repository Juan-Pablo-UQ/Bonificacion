package com.example.preparcialprueba3.model;

import com.example.preparcialprueba3.Persistencia;
import com.example.preparcialprueba3.UtilCargarDatos;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Restaurante restaurante=UtilCargarDatos.cargarDatos();
        salvarDatosPrueba(restaurante);
        salvarArchivoMxl(restaurante);

    }
    public static void salvarDatosPrueba(Restaurante restaurante){
        try {
            Persistencia.guardarlistaClientes(restaurante.getListaClientes());
            Persistencia.guardarProductos(restaurante.getListaProductos());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void salvarArchivoMxl(Restaurante restaurante){
        Persistencia.guardarRecursoSubastaXML(restaurante);
        Persistencia.guardarListaPedidos(restaurante.getListaPedidos());

    }
}
