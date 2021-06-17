package com.example.myapplication

interface Vehicle {
    var name: String
    var mediumofTravel:String
    open var wheels:Int
    fun display()
}