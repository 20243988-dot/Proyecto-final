/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class Habitacion implements IReportable{
    private int num;
    private int capacidadMaxima;
    private float pnoche;
    private String tipo;
    private String estado;

    public Habitacion(int num, int capacidadMaxima, float pnoche, String tipo) {
        this.num = num;
        this.capacidadMaxima = capacidadMaxima;
        this.pnoche = pnoche;
        this.tipo = tipo;
        this.estado = "Limpia";
    }
    
    public Habitacion(int num, int capacidadMaxima, float pnoche, String tipo, String estado) {
        this.num = num;
        this.capacidadMaxima = capacidadMaxima;
        this.pnoche = pnoche;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public float getPnoche() {
        return pnoche;
    }

    public void setPnoche(float pnoche) {
        this.pnoche = pnoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String generarReporte() {
    return "Habitación: "+this.num+
            "\nTipo: "+this.tipo+
            "\nCapacidad máxima: "+this.capacidadMaxima+
            "\nEstado: "+this.estado+
            "\nPrecio por noche: "+this.pnoche;
    }
    
    
}
