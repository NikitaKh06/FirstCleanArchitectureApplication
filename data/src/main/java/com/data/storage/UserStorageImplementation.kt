package com.data.storage

import android.content.Context

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_FIRST_NAME = "firstName"

class UserStorageImplementation(context: Context) : UserStorageInterface {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun save(userDataModel: UserDataModel): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, userDataModel.name).apply()
        return true
    }

    override fun get(): UserDataModel {
        val name = sharedPreferences.getString(KEY_FIRST_NAME, "") ?: ""
        return UserDataModel(name = name)
    }

}