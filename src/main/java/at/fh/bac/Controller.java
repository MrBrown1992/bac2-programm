package at.fh.bac;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import java.util.HashMap;



public class Controller {
    @FXML private TextField txt_input;
    int i = 1;


    HashMap<String,Integer> MapOfSubjects = new HashMap<String,Integer>();

    public void pressButton (ActionEvent event){
         System.out.println(txt_input.getText());
         MapOfSubjects.put(txt_input.getText(),i++);

         System.out.println(MapOfSubjects.toString());


    }







}
