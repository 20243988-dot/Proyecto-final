/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class ConsumoServicio {
    private int idConsumo;
    private int cantidad;
    private Fecha fechaconsumo;
    private ServicioAdicional servicio;

    public ConsumoServicio(int cantidad, Fecha fechaconsumo, ServicioAdicional servicio) {
        this.cantidad = cantidad;
        this.fechaconsumo = fechaconsumo;
        this.servicio = servicio;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Fecha getFechaconsumo() {
        return fechaconsumo;
    }

    public void setFechaconsumo(Fecha fechaconsumo) {
        this.fechaconsumo = fechaconsumo;
    }

    public ServicioAdicional getServicio() {
        return servicio;
    }

    public void setServicio(ServicioAdicional servicio) {
        this.servicio = servicio;
    }
    
    
    public double calcularSubtotal()
    {
        double precio=this.servicio.getPreciounitario();
                
    return precio*this.cantidad;    
    }
    
}
