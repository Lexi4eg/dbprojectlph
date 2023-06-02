package model;

import java.sql.Time;
import java.util.Date;

public class Anstaehendelauefe {

        int Laufveranstaltungen_ID;
        String Name;
        Date Datum;

        Time Startzeit;

    public Anstaehendelauefe(int Laufveranstaltungen_ID, String name, Date datum, Time Startzeit) {
        this.Laufveranstaltungen_ID = Laufveranstaltungen_ID;
        Name = name;
        Datum = datum;
        Startzeit = Startzeit;
    }

    public Anstaehendelauefe(int Laufveranstaltungen_ID, String name) {
        this.Laufveranstaltungen_ID = Laufveranstaltungen_ID;
        this.Name = name;
    }

    public int getID() {
        return Laufveranstaltungen_ID;
    }

    public void setID(int Laufveranstaltungen_ID) {
        this.Laufveranstaltungen_ID = Laufveranstaltungen_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date datum) {
        Datum = datum;
    }

    public Time getZeit() {
        return Startzeit;
    }

    public void setZeit(Time startzeit) {
        Startzeit = startzeit;
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
