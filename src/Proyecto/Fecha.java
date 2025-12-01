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
    // Convertir ambas fechas a "cantidad total de días" (aproximado)
    long totalDiasEsta = this.dd + (this.mm * 30) + (this.aa * 360);
    long totalDiasOtra = otra.dd + (otra.mm * 30) + (otra.aa * 360);
    
    // Devolver la diferencia absoluta
    return (int) Math.abs(totalDiasEsta - totalDiasOtra);
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
