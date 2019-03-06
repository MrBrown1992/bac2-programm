package at.fh.bac;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SceneController {

    /**
     * Function for switching between different Scenes
     * @param event
     * @param sceneName
     * @throws Exception
     */


    public void changeScene(ActionEvent event, String sceneName) throws Exception {
        Parent viewParent = FXMLLoader.load(getClass().getResource("/" + sceneName));
        Scene mainScene = new Scene(viewParent, 600, 400);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();


    }

    public static Stage getStage(ActionEvent event) {

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        return window;
    }


}
