package model;

public class laeufer {
    int Lauefer_ID;
    static String vorname;
    static String nachname;
    static String adresse;

    public laeufer(int Lauefer_ID, String vorname, String nachname, String adresse) {
        this.Lauefer_ID = Lauefer_ID;
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
    public static String getVorname() {
        return vorname;
    }

    public int getLauefer_ID() {
        return Lauefer_ID;
    }

    public void setLauefer_ID(int lauefer_ID) {
        Lauefer_ID = lauefer_ID;
    }

    @Override
    public String toString() {
        return "laeufer{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public static String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public static String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
