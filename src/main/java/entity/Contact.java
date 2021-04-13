package entity;

public class Contact {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String fullname;

    public Contact(String name, String surname, String email, String phone, String fullname) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.fullname = name+" "+surname;

    }

    public String getFullname() {
        this.fullname = name+" "+surname;
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
