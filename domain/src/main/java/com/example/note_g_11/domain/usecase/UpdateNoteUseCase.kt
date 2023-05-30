package com.example.note_g_11.domain.usecase

import com.example.note_g_11.domain.models.Note
import com.example.note_g_11.domain.repository.NoteRepository
import javax.inject.Inject

class UpdateNoteUseCase @Inject constructor(private val repository: NoteRepository) {
   operator fun invoke(note: Note) = repository.updateNote(note)
}