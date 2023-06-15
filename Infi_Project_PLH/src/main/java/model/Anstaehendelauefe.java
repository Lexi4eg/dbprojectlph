package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Anstaehendelauefe {

    private int Laufveranstaltungen_ID;
    private String  Nameanstaehendelauf;
    private Date  Datum;
    private Time Startzeit;

    public Anstaehendelauefe(int Laufveranstaltungen_ID, String Nameanstaehendelauf, Date Datum, Time Startzeit) {
        this.Laufveranstaltungen_ID = Laufveranstaltungen_ID;
        this.Nameanstaehendelauf = Nameanstaehendelauf;
        this.Datum = Datum;
        this.Startzeit = Startzeit;
    }

    public Anstaehendelauefe(int Laufveranstaltungen_ID, String Nameanstaehendelauf) {
        this.Laufveranstaltungen_ID = Laufveranstaltungen_ID;
        this.Nameanstaehendelauf = Nameanstaehendelauf;

    }

    public int getLaufveranstaltungen_ID() {
        return Laufveranstaltungen_ID;
    }

    public void setLaufveranstaltungen_ID(int laufveranstaltungen_ID) {
        Laufveranstaltungen_ID = laufveranstaltungen_ID;
    }

    public String getNameanstaehendelauf() {
        return Nameanstaehendelauf;
    }

    public void setNameanstaehendelauf(String Nameanstaehendelauf) {
        this.Nameanstaehendelauf = Nameanstaehendelauf;
    }

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date datum) {
        Datum = datum;
    }

    public Time getStartzeit() {
        return Startzeit;
    }

    public void setStartzeit(Time startzeit) {
        Startzeit = startzeit;
    }

    @Override
    public String toString() {
        return "Anstaehendelauefe{" +
                "ID=" + Laufveranstaltungen_ID +
                ", Name='" + Nameanstaehendelauf + '\'' +
                ", Datum=" + Datum +
                ", Zeit=" + Startzeit +
                '}';
    }
}
