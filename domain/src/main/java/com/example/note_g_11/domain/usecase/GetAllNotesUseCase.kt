package com.example.note_g_11.domain.usecase

import com.example.note_g_11.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val repository: NoteRepository) {
    operator fun invoke() = repository.getAllNotes()
}