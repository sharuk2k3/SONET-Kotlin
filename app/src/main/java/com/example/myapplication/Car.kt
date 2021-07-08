package com.example.myapplication

class Car: Vehicle {
    override var name: String="Ford"
    override var mediumofTravel:String="Land"
    override var wheels: Int=4

    override fun display(){
        println("The $name has $wheels and runs on $mediumofTravel")
    }
    fun m1(){
        println("hello")
    }
}