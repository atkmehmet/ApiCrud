package com.example.apicrud.repensatation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apicrud.model.Repository.ILoginRepository
import com.example.apicrud.remote.models.AuthDto
import com.example.apicrud.remote.models.Login
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ApiViewModel @Inject constructor(
    private val repository: ILoginRepository
) :ViewModel() {

    var dto by mutableStateOf(AuthDto.EMPTY)

    init {
        viewModelScope.launch {
            dto =      repository.getAccessToken(
                Login(
                    username = "emilys",
                    password = "emilyspass"
                )
            )
        }

    }
}