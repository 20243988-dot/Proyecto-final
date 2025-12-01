/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class Fecha {
    private int dd, mm, aa;

    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    
    public int calcularDiferenciaDiasConOtraFecha(Fecha otra) {
        int diasDif, mesesDif, aniosDif;
        
        if(this.dd>otra.dd) {
            diasDif = this.dd-otra.dd;
            
        }
        else {
            diasDif = otra.dd - this.dd;
            
        }
        
        if(this.mm>otra.mm) {
            mesesDif = this.mm - otra.mm;
            
        }
        else {
            mesesDif = otra.mm - this.mm;
            
        }
        
        if(this.aa > otra.aa) {
            aniosDif = this.aa - otra.aa;
            
        }
        else {
            aniosDif = otra.aa - this.aa;
            
        }
        
        return diasDif + mesesDif*30 + aniosDif*360;
        
    }
    
    public boolean esMayorAOtraFecha(Fecha otra) {
        boolean bool = false;
        if(this.aa>otra.aa) {
            bool = true;
            
        }
        else {
            if(this.mm>otra.mm) {
                bool = true;
                
            }
            else {
                if(this.dd>otra.dd) {
                    bool = true;
                }
            }
        }
        
        return bool;
        
    }
    
    public boolean esMenorAOtraFecha(Fecha otra) {
        boolean bool = false;
        if(this.aa<otra.aa) {
            bool = true;
            
        }
        else {
            if(this.mm<otra.mm) {
                bool = true;
                
            }
            else {
                if(this.dd<otra.dd) {
                    bool = true;
                }
            }
        }
        
        return bool;
        
    }
    
    public boolean esIgualAOtraFecha(Fecha otra) {
        boolean bool = false;
        
        if(this.aa == otra.aa) {
            if(this.mm == otra.mm) {
                if(this.dd == otra.dd) {
                    bool = true;
                }
                
            }
            
        }
        
        return bool;
        
    }
    
    public String verFecha() {
        return this.dd + "/" + this.mm + "/" + this.aa;
        
    }
}
