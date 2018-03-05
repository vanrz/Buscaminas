/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscaminas;

/**
 *
 * @author Estudiantes
 */
public class Celda {
    
    //atributos de la celda
    
    private Corazon miCorazon;
    private Bandera miBandera;
    private boolean Estado;
    private int CorazonesAlrededor;

    public Corazon getMiCorazon() {
        return miCorazon;
    }

    public void setMiCorazon(Corazon miCorazon) {
        this.miCorazon = miCorazon;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getCorazonesAlrededor() {
        return CorazonesAlrededor;
    }

    public void setCorazonesAlrededor(int CorazonesAlrededor) {
        this.CorazonesAlrededor = CorazonesAlrededor;
    }
    
    
    
    
    
    
    
}
