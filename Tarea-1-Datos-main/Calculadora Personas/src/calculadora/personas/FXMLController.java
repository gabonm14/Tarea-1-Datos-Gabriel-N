/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calculadora.personas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * esta clase inserta todos los botones, labels, espacios de texto y choice boxes para la interfaz, creada por el scenebuilder
 * @author Gabriel Núñez
 */
public class FXMLController implements Initializable {

    @FXML
    private Button btnagregar;  //boton de agregar personas
    @FXML
    private Button btnmas; // boton de suma
    @FXML
    private Button btnmenos; //boton de resta
    @FXML
    private Button btnpor; // boton de multiplicacion
    @FXML
    private Button btnentre; //boton de division
    @FXML
    private TextField txtfiNom;  // espacio de texto del nombre
    @FXML
    private TextField txtfiedad; //espacio de texto para la edad
    @FXML
    private ChoiceBox<String> ddlProvin; //Drop down list de la provincia
    @FXML
    private ChoiceBox<String> ddlPer1; //drop down list para elegir a la persona 1
    @FXML
    private ChoiceBox<String> ddlPer2; // drop down list para elegir a la persona 2
    @FXML
    private Label labelresult; // label para escribir el resultado
    l1 lista= new l1(); //lista para guardar las cosas necesarias
    /**
     *
     * Inicia la clase controlador, creada tambien por el scenebuilder
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ddlProvin.getItems().setAll("San Jose","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limón"); //inserta la drop down list de las provincias desde un inicio
    }    

    @FXML
    private void agregarPersona(ActionEvent event) { //funcionamiento del boton agregar personas
        labelresult.setText("");
        if (lista.getSize()<=3){ //restriccion de que no existan mas de 4 elementos
            try{
                if (ddlProvin.getValue()!=null){ //restriccion de que se elija la provincia
                    if (txtfiNom.getText().length()!=0){ //restriccion de que el nombre no sea nulo
                        if (Integer.parseInt(txtfiedad.getText())>0){ // restriccion de que la edad de la persona no sea negativa ni 0
                            Persona persona = new Persona (txtfiNom.getText(),ddlPer1.getValue(),Integer.parseInt(txtfiedad.getText())); // crea el objeto persona para la persona insertada y le da los atributos
                            ddlPer1.getItems().add(persona.getNombre()); //inserta la persona en el drop down list de la persona 1
                            ddlPer2.getItems().add(persona.getNombre()); // inserta la persona en el drop down list de la persona 2
                            lista.agregar(new Node(persona));  //agrega la persona a la lista
                        } 
                        else{
                        labelresult.setText("Edad Invalida");     
                        }
                    } 
                    else{
                        labelresult.setText("Ingrese un nombre");
                    }
                }
                else{
                    labelresult.setText("Elija una provincia");
                }
            }
            catch(NumberFormatException e){
                labelresult.setText("Edad Invalida");               
            }
        }
        else{
            labelresult.setText("4 personas es el maximo permitido");
        }
        txtfiNom.setText("");
        txtfiedad.setText("");
        ddlProvin.setValue("");
        
    
        
    }
    

    @FXML
    private void sumaEdad(ActionEvent event) { //boton de suma
        int p1=lista.buscar(ddlPer1.getValue()).getEdad(); //agarra el valor de la edad de la persona 1 seleccionada y la mete en una variable
        int p2=lista.buscar(ddlPer2.getValue()).getEdad(); //agarra el valor de la edad de la persona 2 seleccionada y la mete en una variable
        int suma=p1+p2; //suma las variables
        String sum=Integer.toString(suma); //convierte la suma en un string para mostrarlo
        labelresult.setText(sum);
    }

    @FXML
    private void restaEdad(ActionEvent event) { //boton de resta
        int p1=lista.buscar(ddlPer1.getValue()).getEdad(); //agarra el valor de la edad de la persona 1 seleccionada y la mete en una variable
        int p2=lista.buscar(ddlPer2.getValue()).getEdad(); //agarra el valor de la edad de la persona 2 seleccionada y la mete en una variable
        int resta=p1-p2; // resta las variables
        String res=Integer.toString(resta); //convierte la resta en un string para mostrarlo
        labelresult.setText(res);
    }

    @FXML
    private void multiEdad(ActionEvent event) { //boton multiplicacion
        int p1=lista.buscar(ddlPer1.getValue()).getEdad(); //agarra el valor de la edad de la persona 1 seleccionada y la mete en una variable
        int p2=lista.buscar(ddlPer2.getValue()).getEdad(); //agarra el valor de la edad de la persona 2 seleccionada y la mete en una variable
        int mu = p1*p2; // multiplica las variables
        String mul=Integer.toString(mu); // convierte la multiplicacion en un string para mostrarlo
        labelresult.setText(mul);
    }

    @FXML
    private void diviEdad(ActionEvent event) { //boton division
        int p1=lista.buscar(ddlPer1.getValue()).getEdad(); //agarra el valor de la edad de la persona 1 seleccionada y la mete en una variable
        int p2=lista.buscar(ddlPer2.getValue()).getEdad(); //agarra el valor de la edad de la persona 2 seleccionada y la mete en una variable
        int divi=p1/p2; //divide las variables
        String div=Integer.toString(divi); //convierte la division en un string para mostrarlo
        labelresult.setText(div);
    }
    
}
