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
import java.sql.Date;
import java.sql.Time;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private TableView<Anstaehendelauefe> tvAnstaehendelauefe;

    @FXML
    private TableColumn<?,?> Nametf;
    @FXML
    private TableColumn<?,?> Laufveranstaltungen_IDtf;
    @FXML
    private TableColumn<?,?>Datetf;
    @FXML
    private TableColumn<?,?> Startzeittf;
    @FXML
    private Button btnAnmelden;
    @FXML
    private RadioButton rbm;
    @FXML
    private ToggleGroup tgGender;
    @FXML
    private RadioButton rbw;
    @FXML
    private RadioButton rbd;
    @FXML
    private TextField tfLastName;
    @FXML
    private TextField tfFirstName;
    @FXML
    private Button btnSafe;

    @FXML
    private TableColumn<?,?> Laufteilnahme_IDrl;
    @FXML
    private TableColumn<?,?> Zeitrl;
    @FXML
    private TableColumn<?,?>  Plazierungrl;
    @FXML
    private TableColumn<?,?>  Startnummerrl;
    @FXML
    private TableView<Rangliste>tvRangliste;


    @Override

    public void initialize(URL url, ResourceBundle rb) {
        //cbPersons.setItems(PersonDAO.getPersons());
        ObservableList<Anstaehendelauefe> myAnstaehendelauefeList = AnstaehendelauefeDAO.getVeranstaltung();
        System.out.println(myAnstaehendelauefeList);


        ObservableList<Rangliste> rangliste1 = RagnlisteDAO.getRangliste();
        System.out.println(rangliste1);

        Laufteilnahme_IDrl.setCellValueFactory(new PropertyValueFactory<>("Lautilnahme_ID"));
        Zeitrl.setCellValueFactory(new PropertyValueFactory<>("Zeit"));
        Plazierungrl.setCellValueFactory(new PropertyValueFactory<>("Plazierung"));
        Startnummerrl.setCellValueFactory(new PropertyValueFactory<>("Startnummer"));

        tvRangliste.setItems(rangliste1);


        Nametf.setCellValueFactory(new PropertyValueFactory<>("Name"));
        Laufveranstaltungen_IDtf.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Datetf.setCellValueFactory(new PropertyValueFactory<>("Datum"));
        Startzeittf.setCellValueFactory(new PropertyValueFactory<>("Zeit"));




        tvAnstaehendelauefe.setItems(myAnstaehendelauefeList);

    }


    @FXML
    private void btnAnmelden() {
        System.out.println("You clicked me!");
    }

}