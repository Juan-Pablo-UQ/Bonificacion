package com.example.preparcialprueba3;


import com.example.preparcialprueba3.model.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {


    public static void cargarDatosArchivos(Restaurante restaurante) throws FileNotFoundException, IOException {
        //cargar archivo de anunciantes
        ArrayList<Clientes> listaClientes = cargarClientew();
        if (!listaClientes.isEmpty())
            restaurante.getListaClientes().addAll(listaClientes);

        //cargar archivos compradores
        ArrayList<Producto> compradoresCargados = cargarProductos();
        if (!compradoresCargados.isEmpty())
            restaurante.getListaProductos().addAll(cargarProductos());

    }

    public static void guardarlistaClientes(ArrayList<Clientes> listaClientes) throws IOException {

        String contenido = "";

        for (Clientes clientes : listaClientes) {
            contenido += clientes.getCodigo() +
                    "@" + clientes.getCedula() +
                    "@" + clientes.getTipoDocumento() +
                    "@" + clientes.getNombre() +
                    "@" + clientes.getApellido() +
                    "@" +clientes.getTelefono()+ "\n";
        }
        ArchivoUtil.guardarArchivo("C://Users//Juan Pablo//Documents//GitHub//preparcialprueba3//src//main//resources//persistencia//listaClientes.txt", contenido, false);
    }
    public static void guardarProductos(ArrayList<Producto> listaProductos)throws IOException{

        String contenido = "";

        for (Producto producto: listaProductos) {
            contenido += producto.getCodigo() +
                    "@" + producto.getNombre() +
                    "@" + producto.getPrecio() + "\n";
        }
        ArchivoUtil.guardarArchivo("C://Users//Juan Pablo//Documents//GitHub//preparcialprueba3//src//main//resources//persistencia//listaProducto.txt",contenido,false);
    }




//	----------------------LOADS------------------------

    public static ArrayList<Clientes> cargarClientew() throws FileNotFoundException, IOException {
        ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
        ArrayList<String> contenido = ArchivoUtil.leerArchivo("C://Users//Juan Pablo//Documents//GitHub//preparcialprueba3//src//main//resources//persistencia//listaClientes.txt");
        String linea = "";
        for (int i = 0; i < contenido.size(); i++) {
            linea = contenido.get(i);//juan,arias,125454,Armenia,uni1@,12454,125444

            Clientes clientes = new Clientes();
            clientes.setCodigo(linea.split("@")[0]);
            clientes.setCedula((linea.split("@")[1]));
            clientes.setTipoDocumento(TipoDocumento.valueOf(linea.split("@")[2]));
            clientes.setNombre(linea.split("@")[3]);
            clientes.setApellido(linea.split("@")[4]);
            clientes.setTelefono(linea.split("@")[5]);
            listaClientes.add(clientes);
        }
        return listaClientes;
    }
    public static void guardarRecursoSubastaXML(Restaurante restaurante) {

        try {
            ArchivoUtil.salvarRecursoSerializadoXML("C://Users//Juan Pablo//Documents//GitHub//preparcialprueba3//src//main//resources//persistencia//model.xml", restaurante);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void guardarListaPedidos(ArrayList<Pedidos> listaPedidos){
        try {
            ArchivoUtil.salvarRecursoSerializadoXML("C://Users//Juan Pablo//Documents//GitHub//preparcialprueba3//src//main//resources//persistencia//listaPedio.xml", listaPedidos);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static ArrayList<Producto> cargarProductos() throws FileNotFoundException, IOException {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        ArrayList<String> contenido = ArchivoUtil.leerArchivo("C://Users//Juan Pablo//Documents//GitHub//preparcialprueba3//src//main//resources//persistencia//listaProducto.txt");
        String linea = "";
        for (int i = 0; i < contenido.size(); i++) {
            linea = contenido.get(i);
            Producto producto = new Producto();
            producto.setCodigo(linea.split("@")[0]);
            producto.setNombre(linea.split("@")[1]);
            producto.setPrecio(Float.valueOf(linea.split("@")[2]));
            listaProductos.add(producto);


        }
        return listaProductos;
    }












//	----------------------SAVES------------------------

    /**
     * Guarda en un archivo de texto todos la información de las personas almacenadas en el ArrayList
     *
     * @param
     * @throws IOException
     */

//    public static void guardarObjetos(ArrayList<Cliente> listaClientes, String ruta) throws IOException {
//        String contenido = "";
//
//        for (Cliente clienteAux : listaClientes) {
//            contenido += clienteAux.getNombre() + "," + clienteAux.getApellido() + "," + clienteAux.getCedula() + clienteAux.getDireccion()
//                    + "," + clienteAux.getCorreo() + "," + clienteAux.getFechaNacimiento() + "," + clienteAux.getTelefono() + "\n";
//        }
//        ArchivoUtil.guardarArchivo(ruta, contenido, true);
//    }


    //------------------------------------SERIALIZACIÓN  y XML






}
