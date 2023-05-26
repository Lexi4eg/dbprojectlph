package laufveranstaltung;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Person;


public class FXMLDocumentController implements Initializable {
        private ListProperty <Person> listProperty = new SimpleListProperty();
        private ObservableList<Person> persons = FXCollections.observableArrayList(
                new Person(1, "Agg", "Stefan", 1985, "AUT"),
                new Person(2, "Boadnl", "Rene", 1984, "IT"),
                new Person(3, "Fuchs", "Klaus", 1984, "DE")
        );
        
        
    @FXML
    private ComboBox<Person> cbPersons;
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private Button btnSafe;
    @FXML
    private RadioButton rbm;
    @FXML
    private RadioButton rbw;
    @FXML
    private RadioButton rbd;
    @FXML
    private DatePicker dpGebd;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbPersons.itemsProperty().bind(listProperty);
        listProperty.setValue(persons);
    }    

    @FXML
    private void handleBtnSaveAction(ActionEvent event) {
        Person p = cbPersons.getSelectionModel().getSelectedItem();
        //check if selected
        
        if (p == null)
            return;
        
        p.setFirstName(tfFirstName.getText());
        p.setLastName(tfLastName.getText());
        p.setdpGebd(dpGebd.getDate());

        int inx = cbPersons.getSelectionModel().getSelectedIndex();
        persons.set(inx, p);
        
    }
    
}
