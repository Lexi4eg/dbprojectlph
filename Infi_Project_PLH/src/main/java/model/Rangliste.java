package model;

import java.util.Date;

public class Rangliste {

    int Lautilnahme_ID;
    int Veranstaltungs_ID;
    Date Zeit;
    int Plazierung;
    int Startnummer;

    public Rangliste(int lautilnahme_ID, int veranstaltungs_ID, Date zeit, int plazierung, int startnummer) {
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

    public Date getZeit() {
        return Zeit;
    }

    public void setZeit(Date zeit) {
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

    @Override
    public String toString() {
        return "Rangliste{" +
                "Lautilnahme_ID=" + Lautilnahme_ID +
                ", Veranstaltungs_ID=" + Veranstaltungs_ID +
                ", Zeit=" + Zeit +
                ", Plazierung=" + Plazierung +
                ", Startnummer=" + Startnummer +
                '}';
    }
}
