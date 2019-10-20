package com.example.mylistview.model

import com.example.mylistview.R

object BahasaData {
    private val bahasaName = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Rails is a server-side web application development framework written in Ruby language",
        "Python is interpreted scripting and object-oriented programming language",
        "Javascript is an object-based scripting languange",
        "PHP is an Interpreted language , i.e., there is no need for compilation"
    )

    private val bahasaPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.piton,
        R.drawable.java,
        R.drawable.php

    )

    val listBahasa: ArrayList<Bahasa>
        get() {
            val list = arrayListOf<Bahasa>()
            for (position in bahasaName.indices) {
                val food = Bahasa()
                food.name = bahasaName[position]
                food.detail = detail[position]
                food.poster = bahasaPoster[position]
                list.add(food)
            }
            return list
        }
}