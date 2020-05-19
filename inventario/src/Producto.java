/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class Producto {
    private String nomProd;
    private String fechaElab;
    private String fechaVenc;
    private int precio;
    private String codBarra;

    public Producto(String nomProd, String fechaElab, String fechaVenc, int precio, String codBarra) {
        this.nomProd = nomProd;
        this.fechaElab = fechaElab;
        this.fechaVenc = fechaVenc;
        this.precio = precio;
        this.codBarra = codBarra;
    }

    public Producto() {
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getFechaElab() {
        return fechaElab;
    }

    public void setFechaElab(String fechaElab) {
        this.fechaElab = fechaElab;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    @Override
    public String toString() {
        return "Producto{" + "nomProd=" + nomProd + ", fechaElab=" + fechaElab + ", fechaVenc=" + fechaVenc + ", precio=" + precio + ", codBarra=" + codBarra + '}';
    }
    
}
