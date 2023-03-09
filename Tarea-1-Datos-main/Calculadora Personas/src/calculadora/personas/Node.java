/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.personas;

/**
 *La clase nodo para que funcione la lista enlazada
 * @author Gabriel Núñez
 */
public class Node {  //este codigo fue tomado de la presentacion de Algoritmos y estructuras de datos del II Semestre 2022
    private Persona data;
    private Node next;
    
    public Node (Persona data){ //recoge la informacion de la persona
        this.next=null;
        this.data=data;      
    }
    public Persona getData(){ //da la informacion de la persona
        return this.data;
               
    }
    public void setData(Persona data){ //le pone la informacion a la persona
        this.data = data;
        
    }
    public void setNext(Node nodo){ // le pone valor al nodo siguientr
        this.next= nodo;
        
    }
    public Node getNext (){ // recoge el valor del nodo siguiente
        return this.next;
        
    }
}
