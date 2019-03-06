package at.fh.bac;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class NewProcessController {

    private SceneController sceneController = new SceneController();
    @FXML
    private TextField txt_input;
    int i = 1;
    @FXML private ListView list_Subjects;
    private Frame frame;


    HashMap<Integer, String> MapOfSubjects = new HashMap<Integer, String>();
    ObservableList<String> items = FXCollections.observableArrayList();


    public void  pressOkBtn(ActionEvent event) throws Exception {
        if (!MapOfSubjects.containsValue(txt_input.getText())) {

            //System.out.println(txt_input.getText());
            MapOfSubjects.put(i++, txt_input.getText());

            //System.out.println(MapOfSubjects.toString());

            //MapOfSubjects.forEach((k,v) -> { items.add(v);});

            for (Map.Entry<Integer, String> entry : MapOfSubjects.entrySet()) {
                String value = entry.getValue();
                if (!items.contains(value)) {
                    items.add(value);
                }

            }
            //System.out.println(items);
            listViewUpdate();

        }
        else {
            //Notifications.create() .title("Title Text") .text("Hello World 0!") .showWarning();



            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Subject already exists!");
            errorAlert.showAndWait();


           /* JOptionPane.showMessageDialog(frame,
                    "This Subject already exists!",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);

                    */

        }

        txt_input.clear();
    }


    public void listViewUpdate(){

        list_Subjects.setItems(items);

    }

    public void pressBackBtn(ActionEvent event) throws Exception {
        sceneController.changeScene(event, "start.fxml");

    }

    public void pressNextBtn(ActionEvent event) throws Exception {
        sceneController.changeScene(event, "messages.fxml");

    }
}
