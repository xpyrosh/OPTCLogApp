package com.example.optclogapp



object UserRepo {

    data class Users (var userName: String, var pLVL: String, var pID: String){
        lateinit var legendsOwned: MutableList<String>

        fun updateNakama(legend: String){
            legendsOwned.add(legend)
        }
    }

    var loggedInUser: Users? = null

    fun init(){
        if (loggedInUser==null) {
            loggedInUser = Users("xpyrosh", "500", "123 453 999")
        }
    }
}