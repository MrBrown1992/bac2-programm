package at.fh.bac;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class MessagesController {
    @FXML
    private ListView mListview;
    @FXML
    private TextField mtxt_input;
    private String m = "message";
    private int i = 1;
    private Messages messages;

    //HashSet<Messages> hashSetOfMessages = new HashSet<>();
    //HashMap<Integer, Messages> MapOfMessages = new HashMap<Integer, Messages>();
    ArrayList<Messages> ListOfMessages = new ArrayList<>();
    ObservableList<String> items = FXCollections.observableArrayList();


    public void generateNewMessage(ActionEvent event) throws Exception {

        Messages xyz = new Messages(mtxt_input.getText(), m + i++);
        if (items.size() == 0) {
            items.add(xyz.getName());
            ListOfMessages.add(xyz);
            listViewUpdate();
            //System.out.println(ListofMessages.get(0).getName());
        } else {

            if (!items.contains(mtxt_input.getText())) {
                items.add(xyz.getName());
                ListOfMessages.add(xyz);

                listViewUpdate();
            } else {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setHeaderText("Input not valid");
                errorAlert.setContentText("Message already exists!");
                errorAlert.showAndWait();
            }

        }
        mtxt_input.clear();

    }



         /*


        for (Map.Entry<Integer,Messages> message: MapOfMessages.entrySet()){
            if (!message.getValue().getName().equals(mtxt_input.getText())){
                MapOfMessages.put(i++, new Messages(mtxt_input.getText(), m + i++));
                items.add(mtxt_input.getText());
                System.out.println(MapOfMessages);
                listViewUpdate();


            }
            else {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setHeaderText("Input not valid");
                errorAlert.setContentText("Message already exists!");
                errorAlert.showAndWait();}

        }

        mtxt_input.clear();

*/


        /*

        if (!MapOfMessages.containsValue(mtxt_input.getText()))
        {
            MapOfMessages.put(i++, new Messages(mtxt_input.getText(), m + i++));
            System.out.println(MapOfMessages.get(1).getName());

            for (Map.Entry<Integer, Messages> entry : MapOfMessages.entrySet()) {
                Messages value = entry.getValue();
                if (!items.contains(value.getName())) {
                    items.add(value.getName());
                }
            }
            listViewUpdate();


        }
        else {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Message already exists!");
            errorAlert.showAndWait();
        }
        mtxt_input.clear();

*/


    public void listViewUpdate() {

        mListview.setItems(items);

    }
}
