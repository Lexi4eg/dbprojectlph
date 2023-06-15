public class Anmeldung{
    private String firstname;
    private String lastname;
    private date Birthdate;
    private String gender;


    public Anmeldung (String firstname, String lastname, date Birthdate, String gender){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(date birthdate) {
        Birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}