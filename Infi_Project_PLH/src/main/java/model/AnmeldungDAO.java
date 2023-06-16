package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBConnector;
import util.DML_DAO;

public class AnmeldungDAO {

        public static ObservableList<Laeufer> getLaeufer () {
                ObservableList<Laeufer> laeuferList =
                        FXCollections.observableArrayList();
                Connection con;
                Rangliste an1;

                try {
                        con = DBConnector.connect();
                        System.out.println("con: " + con);
                        String sql = "SELECT * FROM lauefer ";


                        ResultSet rs = con.createStatement().executeQuery(sql);

                        while (rs.next()) {
                                an1 = new Laeufer(
                                        rs.getInt("Lauefer_ID"),
                                        rs.getString("Vorname"),
                                        rs.getString("Nachname"),
                                        rs.getString("Adresse")
                                );
                                Rangliste.add(an1);
                        }
                } catch (SQLException ex) {
                        System.err.println(ex.getMessage());
                }

                return Laeufer;
        }

        public static void saveLaufer (Laeufer laeufer){
                String sql = "Insert into kunde (Vorname, Nachname) values("
                        + " " + laeufer.getVorname() + " , "
                        + " " + laeufer.getNachname() + " , "
                        + " " + laeufer.getAdresse() + " , ";
                System.out.println("sql: " + sql);
                DML_DAO.executeDML(sql);
        }

}

