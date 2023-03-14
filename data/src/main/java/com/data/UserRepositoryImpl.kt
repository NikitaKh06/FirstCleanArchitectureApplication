package com.data

import com.data.storage.UserDataModel
import com.data.storage.UserStorageImplementation
import com.data.storage.UserStorageInterface
import com.domain.UserRepository
import com.domain.models.GetDataModel
import com.domain.models.SaveDataModel

class UserRepositoryImpl(private val userStorageInterface: UserStorageInterface) : UserRepository {

    override fun saveData(saveDataModel: SaveDataModel) : Boolean{
        val user = UserDataModel(name = saveDataModel.text)
        return userStorageInterface.save(user)
    }

    override fun getData() : GetDataModel {
        val user = userStorageInterface.get()
        return GetDataModel(name = user.name)
    }

}