/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class Estadia {
    private int id;
    private Reserva reserva;
    private int noches;
    private Habitacion habitacion;
    private ConsumoServicio[] consumosservicios;
    private int cantconsumos;
    private Fecha fechaingreso;
    private Fecha fechasalida;
    private String estado;

    public Estadia(int id, Reserva reserva, Habitacion habitacion) {
        this.id = id;
        this.reserva = reserva;
        this.habitacion = habitacion;
        this.consumosservicios=new ConsumoServicio[100];
        this.cantconsumos=0;
        this.estado="Activa";
        this.fechaingreso=this.reserva.getFechaInicio();
        this.fechasalida=this.reserva.getFechaFin();
        
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public ConsumoServicio[] getConsumosservicios() {
        return consumosservicios;
    }

    public void setConsumosservicios(ConsumoServicio[] consumosservicios) {
        this.consumosservicios = consumosservicios;
    }

    public int getCantconsumos() {
        return cantconsumos;
    }

    public void setCantconsumos(int cantconsumos) {
        this.cantconsumos = cantconsumos;
    }

    public Fecha getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Fecha fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Fecha getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Fecha fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void calcularNoches() {
        this.noches = this.fechaingreso.calcularDiferenciaDiasConOtraFecha(this.fechasalida);
    
        if (this.noches <= 0) {
            this.noches = 1;
    }
}
    
    public boolean Registrarconsumo(ServicioAdicional servicio, Fecha fecha,int cantidad)
    {
        if (!this.estado.toLowerCase().equalsIgnoreCase("activa"))
        {
            return false;
        }
        
        if(this.cantconsumos>=this.consumosservicios.length)
        {
            return false;
        }
        
        ConsumoServicio nuevoConsumo=new ConsumoServicio(cantidad,fecha,servicio);
        this.consumosservicios[this.cantconsumos]=nuevoConsumo;
        this.cantconsumos++;
        return true;
    }
    
    public double calcularTotalHabitacion()
    {
        return this.noches*this.habitacion.getPnoche();
    }
    
    public double calcularTotalServicios()
    {
        double total=0;
        for (int i=0; i<this.cantconsumos;i++)
        {
            total=total+this.consumosservicios[i].calcularSubtotal();
        }
        return total;
    }
    
    public double calcularTotalgeneral()
    {
        return this.calcularTotalHabitacion()+this.calcularTotalServicios();
    }
    
    public String VerInfo()
    {
        String info="ID: "+this.id+
                "\nHuesped: "+this.reserva.getHuesped().getApellidos()+
                "\nHabitación: "+this.habitacion.getNum()+
                "\nFecha de entrada: "+this.fechaingreso.verFecha()+
                "\nFecha de salida: "+this.fechasalida.verFecha()+
                "\nEstado: "+this.estado+
                "\nConsumo de servicios: ";
        
        if (this.cantconsumos==0)
        {
            info=info+"\n - Ninguno";
            
        }
        else
        {
            for (int i=0;i<this.cantconsumos;i++)
            {
                String nombreServicio=this.consumosservicios[i].getServicio().getNombre();
                int cantidad=this.consumosservicios[i].getCantidad();
                info=info+"\n - "+ nombreServicio + " (Cantidad: " +cantidad +")";
            }
        }
        return info;
    }
    
    
}
