/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class SistemaHotel {
    private Fecha fechahoy;
    private Empleado[] listaEmpleados;
    private int cantEmpleados;
    private Habitacion[] listaHabitaciones;
    private int cantHabitaciones;
    private Huesped[] listaHuespedes;
    private int cantHuespedes;
    private Reserva[] listaReservas;
    private int cantReservas;
    private Estadia[] listaEstadias;
    private int cantEstadias;
    private Factura[] listaFacturas;
    private int cantFacturas;
    private ServicioAdicional[] listaServicios;
    private int cantServicios;
    private final int MAX=100;
    
    public ServicioAdicional[] getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ServicioAdicional[] listaServicios) {
        this.listaServicios = listaServicios;
    }

    public int getCantServicios() {
        return cantServicios;
    }

    // GETTERS Y SETTERS
    public void setCantServicios(int cantServicios) {    
        this.cantServicios = cantServicios;
    }

    public Fecha getFechahoy() {
        return fechahoy;
    }

    public void setFechahoy(Fecha fechahoy) {
        this.fechahoy = fechahoy;
    }

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public Habitacion[] getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Huesped[] getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(Huesped[] listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public int getCantHuespedes() {
        return cantHuespedes;
    }

    public void setCantHuespedes(int cantHuespedes) {
        this.cantHuespedes = cantHuespedes;
    }

    public Reserva[] getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Reserva[] listaReservas) {
        this.listaReservas = listaReservas;
    }

    public int getCantReservas() {
        return cantReservas;
    }

    public void setCantReservas(int cantReservas) {
        this.cantReservas = cantReservas;
    }

    public Estadia[] getListaEstadias() {
        return listaEstadias;
    }

    public void setListaEstadias(Estadia[] listaEstadias) {
        this.listaEstadias = listaEstadias;
    }

    public int getCantEstadias() {
        return cantEstadias;
    }

    public void setCantEstadias(int cantEstadias) {
        this.cantEstadias = cantEstadias;
    }

    public Factura[] getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(Factura[] listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public int getCantFacturas() {
        return cantFacturas;
    }

    public void setCantFacturas(int cantFacturas) {
        this.cantFacturas = cantFacturas;
    }
    
    // CONSTRUCTOR
    
    public SistemaHotel(Fecha fechahoy) {
        this.fechahoy = fechahoy;

        this.listaEmpleados = new Empleado[MAX];
        this.cantEmpleados = 0;

        this.listaHabitaciones = new Habitacion[MAX];
        this.cantHabitaciones = 0;

        this.listaHuespedes = new Huesped[MAX];
        this.cantHuespedes = 0;

        this.listaReservas = new Reserva[MAX];
        this.cantReservas = 0;

        this.listaEstadias = new Estadia[MAX];
        this.cantEstadias = 0;

        this.listaFacturas = new Factura[MAX];
        this.cantFacturas = 0;
        
        this.listaServicios = new ServicioAdicional[MAX];
        this.cantServicios = 0;
    }

    // MÉTODOS DE ADMINISTRADOR
    
    public boolean registrarEmpleado(Empleado e) {
        if (cantEmpleados < MAX) {
            listaEmpleados[cantEmpleados] = e;
            cantEmpleados++;
            return true;
        }
        return false;
    }
    
    public boolean modificarEmpleado(Empleado empleadoModificado)
    {
        for(int i=0; i<cantEmpleados;i++)
        {
            if (this.listaEmpleados[i].getDni()==empleadoModificado.getDni())
            {
              this.listaEmpleados[i].setNombres(empleadoModificado.getNombres());
              this.listaEmpleados[i].setAppellidos(empleadoModificado.getAppellidos());
              this.listaEmpleados[i].setUsuario(empleadoModificado.getUsuario());
              this.listaEmpleados[i].setPassword(empleadoModificado.getPassword());
              this.listaEmpleados[i].setRol(empleadoModificado.getRol()); 
              
              return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEmpleado(int dni)
    {
        int indiceEncontrado = -1;
        
        for (int i = 0; i < cantEmpleados; i++) {
            if (listaEmpleados[i].getDni() == dni) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) 
        {
            for (int i = indiceEncontrado; i < cantEmpleados - 1; i++) 
            {
            listaEmpleados[i] = listaEmpleados[i + 1];
            }
            
            listaEmpleados[cantEmpleados - 1] = null;
            cantEmpleados--;
            
            return true;
        }
        
        return false;
    }
    
    public Empleado buscarEmpleado(int dni) {
    for (int i = 0; i < cantEmpleados; i++) 
    {
        if (listaEmpleados[i].getDni() == dni) 
        {
            return listaEmpleados[i];
        }
    }
    return null;
}

    public boolean registrarHabitacion(Habitacion h) {
        for(int i=0; i<cantHabitaciones; i++) 
        {
            if(listaHabitaciones[i].getNum() == h.getNum()) 
            {
                return false;
            }
        }
        
        if (cantHabitaciones < MAX) 
        {
            listaHabitaciones[cantHabitaciones] = h;
            cantHabitaciones++;
            return true;
        }
        return false;
    }
    
    public boolean eliminarHabitacion(int numero)
    {
        int indice = -1;
        // 1. Buscar la habitación por su número
        for (int i = 0; i < cantHabitaciones; i++) {
            if (listaHabitaciones[i].getNum() == numero) {
                indice = i;
                break;
            }
        }
        // 2. Si existe, la borramos moviendo el arreglo
        if (indice != -1) {
            for (int i = indice; i < cantHabitaciones - 1; i++) {
                listaHabitaciones[i] = listaHabitaciones[i + 1];
            }
            listaHabitaciones[cantHabitaciones - 1] = null; // Limpiar el último
            cantHabitaciones--;
            return true;
        }
        return false;
    }
    
    public boolean modificarHabitacion(Habitacion habitacionModificada)
    {
        for (int i=0;i<this.cantHabitaciones;i++)
        {
            if (this.listaHabitaciones[i].getNum()==habitacionModificada.getNum())
            {
                this.listaHabitaciones[i].setCapacidadMaxima(habitacionModificada.getCapacidadMaxima());
                this.listaHabitaciones[i].setPnoche(habitacionModificada.getPnoche());
                this.listaHabitaciones[i].setTipo(habitacionModificada.getTipo());
                this.listaHabitaciones[i].setEstado(habitacionModificada.getEstado());
                
                return true;
            }
        }
        return false;
    }

    public Habitacion buscarHabitacion(int numero) {
        for(int i=0; i<cantHabitaciones; i++) {
            if(listaHabitaciones[i].getNum() == numero) return listaHabitaciones[i];
        }
        return null;
    }

    // --- Servicios (Admin) ---
    public boolean registrarServicio(ServicioAdicional s) {
        if (cantServicios < MAX) {
            listaServicios[cantServicios] = s;
            cantServicios++;
            return true;
        }
        return false;
    }
    
    public boolean modificarServicio(ServicioAdicional servicioModificado) {
        // Buscamos el servicio por su ID único
        for (int i = 0; i < cantServicios; i++) {
            if (listaServicios[i].getNombre().equals(servicioModificado.getNombre())) {
                
                // Actualizamos los datos (Nombre y Precio)
                listaServicios[i].setNombre(servicioModificado.getNombre());
                listaServicios[i].setPreciounitario(servicioModificado.getPreciounitario());
                
                return true; // Éxito
            }
        }
        return false; // No encontrado
    }
    
    public boolean eliminarServicio(String nombre) {
        int indice = -1;
        
        // 1. Buscar la posición
        for (int i = 0; i < cantServicios; i++) {
            if (listaServicios[i].getNombre().equals(nombre)) {
                indice = i;
                break;
            }
        }

        // 2. Si existe, eliminar y reordenar
        if (indice != -1) {
            for (int i = indice; i < cantServicios - 1; i++) {
                listaServicios[i] = listaServicios[i + 1];
            }
            listaServicios[cantServicios - 1] = null; // Limpiar rastro
            cantServicios--;
            
            return true;
        }
        return false;
    }


    // MÉTODOS DE RECEPCIONISTA
    
    public boolean registrarHuesped(Huesped h) {
        // Validar DNI duplicado
        for(int i=0; i<cantHuespedes; i++) {
            if(listaHuespedes[i].getDni() == h.getDni()) return false;
        }

        if (cantHuespedes < MAX) {
            listaHuespedes[cantHuespedes] = h;
            cantHuespedes++;
            return true;
        }
        return false;
    }
    
    public boolean modificarHuesped(Huesped huespedModificado) {
        // Buscamos al huésped por su DNI (que no debe cambiar)
        for (int i = 0; i < cantHuespedes; i++) {
            if (listaHuespedes[i].getDni() == huespedModificado.getDni()) {
                
                // Actualizamos los datos editables
                listaHuespedes[i].setNombres(huespedModificado.getNombres());
                listaHuespedes[i].setApellidos(huespedModificado.getApellidos());
                listaHuespedes[i].setTelefono(huespedModificado.getTelefono());
                listaHuespedes[i].setEmail(huespedModificado.getEmail());
                
                return true; // Éxito
            }
        }
        return false; // No encontrado
    }
    
    public boolean eliminarHuesped(int dni) {
        int indice = -1;
        
        for (int i = 0; i < cantHuespedes; i++) {
            if (listaHuespedes[i].getDni() == dni) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            for (int i = indice; i < cantHuespedes - 1; i++) {
                listaHuespedes[i] = listaHuespedes[i + 1];
            }
            listaHuespedes[cantHuespedes - 1] = null; // Limpiar rastro
            cantHuespedes--;
            
            return true;
        }
        return false;
    }
    
    public Huesped buscarHuesped(int dni) {
        for(int i=0; i<cantHuespedes; i++) {
            if(listaHuespedes[i].getDni() == dni) return listaHuespedes[i];
        }
        return null;
    }

    public boolean crearReserva(Reserva r) {
        
        // PASO 1: Validar si las fechas tienen sentido (Inicio < Fin)
        if (r.getFechaInicio().esMayorAOtraFecha(r.getFechaFin())) {
            // Error: La fecha de inicio no puede ser mayor a la de fin
            return false; 
        }

        // PASO 2: Validar la disponibilidad usando el método nuevo
        boolean hayLugar = validarDisponibilidad(r.getTipoHabitacion(), r.getFechaInicio(), r.getFechaFin());
        
        if (!hayLugar) {
            // No hay disponibilidad para esas fechas y tipo
            return false; 
        }

        // PASO 3: Si pasó las validaciones, guardamos la reserva
        if (cantReservas < MAX) {
            listaReservas[cantReservas] = r;
            cantReservas++;
            return true;
        }
        
        return false; // Arreglo lleno
    }
    
    public boolean validarDisponibilidad(String tipoHabitacion, Fecha inicioSolicitado, Fecha finSolicitado) {
        int capacidadTotalDelTipo = 0;
        int habitacionesOcupadas = 0;

        // 1. Contar cuántas habitaciones de este tipo existen en el hotel
        for (int i = 0; i < cantHabitaciones; i++) {
            if (listaHabitaciones[i].getTipo().equalsIgnoreCase(tipoHabitacion)) {
                capacidadTotalDelTipo++;
            }
        }

        // 2. Contar cuántas reservas chocan con las fechas solicitadas
        for (int i = 0; i < cantReservas; i++) {
            Reserva r = listaReservas[i];
            
            if (r.getTipoHabitacion().equalsIgnoreCase(tipoHabitacion) && 
               !r.getEstado().equalsIgnoreCase("Cancelada")) {
                
 
                
                boolean reservaTerminaAntes = r.getFechaFin().esMenorAOtraFecha(inicioSolicitado);
                boolean reservaEmpiezaDespues = r.getFechaInicio().esMayorAOtraFecha(finSolicitado);

                // Si NO termina antes Y NO empieza después, entonces choca (está ocupada)
                if (!(reservaTerminaAntes || reservaEmpiezaDespues)) {
                    habitacionesOcupadas++;
                }
            }
        }

        // 3. Si hay más habitaciones que reservas cruzadas, entonces SÍ hay lugar
        return capacidadTotalDelTipo > habitacionesOcupadas;
    }

    
    public Estadia registrarCheckIn(Reserva reserva) {
        // 1. Buscar una habitación disponible del tipo solicitado
        Habitacion habAsignada = null;
        
        for(int i=0; i<cantHabitaciones; i++) {
            // Verifica tipo correcto Y estado "Limpia"
            if(listaHabitaciones[i].getTipo().equalsIgnoreCase(reserva.getTipoHabitacion()) && 
               listaHabitaciones[i].getEstado().equalsIgnoreCase("Limpia")) {
                
                habAsignada = listaHabitaciones[i];
                break; // Encontramos una, dejamos de buscar
            }
        }
        
        if (habAsignada != null) {
            // 2. Cambiar estado a "Ocupada"
            habAsignada.setEstado("Ocupada");
            
            // 3. Crear la Estadía (ID autogenerado simple: cantEstadias + 1)
            Estadia nuevaEstadia = new Estadia(cantEstadias + 1, reserva, habAsignada);
            
            // 4. Asignar fecha de ingreso real (Fecha del sistema)

            
            // 5. Guardar
            listaEstadias[cantEstadias] = nuevaEstadia;
            cantEstadias++;
            
            return nuevaEstadia;
        }
        return null; // No hay habitaciones disponibles
    }

    public boolean registrarConsumo(Estadia estadia, ServicioAdicional servicio, int cantidad) {
        if (estadia != null && estadia.getEstado().equalsIgnoreCase("Activa")) {
            // Delegamos a la clase Estadia, pasando la fecha actual del sistema
            return estadia.Registrarconsumo(servicio, this.fechahoy, cantidad);
        }
        return false;
    }

    public Factura registrarCheckOut(Estadia estadia, String metodoPago) {
        if (estadia != null && estadia.getEstado().equalsIgnoreCase("Activa")) {
            
            // 1. Establecer fecha de salida real
            estadia.setFechasalida(this.fechahoy);
            
            // 2. Calcular días finales y cerrar estadía
            estadia.calcularNoches();
            estadia.setEstado("Finalizada");
            
            // 3. Liberar la habitación (Pasa a estado "Sucia")
            estadia.getHabitacion().setEstado("Sucia");
            
            // 4. Generar la Factura (Snapshot de los totales)
            Factura nuevaFactura = new Factura(estadia, metodoPago);
            
            // 5. Guardar la factura en el historial
            if(cantFacturas < MAX) {
                listaFacturas[cantFacturas] = nuevaFactura;
                cantFacturas++;
            }
            
            return nuevaFactura;
        }
        return null;
    }

    // MÉTODOS DE REPORTES
    
    public String generarReporteOcupacion() {
        String reporte = "=== REPORTE DE ESTADO DE HABITACIONES ===\n";
        for(int i=0; i<cantHabitaciones; i++) {
            reporte += listaHabitaciones[i].generarReporte() + "\n--------------------\n";
        }
        return reporte;
    }

    public String generarReporteIngresos(Fecha inicio, Fecha fin) {
        String reporte = "=== REPORTE DE INGRESOS POR FECHAS ===\n";
        double sumaHabitacion = 0;
        double sumaServicios = 0;
        double sumaTotal = 0;

        for(int i=0; i<cantFacturas; i++) {
            Factura f = listaFacturas[i];
            Fecha fechaFac = f.getEmision();

            // Filtro de fechas (Mayor o igual al inicio Y Menor o igual al fin)
     
            boolean validaInicio = fechaFac.esMayorAOtraFecha(inicio) || fechaFac.esIgualAOtraFecha(inicio);
            boolean validaFin = fechaFac.esMenorAOtraFecha(fin) || fechaFac.esIgualAOtraFecha(fin);

            if(validaInicio && validaFin) {
                reporte += f.generarReporte() + "\n";
                
                sumaHabitacion += f.getTotalHabitacion();
                sumaServicios += f.getTotalServicios();
                sumaTotal += f.getTotalGeneral();
            }
        }
        
        reporte += "\n================ RESUMEN ================\n";
        reporte += "Total Alojamiento: S/. " + sumaHabitacion + "\n";
        reporte += "Total Servicios:   S/. " + sumaServicios + "\n";
        reporte += "GRAN TOTAL:        S/. " + sumaTotal;
        
        return reporte;
    }
    
    
    public Empleado buscarRefdXUsuario(String usuario){
        Empleado resp = null;
        for(int i=0;i<cantEmpleados;i++){
        if(listaEmpleados[i].getUsuario().equalsIgnoreCase(usuario)){
            resp = listaEmpleados[i];
        }
    }
        return resp;
    }
    
    public Empleado buscarRefdXDNIEmp(int dni){
        Empleado resp = null;
        for(int i=0;i<cantEmpleados;i++){
        if(listaEmpleados[i].getDni() == dni){
            resp = listaEmpleados[i];
        }
    }
        return resp;
    }
    
    public Huesped buscarRefdXDNI(int dni){
        Huesped resp = null;
        for(int i=0;i<cantHuespedes;i++){
        if(listaHuespedes[i].getDni() == dni){
            resp = listaHuespedes[i];
        }
    }
        return resp;
    }
    
    public Reserva buscarRefdXId(int IdReserva){
        Reserva resp = null;
        for(int i=0;i<cantReservas;i++){
        if(listaReservas[i].getIdReserva() == IdReserva){
            resp = listaReservas[i];
        }
    }
        return resp;
    }
    
    public Estadia buscarRefxId(int IdEstadia){
        Estadia resp = null;
        for(int i=0;i<cantEstadias;i++){
        if(listaEstadias[i].getId() == IdEstadia){
            resp = listaEstadias[i];
        }
    }
        return resp;
    }
    
    public ServicioAdicional buscarRefxNombre(String nombre){
        ServicioAdicional resp = null;
        for(int i=0;i<cantServicios;i++){
        if(listaServicios[i].getNombre().equals(nombre)){
            resp = listaServicios[i];
        }
    }
        return resp;
    }
    
    public String verInfoEmpleado(Empleado ref){
        return "Nombres: "+ref.nombres+
            "\nApellidos: "+ref.appellidos+
            "\nDNI: "+ref.dni+
            "\nRol: "+ref.rol+
            "\nUsuario: "+ref.usuario+
            "\nContraseña: "+ref.password;
    }
    
}
