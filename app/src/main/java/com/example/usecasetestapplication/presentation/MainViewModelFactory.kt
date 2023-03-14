package com.example.usecasetestapplication.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.Factory
import com.data.UserRepositoryImpl
import com.data.storage.UserStorageImplementation
import com.domain.usecases.GetDataUseCase
import com.domain.usecases.SaveDataUseCase

class MainViewModelFactory(context: Context) : ViewModelProvider.Factory{

    private val userRepositoryImpl by lazy {
        UserRepositoryImpl(
            UserStorageImplementation(
                context = context
            )
        )
    }
    private val getDataUseCase by lazy {
        GetDataUseCase(
            userRepositoryImpl
        )
    }
    private val saveDataUseCase by lazy {
        SaveDataUseCase(
            userRepositoryImpl
        )
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(getDataUseCase = getDataUseCase, saveDataUseCase = saveDataUseCase) as T
    }

}