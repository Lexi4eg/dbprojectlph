package com.example.infi_project_plh;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Anstaehendelauefe;
import model.AnstaehendelauefeDAO;

import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Properties;
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



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Laufveranstaltungen_ID.setCellValueFactory(new PropertyValueFactory<>("Laufveranstaltungen_ID"));
        Name.setCellValueFactory(new PropertyValueFactory<>("Name"));


        System.out.println(AnstaehendelauefeDAO.getVeranstaltung());
        tvAnstaehendelauefe.setItems(AnstaehendelauefeDAO.getVeranstaltung());

    }


    @FXML
    private void btnAnmelden() {
        System.out.println("You clicked me!");
    }
}