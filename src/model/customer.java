package model;

public class customer {
    private int ID;
    private String name;
    private String pass;
    private String mail;
    private String country;

    public customer(){

    }
    public customer(String name, String pass, String mail, String country){
        this. name = name;
        this.pass = pass;
        this.mail = mail;
        this.country = country;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMail() {
        return mail;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + pass + " " + mail + " " + country;
    }
}
