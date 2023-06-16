package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

import java.sql.Time;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Rangliste  {

    private int Lautilnahme_ID;
    private int  Veranstaltungs_ID;
    private Time  Zeit;
    private int  Plazierung;
    private int  Startnummer;

    public Rangliste(int lautilnahme_ID, int veranstaltungs_ID, Time zeit, int plazierung, int startnummer) {
        Lautilnahme_ID = lautilnahme_ID;
        Veranstaltungs_ID = veranstaltungs_ID;
        Zeit = zeit;
        Plazierung = plazierung;
        Startnummer = startnummer;
    }



    public int getLautilnahme_ID() {
        return Lautilnahme_ID;
    }

    public void setLautilnahme_ID(int lautilnahme_ID) {
        Lautilnahme_ID = lautilnahme_ID;
    }

    public int getVeranstaltungs_ID() {
        return Veranstaltungs_ID;
    }

    public void setVeranstaltungs_ID(int veranstaltungs_ID) {
        Veranstaltungs_ID = veranstaltungs_ID;
    }

    public Time getZeit() {
        return Zeit;
    }

    public void setZeit(Time zeit) {
        Zeit = zeit;
    }

    public int getPlazierung() {
        return Plazierung;
    }

    public void setPlazierung(int plazierung) {
        Plazierung = plazierung;
    }

    public int getStartnummer() {
        return Startnummer;
    }

    public void setStartnummer(int startnummer) {
        Startnummer = startnummer;
    }
}
