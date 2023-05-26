/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllsdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Martina
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private Button btnSafe;
    @FXML
    private RadioButton rbm;
    @FXML
    private ToggleGroup tgCountries;
    @FXML
    private RadioButton rbw;
    @FXML
    private RadioButton rbd;
    @FXML
    private DatePicker dpGebd;
    @FXML
    private ComboBox<?> cbPersons;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtnSaveAction(ActionEvent event) {
    }

    @FXML
    private void handlecbPersonsAction(ActionEvent event) {
    }
    
}
