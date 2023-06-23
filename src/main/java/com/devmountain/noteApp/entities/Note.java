package com.devmountain.noteApp.entities;


import com.devmountain.noteApp.dtos.NoteDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notes")
@Data // add this and the next two lines to DI getters, setters, constructors
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String body;

//    @ManyToOne creates the association within Hibernate
//    @JsonBackReference prevents infinite recursion when you deliver the resource up as JSON through the RESTful API endpoint you will create
    @ManyToOne
    @JsonBackReference
    private User user;

    public Note(NoteDto noteDto){
        if(noteDto.getBody() != null){
            this.body = noteDto.getBody();
        }
    }

}
