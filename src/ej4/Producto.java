/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

/**
 *
 * @author federico.acenjo
 */
public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private Double precio;
    private int stock;
    private Categoria rubro;

    public Producto(int codigo, String descripcion, Double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto o) {
        if (codigo == o.codigo){
            return 0;
        } else if (codigo > o.codigo){
            return 1;
        } else {
            return -1;
        }
    }
    
    
}
