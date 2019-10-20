package com.example.mylistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mylistview.model.Bahasa
import com.example.mylistview.model.BahasaData

class MainActivity : AppCompatActivity() {

    private lateinit var rvBahasa: RecyclerView
    private var list: ArrayList<Bahasa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasa = findViewById(R.id.rv_bahasa)
        rvBahasa.setHasFixedSize(true)
        list.addAll(BahasaData.listBahasa)
        showFoodlist()

    }

    private fun showFoodlist() {
        rvBahasa.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListBahasaAdapter(list)
        rvBahasa.adapter = listFoodAdapter
    }
}
