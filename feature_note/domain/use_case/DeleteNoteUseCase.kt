package com.example.journal.feature_note.domain.use_case

import com.example.journal.feature_note.data.repository.NoteRepository
import com.example.journal.feature_note.domain.model.Note

class DeleteNoteUseCase (
    private val repository: NoteRepository
        ) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}