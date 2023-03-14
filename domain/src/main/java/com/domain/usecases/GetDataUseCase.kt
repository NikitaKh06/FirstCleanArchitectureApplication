package com.domain.usecases


import com.domain.UserRepository
import com.domain.models.GetDataModel

class GetDataUseCase(private val userRepository: UserRepository) {

    fun execute() : GetDataModel {
        return userRepository.getData()
    }

}