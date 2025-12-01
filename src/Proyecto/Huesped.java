/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author xxjim
 */
public class Huesped implements IReportable{
    private int dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;

    public Huesped(int dni, String nombres, String apellidos, String telefono, String email) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String generarReporte() {
        return "DNI: " + this.dni +
                "\nNombres: " + this.nombres +
                "\nApellidos: " + this.apellidos +
                "\nTelefono: " + this.telefono +
                "\nemail: " + this.email;
    }
    

    
    
}
