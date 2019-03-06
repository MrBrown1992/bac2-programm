package at.fh.bac;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

import java.io.File;

public class startController {

    public File file;
    public static OwlFile owlFile = new OwlFile();

    private SceneController sceneController = new SceneController();

    public void pressNewPBtn(ActionEvent event) throws Exception {
        sceneController.changeScene(event, "newProcess.fxml");

    }

    public void pressLoadBtn(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("OWL files (*.owl)", "*.owl");
        fileChooser.getExtensionFilters().add(extFilter);

        file = fileChooser.showOpenDialog(sceneController.getStage(event));
        owlFile.setFile(file);
        sceneController.changeScene(event, "showContent.fxml");


    }


}
