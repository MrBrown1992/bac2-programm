package at.fh.bac;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ResourceBundle;
import java.util.stream.Stream;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import static at.fh.bac.startController.owlFile;

public class ShowContentController implements Initializable {

    @FXML
    private TextArea previewTxtArea = new TextArea();


    @Override
    public void initialize(URL url, ResourceBundle rb){
        try {setTextArea();
            owlline();}
        catch (OWLOntologyCreationException e){e.printStackTrace();}

    }

    public void setTextArea() {
        previewTxtArea.appendText(readLineByLineJava8(owlFile.getFile().toString()));


    }

    private static String readLineByLineJava8(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public static void owlline() throws OWLOntologyCreationException {



        try {
            OWLOntologyManager man = OWLManager.createOWLOntologyManager();
            File file = owlFile.getFile();
            OWLOntology o = man.loadOntologyFromOntologyDocument(file);
            System.out.println(o);


        } catch (OWLOntologyCreationException e) {
            e.printStackTrace();
        }
    }
}
