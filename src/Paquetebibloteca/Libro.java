/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetebibloteca;

/**
 *
 * @author Genesis
 */
public class Libro {
    
    //Variables de trabajo interno.
    //Incio de la estructura con los elementos.
    
    private String Nombre ;
    private String Autor ;
    private String Edición ;
    private String Editora ;
    private String Codigo;
    private int Copia = 0;
    private String Tipo ;
    private int Dias = 0;
    
    //Inicio de la Estructa o Constructor
    
    private void Libro (){
        Nombre = " ";
        Autor =  " ";
        Edición = " ";
        Editora = " ";
        Codigo = " ";
        Tipo = " ";
        Copia = 0;
        Dias = 0;  
    } //Cerrar Libro
    
    //Metodo Get
    
    public String getNombre() {
        return Nombre;
    } //Cerrar GetNombre
    
    
    public String getAutor() {
        return Autor;
    } //Cerrar GetAutor
    
    public String getEdición() {
        return Edición;
    } //Cerrar GetEdición
    
    
    public String getEditora() {
        return Editora;
    } //Cerrar GetEditora
    
    
    public String getCodigo() {
        return Codigo;
    } //Cerrar GetCodigo
    
    
    public int getCopia() {
        return Copia;
    } //Cerrar GetCopia
    
    
    public String getTipo() {
        return Tipo;
    } //Cerrar GetTipo
    
    
    
    
    //Metodo Set
    
    
    public void setNombre(String ValorNombre) {
        Nombre = ValorNombre;
    } //cerrar SetNombre
    
    
    public void setAutor (String ValorAutor){
        Autor = ValorAutor;
    } //Cerrar SetAutor
    
    
    public void setEdición (String ValorEdición){
        Edición = ValorEdición;
    } //Cerrar SetEdición
    
    public void setEditora (String ValorEditora){
        Editora = ValorEditora;
    } //Cerrar SetEdición
    
    public void setCodigo (String ValorCodigo){
        Codigo = ValorCodigo;
    } //Cerrar SetCodigo
    
    public void setCopia (int ValorCopia){
        Copia = ValorCopia;
    } //Cerrar SetTipo
    
    public void setTipo (String ValorTipo){
        Tipo = ValorTipo;
    } //Cerrar SetTipo
} //Cerrar Libro
