package com.data.storage

interface UserStorageInterface {

    fun save(userDataModel: UserDataModel) : Boolean

    fun get() : UserDataModel

}