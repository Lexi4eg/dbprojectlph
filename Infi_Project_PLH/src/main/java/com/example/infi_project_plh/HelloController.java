package com.example.infi_project_plh;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import model.Anstaehendelauefe;
import model.AnstaehendelauefeDAO;

import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private Anstaehendelauefe anstaehendelauefe;

    @FXML
    private TableView<Anstaehendelauefe> tvAnstaehendelauefe;

    @FXML               //Zeilenobjektklasse, M// emberklasse
    private TableColumn<Anstaehendelauefe, String> Name;
    @FXML
    private TableColumn<Anstaehendelauefe, Integer> Laufveranstaltungen_ID;
    @FXML
    private TableColumn<Anstaehendelauefe, Date> Date;
    @FXML
    private TableColumn<Anstaehendelauefe, Time> Startzeit;
    @FXML
    private Button btnAnmelden;
    @FXML
    private Button btnSafe;

    @FXML
    private TextField tfLastName;
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfBDate;
    @FXML
    private RadioButton rbm;
    @FXML
    private RadioButton rbw;
    @FXML
    private RadioButton rbd;

    @Override

    public void initialize(URL url, ResourceBundle rb) {
        //cbPersons.setItems(PersonDAO.getPersons());
        ObservableList<Anstaehendelauefe> myAnstaehendelauefeList = AnstaehendelauefeDAO.getVeranstaltung();
        System.out.println(myAnstaehendelauefeList);


        tvAnstaehendelauefe.setItems(myAnstaehendelauefeList);
    }

    @FXML
    private void handleBtnSaveAction(ActionEvent event) {
        Person p = cbPersons.getSelectionModel().getSelectedItem();

        if (p == null)
            return;

        p.setLastName(tfLastName.getText());
        p.setFirstName(tfFirstName.getText());
        p.setdpGebd(dpBDate.getDate());

        int inx = cbPersons.getSelectionModel().getSelectedIndex();
        persons.set(inx, p);

    }
    @FXML
    private void btnAnmelden() {
        System.out.println("You clicked me!");
    }

}