package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Anstaehendelauefe {

    private SimpleIntegerProperty Laufveranstaltungen_ID;
    private SimpleStringProperty  Name;
    private SimpleDateFormat  Datum;
    private SimpleTimeZone Startzeit;

    public Anstaehendelauefe(int Laufveranstaltungen_ID, String Name, Date Datum, Time Startzeit) {
        this.Laufveranstaltungen_ID = new SimpleIntegerProperty(Laufveranstaltungen_ID);
        this.Name = new SimpleStringProperty(Name);
    }

    public Anstaehendelauefe(int Laufveranstaltungen_ID, String Name) {
        this.Laufveranstaltungen_ID = new SimpleIntegerProperty(Laufveranstaltungen_ID);
        this.Name = new SimpleStringProperty(Name);
    }

    public SimpleIntegerProperty getID() {
        return Laufveranstaltungen_ID;
    }

    public void setID(SimpleIntegerProperty Laufveranstaltungen_ID) {
        this.Laufveranstaltungen_ID = Laufveranstaltungen_ID;
    }

    public SimpleStringProperty getName() {
        return Name;
    }

    public void setName(SimpleStringProperty name) {
        Name = name;
    }



    @Override
    public String toString() {
        return "Anstaehendelauefe{" +
                "ID=" + Laufveranstaltungen_ID +
                ", Name='" + Name + '\'' +
                ", Datum=" + Datum +
                ", Zeit=" + Startzeit +
                '}';
    }
}
