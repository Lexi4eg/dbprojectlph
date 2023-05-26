package model;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private int dpGebd;
    private String geschlecht;
    
    public Person(int id, String lastName, String firstName, int dpGebd) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dpGebd = dpGebd;
       
        
    }

    public Person(int id, String lastName, String firstName, int dpGebd,String geschlecht) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dpGebd = dpGebd;
        this.geschlecht = geschlecht;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getdpGebd() {
        return dpGebd;
    }

    public void setdpGebd (int dgGebd) {
        this.dpGebd = dpGebd;
    }

    @Override
    public String toString() {
        return lastName + " "+ firstName + " "+ dpGebd;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
    

    
}
