/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import myproject.BasePackage.fileHandling;

/**
 * FXML Controller class
 *
 * @author Iftekharul Alam
 */
public class MainInterfaceController implements Initializable {

    @FXML
    private MenuItem quitMenuItem;
    @FXML
    private TextArea myinput;
    @FXML
    private Button convertbutton;
    @FXML
    private Button savebutton;
    @FXML
    private TextArea myoutput;
    @FXML
    private Button myoutputClearButton;
    @FXML
    private Button myinputClearButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void newMenuItem(ActionEvent event) {
    }

    @FXML
    private void saveMenuitem(ActionEvent event) {
    }

    @FXML
    private void quitMenuItemClicked(ActionEvent event) {
    }

    @FXML
    private void convertButtonClicked(ActionEvent event) {

        String m = myinput.getText();
        myoutput.setText(m);
        myoutput.setFont(Font.font("Verdana", 20));
    }

    @FXML
    private void savebuttonClicked(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("HTML Files", "*.htm")
        );
        Stage s = new Stage();
        File selectedFile = fileChooser.showSaveDialog(s);
        if (selectedFile != null) {
            fileHandling f = new fileHandling();
            f.DataSave(myoutput.getText(), selectedFile);
        }

    }

    @FXML
    private void myoutputClearButtonClicked(ActionEvent event) {
    }

    @FXML
    private void myinputClearButtonClicked(ActionEvent event) {
    }

}
