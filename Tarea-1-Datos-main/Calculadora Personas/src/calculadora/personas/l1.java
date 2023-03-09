/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.personas;

/**
 *La clase de l1 es la creacion de la lista enlazada y todos los metodos que resulten utiles para poder realizar la calculadora.
 * @author Gabriel Núñez
 */
public class l1 { //este codigo fue tomado de la presentacion de Algoritmos y estructuras de datos del II Semestre 2022
    private Node head;
    private int size;
    
    public l1(){ //crea la lista vacia
        this.head = null;
        this.size = 0;
        
    }
    public int getSize (){ //devuelve el tamaño de la lista

        return this.size;
    }

    public Persona buscar(String nombre){ //busca el nombre de un objeto persona
        Node temp=this.head; //establece un temporal como cabeza
        while (temp.getData().getNombre()!=nombre){ //mientras que el valor del temporal sea distinto del nombre que se busca, pasa al siguiete, hasta que lo encuentre
            temp=temp.getNext();
        }
        return temp.getData();
    }
    public void agregar(Node node){ //metodo para agregar cosas a la lista
        Node temp;
        if (this.head==null){
            this.head=node;
        }
        else{
            temp=this.head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
        this.size++;

    }
    public void setHead(Node node){ //establece la cabeza de la lista

        this.head=node;
    }
    public void setSize(int size){ //establece el tamaño de la lista

        this.size=size;
    }

    public Node getHead(){

        return this.head;
    }
    
}



