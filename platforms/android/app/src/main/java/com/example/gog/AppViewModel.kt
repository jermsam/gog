package com.example.gog

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import uniffi.gog_core.Core

data class AppUiState(
  val start: String = ""
)

class AppViewModel : ViewModel() {
    private val core = Core()

    private val _uiState = MutableStateFlow(
        AppUiState(

        )
    )

    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()


    override fun onCleared() {
        super.onCleared()
        // Clean up core resources if needed
    }
}
