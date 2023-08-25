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
public class Prestamo {
    private Libro L;
    private Usuario U;
    private int diaP; //Dia de prestamo
    private int mesP; //Mes de prestamo
    private int anitoP; //Año de prestamo
    private int Dentrega; //Dia de entrega
    private int Mentrega; //Mes de entrega
    private int Aentrega; // Año de entrga
    
    
    
    public void Prestamo(){
        
        L = new Libro();
        U = new Usuario();
        
        diaP = 0;
        mesP = 0;
        anitoP = 0;
        Dentrega = 0;
        Mentrega = 0;
        Aentrega = 0;
    }//Cerrar Prestamo
    
    //Metodo Get
    
    public Libro getLibro(){
        return L;
    } //Cerrar L
    
    public Usuario getUsuario(){
        return U;
    } //Cerrar U
    
    public int getdiaP(){
        return diaP;
    } //Cerrar diap
    
    public int getmesP (){
        return mesP;
    } //Cerrar mesp
    
    public int getanitoP(){
        return anitoP;
    } //Cerrar
    
    public int getDentrega(){
        return Dentrega;
    }//Cerrar Dentrega
    
    public int getMentraga(){
        return Mentrega;
    } //Cerrar Mentrega
    
    public int getAentrega(){
        return Aentrega;
    } //Cerrar Aentrega;
    
    //Metodo set
    
    public void setLibro(Libro Librito){
        this.L = Librito;
    } //Cerrar Librito
    
    public void setUsuario(Usuario Usa){
        this.U = Usa;
    } //Cerrar Usa
    
    public void setdiaP (int daiP){
        this.diaP = daiP;
    } //Cerrar daiP
    
    public void setmesP (int messP){
        this.mesP = messP;
    } //Cerrar messP
    
    public void setanitoP (int aanitoP){
        this.anitoP = aanitoP;
    } //Cerrar aanitoP
    
    public void setDentrega (int Dentega){
        this.Dentrega = Dentega;
    } //Cerrear Dentraga
    
    public void setMentrega (int Mentega){
        this.Mentrega = Mentega;
    } //Cerrar Mentega
    
    public void setAentrega (int Aentega){
        this.Aentrega = Aentega;
    } //Cerrar Aentega
    
}//Cerrar Class

