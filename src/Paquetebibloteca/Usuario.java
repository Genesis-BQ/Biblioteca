/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetebibloteca;

/**
 * Clase o estructura para el manejo de datos de una persona.
 * @author Genesis
 */
public class Usuario {
    
      //Variables de trabajo interno.
    //Incio de la estructura con los elementos.
    
    
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Nacionalidad;
    private String Correo;
    private String Dirección;
    private String Telefono;
    private Libro libro;
    //Inicio de la Estructa o Constructor
    
    public void Usuario(){
        Nombre = " ";
        Apellido = " ";
        Cedula = " ";
        Nacionalidad = " ";
        Correo =  " ";
        Dirección =  " ";
        Telefono = " ";
        libro = new Libro(); 
    }
    
    
    
    //Metodo Get
    
    public Libro getlibro(){
        return libro;
    }
    
    public String getNombre() {
        return Nombre;
    } //Cerrar GetNombre
   public String getApellido(){
        return Apellido;
    } //Cerrar GetApellido
    public String getCedula (){
        return Cedula;
    } //Cerrar Cedula
   public String getNacionalidad(){
        return Nacionalidad;
    } //Cerrar GetNacionalidad
   public String getCorreo(){
        return Correo;
    } //Cerrar GetCorreo
   public String getDirección(){
        return Dirección;
    } //Cerrar GetDirección
    public String getTelefono(){
        return Telefono;
    } //Cerrar GetTelefono
    
    //Metodo Set
    
    public void setlibro(Libro L){ //Asignado un valor de libro a la variable libro
        this.libro = L;
    }
    
    
   public void setNombre(String ValorNombre){
      Nombre = ValorNombre;
    } //cerrar SetNombre
    
    public void setApellido(String ValorApellido){
      Apellido = ValorApellido;
    } //cerrar SetApellido
    
    
    public void setCedula (String ValorCedula){
        Cedula = ValorCedula;
    } //Cerrar Cedula
    public void setNacionalidad (String ValorNacionalidad){
        Nacionalidad = ValorNacionalidad;
    }//Cerrar SetNacionalidad
    
    public void setCorreo (String ValorCorreo){
        Correo = ValorCorreo;
    } //Cerrar SetCorreo
    
    public void setDireción (String ValorDirección){
        Dirección = ValorDirección;
    } //Cerrar SetDirección
 
    public void setTelefono(String ValorTelefono){
      Telefono = ValorTelefono;
    } //cerrar SetEdad
    
    
    
} //Cerrar Usuario
