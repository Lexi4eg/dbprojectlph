package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RagnlisteDAO {
    public static ObservableList<Rangliste> getRangliste () {
        ObservableList<Rangliste> Rangliste =
                FXCollections.observableArrayList();
        Connection con;
        Rangliste an1;

        try {
            con = DBConnector.connect();
            System.out.println("con: " + con);
            String sql = "SELECT Lautilnahme_ID,Veranstaltungs_ID, Zeit, Plazierung, Startnummer  FROM Laufteilnahme ";

            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.println("Test");

            while (rs.next()) {
                an1 = new Rangliste(
                        rs.getInt("Lautilnahme_ID"),
                        rs.getInt("Veranstaltungs_ID"),
                        rs.getTime("Zeit"),
                        rs.getInt("Plazierung"),
                        rs.getInt("Startnummer")
                );
                Rangliste.add(an1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return Rangliste;
    }

}
