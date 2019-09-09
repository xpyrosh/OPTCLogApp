package com.example.optclogapp



object UserRepo {

    data class Users (var userName: String, var pLVL: String, var pID: String){
        var legendsOwned: MutableList<String> = arrayListOf()

        fun updateNakama(legend: String){
            if (legend !in legendsOwned) {
                legendsOwned.add(legend)
            }
        }
        fun removeNakama(legend: String){
            if (legend in legendsOwned) {
                legendsOwned.remove(legend)
            }
        }
    }

    var loggedInUser: Users? = null

    fun init(){
        if (loggedInUser==null) {
            loggedInUser = Users("xpyrosh", "500", "123 453 999")
        }
    }
}