/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.personas;

/**
 *La clase persona es la clase encargada de darle los atributos del nombre, edad y provincia a cada persona agregada para la calculadora
 * @author Gabriel Núñez
 */
public class Persona {
    
    private String nombre;
    private String provincia;
    private int edad;
    
    public Persona(String nombre, String provincia, int edad){ //establece los atributos del nombre, edad y provincia
        this.nombre=nombre;
        this.provincia=provincia;
        this.edad=edad;
        
               
    }
    public void setNombre(String nombre){ //establece el nombre al objeto

        this.nombre=nombre;
    }
    public void setProvincia(String provincia){ //establece la provincia al objeto

        this.provincia=provincia;
    }

    public void setEdad(int edad){ // establece la edad al objeto
        this.edad=edad;
       
    }
    public String getNombre(){ //devuelve el nombre
        return this.nombre;
        
    }
    public String getProvincia(){ //devuelve la provincia
        return this.provincia;
        
    }
    public int getEdad(){ //devuelve la edad
        return this.edad;
        
    }
}
