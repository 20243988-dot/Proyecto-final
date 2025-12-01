/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class Reserva {
    private int idReserva;
    private Fecha fechaInicio;
    private Fecha fechaFin;
    private String estado; //"Pendiente"; "Confirmado"
    private String tipoHabitacion; //"Suite"; "Doble; "Simple"
    private Huesped huesped;

    public Reserva(int idReserva, Fecha fechaInicio, Fecha fechaFin, String tipoHabitacion, Huesped huesped) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoHabitacion = tipoHabitacion;
        this.huesped = huesped;
    }

    

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
    
    
    
    public boolean esVigente() {
        boolean bool = true;
        if(this.estado.equalsIgnoreCase("Pendiente")) {
            bool = false;
            
        }
        else if(this.estado.equalsIgnoreCase("Confirmado")) {
            bool = true;
            
        }
        else {
            System.out.println("Estado incorrecto. Solo puede ser 'Pendiente' o 'Confirmado'.");
            bool = false;
            
        }
        return bool;
        
    }
    
    public String verInfo() {
        return "ID reserva: " + this.idReserva +
                "\nHuesped asociado:\n" + this.huesped.getDni() +
                "\nEstado: " + this.estado +
                "\nFecha de inicio: " + this.fechaInicio.verFecha() +
                "\nFecha de fin: " + this.fechaFin.verFecha() +
                "\nTipo de habitación: " + this.tipoHabitacion;
        
    }
    
}
