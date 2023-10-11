package com.example.preparcialprueba3.model;

public class Clientes {
    private String codigo;
    private String cedula;
    private TipoDocumento TipoDocumento;
    private String nombre;
    private String apellido;
    private String telefono;

    public Clientes() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public com.example.preparcialprueba3.model.TipoDocumento getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(com.example.preparcialprueba3.model.TipoDocumento tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "codigo='" + codigo + '\'' +
                ", cedula='" + cedula + '\'' +
                ", TipoDocumento=" + TipoDocumento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
