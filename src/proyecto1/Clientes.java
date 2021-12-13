/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

/**
 *
 * @author Windows 10
 */
public class Clientes {
    private int dpi, nit;
    private String nombre,correo, genero;
    
    public Clientes(String nombre,String correo,String genero,int dpi,int nit){
        this.nombre = nombre;
        this.correo = correo;
        this.nit = nit;
        this.dpi = dpi;
        this.genero = genero;
    }
    
    public String Mostrar_Informacion(){
        String chain = ("dpi:"+this.dpi+"\n"
                + "nit:"+this.nit+"\n"
                + "nombre:"+this.nombre+"\n"
                + "genero:"+this.genero+"\n"
                + "correo:"+this.correo);
        return chain;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setEdad(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
