package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBConnector;
import util.DML_DAO;

public class AnmeldungDAO {

        public static ObservableList<Laufer> getLaefer () {
                ObservableList<Laufer> lauferObservableList =
                        FXCollections.observableArrayList();
                Connection con;
                Rangliste an1;

                try {
                        con = DBConnector.connect();
                        ResultSet rs = con.createStatement().executeQuery(sql);
                        System.out.println("con: " + con);
                        String sql = "SELECT * FROM lauefer ";

                        ResultSet rs = con.createStatement().executeQuery(sql);

                        while (rs.next()) {
                                an1 = new Laufer(
                                        rs.getInt("Lauefer_ID"),
                                        rs.getInt("Vorname"),
                                        rs.getTime("Nachname"),
                                );
                                Rangliste.add(an1);
                        }
                } catch (SQLException ex) {
                        System.err.println(ex.getMessage());
                }

                return Rangliste;
        }

        public static void saveLaufer (Lauefer lauefer){
                String sql = "Insert into kunde (Vorname, Nachname) values("
                        + " " + kunde.getVorname() + " , "
                        + " " + kunde.getNachname() + " , ";
                System.out.println("sql: " + sql);
                DML_DAO.executeDML(sql);
        }

}

