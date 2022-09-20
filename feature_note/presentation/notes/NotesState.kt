package com.example.journal.feature_note.presentation.notes

import com.example.journal.feature_note.domain.model.Note
import com.example.journal.feature_note.domain.use_case.util.NoteOrder
import com.example.journal.feature_note.domain.use_case.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
