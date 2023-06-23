package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import jakarta.transaction.Transactional;

import java.util.List;

public interface NoteService {
    // for adding notes
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    //deleteing note
    @Transactional
    void deleteNoteById(Long noteId);

    //Updateing note
    @Transactional
    void updateNoteById(NoteDto noteDto);

    //The method for finding all notes by User is a bit more complicated,
    // and it requires you to stream the List<Note> that gets returned from the repository into their NoteDto counterparts to be sent out.
    List<NoteDto> getAllNotesByUserId(Long userId);
}
