package com.example.usecasetestapplication.presentation

import androidx.lifecycle.ViewModel
import com.domain.usecases.GetDataUseCase
import com.domain.usecases.SaveDataUseCase
import com.domain.models.GetDataModel
import com.domain.models.SaveDataModel

class MainViewModel(private val getDataUseCase: GetDataUseCase, private val saveDataUseCase: SaveDataUseCase) : ViewModel() {

    fun saveData(saveDataModel: SaveDataModel) : Boolean{
        val result = saveDataUseCase.execute(saveDataModel)
        return result
    }

    fun getData() : GetDataModel {
        val getDataModel = getDataUseCase.execute()
        return getDataModel
    }

}