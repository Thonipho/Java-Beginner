/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author User
 */
public class student {
    private String name;
    private String surname;
    private String email;
    private long contact;
    private long id;

    public student(String name, String surname, String email, long contact, long id) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.contact = contact;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public long getContact() {
        return contact;
    }

    public long getId() {
        return id;
    }
    
}
