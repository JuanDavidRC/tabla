/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.CrudAutos.controlador;

import com.udec.CrudAutos.modelo.Logica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
@Named(value = "autoMovil")
@ViewScoped
public class AutoMovil implements Serializable{
   /**
    * atributo con el nombre de la persona
    */
    private String nombre;
    /**
     * atributo con la marca de el atomovil
     */
    private String marca;
    /**
     * atributo con el modelo de el automovil
     */
    private String modelo;
    /**
     * lista con las marcas de los autos en el combox
     */   
    private List<Logica> filtros;
     /**
     * lista con la cual se filtran cada uno de los atributos
     */
    private List<String> marcas;
    /**
     * lista con el  modelo de el autoen el combox
     */
    private List<String> modeloo;
    /**
     * lista con todos los datos a ingresar
     */
    private ArrayList<Logica> datos = new ArrayList();
    /**
     * atribto que se modificara 
     */
    private  String marcaa;
    /**
     * atributo que se modifica 
     */
    private String modelito;
    /**
     * lista con los atos a eliminar
     */
    private ArrayList<Logica> datosEliminados= new ArrayList();
    /**
     * nombre que sera editato y reemplazado
     * 
     */
    private String nombree;
   
    
    /**
     * lista datos con los datos de los autos
     * lista marcas que estar en el combos
     * lista modelo con los modelos a escojer de los autos
     * constructor de la clase que inicializa los modelos y marcas de autos y al añadir a las
     * listas
     */
     @PostConstruct
    public void añadir(){
        datos=new ArrayList<>();
        marcas=new ArrayList<>();
        modeloo= new ArrayList<>();
        for(int i=1990; i<2020;i++){
            modeloo.add(String.valueOf(i));
        }
       
        marcas.add("Mazda");
        marcas.add("Chevrolet");
        marcas.add("Ford");
        marcas.add("Renault");
    }
    /**
     * Metodo que retorna el nombre del auto
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo con el parametro de el nombre 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que retorna la marca 
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo con el parametro marca 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * metodo que retorna la lista de  las masrcar
     * @return 
     */
    public List<String> getMarcas() {
        return marcas;
    }
    /**
     * metodo con el parametro de la lista
     * @param marcas 
     */
    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
    /**
     * metodo que retorna el modelo de el auto
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * metodo con el parametro de el modelo de el auto
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * metodo que retorna los datos de el auto
     * @return 
     */
    public List<Logica> getDatos() {
        return datos;
    }
    /**
     * metodo con el parametro datos con la lista de los autos
     * @param datos 
     */
    public void setDatos(List<Logica> datos) {
        this.datos = (ArrayList<Logica>) datos;
    }
    /**
     * metodo que retorna los filtros de los autos
     * @return 
     */
    public List<Logica> getFiltros() {
        return filtros;
    }
    /**
     * metodo con el parametro de los filtros de los autos
     * @param filtros 
     */
    public void setFiltros(List<Logica> filtros) {
        this.filtros = filtros;
    }
    /**
     * metodo vacio que usa el boton agregar para listar sin refrescar la pagina
     */
    public void mostrarDatos(){
         Logica logica = new Logica(nombre, marca, modelo);
        datos.add(logica);
        
                Logger.getLogger(Logica.class.getName()).log(Level.INFO, "Ingreso el nombre {0} de carro el {1} de el  modelo {2}", new Object[]{logica.getNombre(), logica.getMarca(), logica.getModelo()});

  
    }
    /**
     * metodo que retorna la lista de modelos de autos
     * @return 
     */
    public List<String> getModeloo() {
        return modeloo;
    }
    /**
     * metodo con el parametro de la lista de los modelos de los autos
     * @param modeloo 
     */
    public void setModeloo(List<String> modeloo) {
        this.modeloo = modeloo;
    }
    /**
     * metodo que actualiza los campos de la tabla trayendolos desde el modelo
     * @param event 
     */
    public void actualizar(RowEditEvent event){
        Logica l =(Logica) event.getObject();
        l.setNombree(nombree);
        l.setMarcaa(marcaa);   
        l.setModelito(modelito);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Modificado"));
         Logger.getLogger(Logica.class.getName()).log(Level.INFO, " el nombre {0} lo edito por el nombre {1} con modelo {2} por {3} con la marca {4} por {5}",  new Object[]{getNombre(), ((Logica)event.getObject()).getNombre(), getModelo(), ((Logica)event.getObject()).getModelo(), getMarca(),((Logica)event.getObject()).getMarca()});
    }
    /**
     * metodo con el mensaje de cancelado que se muestra en  la vitsa 
     * @param event 
     */
    public void cancelar(RowEditEvent event){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cancelado"));
    }
    /**
     * metodo que elimina los detos de la lista 
     * @return 
     */
    
    public String eliminar(){
        for (Logica lista : datos) {
            if(lista.isSeleccion()){
            datosEliminados.add(lista);
            Logger.getLogger(Logica.class.getName()).log(Level.INFO, "Ha eliminado el nombre: {0}  marca de carro: {1} con el modelo: {2}", new Object[]{lista.getNombre(), lista.getMarca(), lista.getModelo()});
            }
        }
        if(!datosEliminados.isEmpty()){
            datos.removeAll(datosEliminados);
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Eliminado"));
        }
        return"auto";
    }
   /**
    * retorna la lista temporal con el regitro que se selecciono
    * @return 
    */
    public ArrayList<Logica> getDatosEliminados() {
        return datosEliminados;
    }
    /**
     * metodo con el parametro de la lista temporal
     * @param datosEliminados 
     */
    public void setDatosEliminados(ArrayList<Logica> datosEliminados) {
        this.datosEliminados = datosEliminados;
    }
    /**
     * metodo que retorna el nombre a editar
     * @return 
     */
    public String getNombree() {
        return nombree;
    }
    /**
     * metodo con el parametro nombre a editar
     * @param nombree 
     */
    public void setNombree(String nombree) {
        this.nombree = nombree;
    }
    
}
