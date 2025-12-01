/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class Factura implements IReportable{
    private int id;
    private Estadia estadia;
    private Fecha emision;
    private double totalHabitacion;
    private double totalServicios;
    private double totalGeneral;
    private String metodoPago;

    public Factura(Estadia estadia,String metodoPago) {
        this.estadia = estadia;
        this.metodoPago = metodoPago;
        this.id=this.estadia.getId();
        this.totalHabitacion=this.estadia.calcularTotalHabitacion();
        this.totalServicios=this.estadia.calcularTotalServicios();
        this.totalGeneral=this.estadia.calcularTotalgeneral();
        this.emision=this.estadia.getFechasalida();
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

    public Fecha getEmision() {
        return emision;
    }

    public void setEmision(Fecha emision) {
        this.emision = emision;
    }

    public double getTotalHabitacion() {
        return totalHabitacion;
    }

    public void setTotalHabitacion(double totalHabitacion) {
        this.totalHabitacion = totalHabitacion;
    }

    public double getTotalServicios() {
        return totalServicios;
    }

    public void setTotalServicios(double totalServicios) {
        this.totalServicios = totalServicios;
    }

    public double getTotalGeneral() {
        return totalGeneral;
    }

    public void setTotalGeneral(double totalGeneral) {
        this.totalGeneral = totalGeneral;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    @Override
    public String generarReporte() 
    {
        return "Número de factura: "+this.id+
                "\nFecha: "+this.emision.verFecha()+
                "\nHuesped: "+this.estadia.getReserva().getHuesped().getNombres()+this.estadia.getReserva().getHuesped().getApellidos()+
                "\nMétodo de pago: "+this.metodoPago+
                "\nTotal Habitación: "+this.totalHabitacion+
                "\nTotal Servicios: "+this.totalServicios+
                "\nTotal: "+this.totalGeneral+" soles.";
    }
    
    
    
    
    
    
    
}
