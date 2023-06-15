package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnstaehendelauefeDAO {

    public static ObservableList<Anstaehendelauefe> getVeranstaltung () {
        ObservableList<Anstaehendelauefe> Anstaehende1 =
                FXCollections.observableArrayList();
        Connection con;
        Anstaehendelauefe an1;

        try {
            con = DBConnector.connect();
            System.out.println("con: " + con);
            String sql = "SELECT Laufveranstaltungen_ID, Name, Datum, Startzeit FROM Laufveranstaltungen";

            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.println("Test");

            while (rs.next()) {
                an1 = new Anstaehendelauefe(
                        rs.getInt("Laufveranstaltungen_ID"),
                        rs.getString("Name"),
                        rs.getDate("Datum"),
                        rs.getTime("Startzeit")
                );
                Anstaehende1.add(an1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return Anstaehende1;
    }
}
