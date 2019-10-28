/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.CrudAutos.modelo;

/**
 *
 * @author JUAN DAVID REYES
 * @author ALEANDRO TORRES
 */
public class Logica {
    
    private String nombre;
    /**
     * atributo con el nombre que usara la clase automovil
     */
    private String marca;
    /**
     * atributo marca de el auto que se envia a el controlador
     */
    private String modelo;
    /**
     * atributo con el modelo de el atuto que recibe el controlador
     */
    private String marcaa;
    /**
     * atributo con la marca actualizada que recibe el controlador
     */
    private String modelito;
    /**
     * atributo modelo que se usa en la clase controlador
     */
     private boolean seleccion ;
     /**
      * atrubuto que permiira eliminar 
      */
     private String nombree;
     
    /**
     * constructor de la clase con sus atributos
     * @param nombre
     * @param marca
     * @param modelo 
     */
    public Logica(String nombre, String marca, String modelo) {
        this.nombre = nombre;
        this.marca = marca;      
        this.modelo = modelo;
    }
    /**
     * metodo que retorna el nombre de el propietario de el auto
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo con el parametro nombre de el auto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que retorna la marca de el auto
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    /**
     * metodo con el paramatro marca de el auto
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * metodo que retorna el modelo de el auto
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * metodo con el parametro modelo de el auto
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * metodo set qu retorna la marca a modificada
     * @param marcaa 
     */
    public void setMarcaa(String marcaa) {
        this.marcaa = marcaa;
    }
    /**
     * metodo set que retorna el modelo modificado
     * @param modelito 
     */
    public void setModelito(String modelito) {
        this.modelito= modelito;
    }
    /**
     * metodoque retorna la seleccion a eliminar
     * @return 
     */
    public boolean isSeleccion() {
        return seleccion;
    }
    /**
     * metodo con el parametro seleccion a eliminar
     * @param seleccion 
     */
    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }
    /**
     * metodo set con el nombre a editar
     * @param nombree 
     */
    public void setNombree(String nombree) {
        this.nombree = nombree;
    }


    
    
    
}

