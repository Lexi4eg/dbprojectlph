package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBConnector;
import util.DML_DAO;

public class AnmeldungDAO {

    public static ObservableList<Persons> getPersons () {
        ObservableList<Persons> personsList =
                FXCollections.observableArrayList();
        Connection con;

        try {
            con = DBConnector.connect();
            String sql = "SELECT p.* FROM persons p";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                person = new Person(
                        rs.getString("last_name"),
                        rs.getString("first_name"),
                        rs.getBirthyear("BYear"),
                        rs.getString("Gender"),
                ));
                persons.add(Person);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return personsList;
    }

    public static void update(Person actPerson) {
        String sql = "UPDATE persons SET "
                + " first_name  = '" + actPerson.getFirstName() + "'"
                + ", last_name  = '" + actPerson.getLastName() + "'"
                + ", birthyear = " + actPerson.getBYear()
                + ", gender = '" + actPerson.getGender() + "'";
        System.out.println("sql: " + sql);
        DML_DAO.executeDML(sql);