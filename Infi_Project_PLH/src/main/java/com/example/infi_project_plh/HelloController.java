package com.example.infi_project_plh;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Anstaehendelauefe;
import model.AnstaehendelauefeDAO;
import model.RagnlisteDAO;
import model.Rangliste;

import java.net.URL;
import java.sql.Time;
import java.util.Date;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private TableView<Anstaehendelauefe> tvAnstaehendelauefe;

    @FXML
    private TableColumn<Anstaehendelauefe,String> Nametf;
    @FXML
    private TableColumn<Anstaehendelauefe,Integer> Laufveranstaltungen_IDtf;
    @FXML
    private TableColumn<Anstaehendelauefe, Date>Datetf;
    @FXML
    private TableColumn<Anstaehendelauefe,Time> Startzeittf;


    @FXML
    private TableView<Rangliste>tvRangliste;
    @FXML
    private TableColumn<Rangliste,Integer> Laufteilnahme_IDrl;
    @FXML
    private TableColumn<Rangliste, Time> Zeitrl;
    @FXML
    private TableColumn<Rangliste,Integer>  Plazierungrl;
    @FXML
    private TableColumn<Rangliste, Integer>  Startnummerrl;
    @FXML
    private TextField Vorname;
    @FXML
    private TextField Nachname;
    @FXML
    private TextField Adresse;


    @Override

    public void initialize(URL url, ResourceBundle rb) {
        Laufteilnahme_IDrl.setCellValueFactory(new PropertyValueFactory<Rangliste, Integer>("Lautilnahme_ID"));
        Zeitrl.setCellValueFactory(new PropertyValueFactory<Rangliste, Time>("Zeit"));
        Plazierungrl.setCellValueFactory(new PropertyValueFactory<Rangliste, Integer>("Plazierung"));

        Startnummerrl.setCellValueFactory(new PropertyValueFactory<Rangliste, Integer>("Startnummer"));

        tvRangliste.setItems(RagnlisteDAO.getRangliste());

        Nametf.setCellValueFactory(new PropertyValueFactory<Anstaehendelauefe, String>("Nameanstaehendelauf"));
        Laufveranstaltungen_IDtf.setCellValueFactory(new PropertyValueFactory<Anstaehendelauefe, Integer>("Laufveranstaltungen_ID"));
        Datetf.setCellValueFactory(new PropertyValueFactory<Anstaehendelauefe, Date>("Datum"));
        Startzeittf.setCellValueFactory(new PropertyValueFactory<Anstaehendelauefe, Time>("Startzeit"));
        tvAnstaehendelauefe.setItems(AnstaehendelauefeDAO.getVeranstaltung());


    }

    @

}