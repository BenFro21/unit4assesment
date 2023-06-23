package com.devmountain.noteApp.dtos;

//The next step we need to do is to create our Data Transfer Objects, or DTO’s.
// As a general rule, it is not a good idea to send your entities outside of the application or within the application context itself because the entities themselves are tied to the Database,
// and changes that can potentially open your application up to vulnerabilities or accidental changes to your data.
// To avoid passing around the Entity object itself, we create lightweight copies of them solely for the purpose of transferring the data stored within the object.

import com.devmountain.noteApp.entities.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto {

    private Long id;
    private String body;
    private UserDto userDto;

    public NoteDto(Note note){
        if(note.getId() != null){
            this.id = note.getId();
        }if(note.getBody() != null){
            this.body = note.getBody();
        }
    }
}
