package com.example.myapplication;

class Utility {

    fun getQuestion():ArrayList<Questions>{
        var list = ArrayList<Questions>()
        //logic
        var q1 = Questions(1,"What is kotlin?","Scripting Language","Programming Language","Modern Language","Assembly Language",1)
        var q2 = Questions(2,"What is Java?","Scripting Language","Programming Language","Modern Language","Assembly Language",2)
        list.add(q1);
        list.add(q2)

        return list;
    }
}