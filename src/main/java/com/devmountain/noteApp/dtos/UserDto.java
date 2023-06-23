package com.devmountain.noteApp.dtos;

//The next step we need to do is to create our Data Transfer Objects, or DTO’s.
// As a general rule, it is not a good idea to send your entities outside of the application or within the application context itself because the entities themselves are tied to the Database,
// and changes that can potentially open your application up to vulnerabilities or accidental changes to your data.
// To avoid passing around the Entity object itself, we create lightweight copies of them solely for the purpose of transferring the data stored within the object.

//In the declaration of the class, we need to implement the Serializable interface to allow this class to be converted to a Bytestream and sent outside the application or stored in a log file.

import com.devmountain.noteApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

    private Long id;
    private String username;
    private String password;
    private Set<NoteDto> noteDtoSet = new HashSet<>();

    public UserDto(User user){
        if(user.getId() != null){
            this.id = user.getId();
        }if(user.getUsername() != null){
            this.username = user.getUsername();
        }if(user.getPassword() != null){
            this.password = user.getPassword();
        }
    }

}
