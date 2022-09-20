package com.example.journal.feature_note.presentation.notes

import com.example.journal.feature_note.domain.model.Note
import com.example.journal.feature_note.domain.use_case.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note:Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object  ToggleOrderSection: NotesEvent()
}
