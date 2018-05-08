/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_usuarios;

/**
 *
 * @author the_d
 */
public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private String cargo;
    private String estado;

    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.edad = 0;
        this.cargo = "";
        this.estado = "";
    }

    public Persona(String dni, String nombre, int edad, String cargo, String estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", cargo=" + cargo + ", estado=" + estado + '}';
    }
    
    
    
    
}
