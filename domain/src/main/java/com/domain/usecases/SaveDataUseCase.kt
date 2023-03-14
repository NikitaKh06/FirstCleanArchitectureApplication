package com.domain.usecases

import com.domain.UserRepository
import com.domain.models.SaveDataModel

class SaveDataUseCase(private val userRepository: UserRepository) {

    fun execute(saveDataModel: SaveDataModel) : Boolean {
        return userRepository.saveData(saveDataModel)
    }

}