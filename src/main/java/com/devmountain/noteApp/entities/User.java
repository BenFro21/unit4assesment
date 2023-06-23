package com.devmountain.noteApp.entities;


import jakarta.persistence.*;

// anotate with entity and what table you want to enter the data into
@Entity
@Table(name = " Users")
public class User {

    // anotate with @id and @GeneratedValue to set up a unique id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // anotate with the colum so it knows what colum to add to, unique makes it so you cant add the same username twice
    @Column(unique = true)
    private String username;

    @Column
    private String password;

    //Constructors create Objects inside of Java, and you can overload constructors to be able to handle multiple different scenarios when creating an object,
    // the most common scenarios include a No Argument constructor, and an All Argument constructor.

    // no argument constructor
    public User() {
    }

    // all argument constructor
    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //Private member variables are only accessible within the class they reside in, so for us to be able to get these values or set these values,
    // we need to generate getters and setters for each field. Generate the getters and setters for each field by pressing Alt+Insert and selecting Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
