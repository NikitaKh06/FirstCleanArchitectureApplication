package com.domain

import com.domain.models.GetDataModel
import com.domain.models.SaveDataModel

interface UserRepository {

    fun saveData(saveDataModel: SaveDataModel) : Boolean

    fun getData() : GetDataModel

}