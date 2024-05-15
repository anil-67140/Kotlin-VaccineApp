package com.deora.kvaccineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.reyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
        //data source
        var vaccineList :ArrayList<VaccineModel> = ArrayList()
        val v1=VaccineModel("COVID-19",R.drawable.cube)
        val v2=VaccineModel("HEPATITS_B",R.drawable.cube)
        val v3=VaccineModel("Tatanus Vaccine",R.drawable.cube)
        val v4=VaccineModel("Pneumococal",R.drawable.cube)
        val v5=VaccineModel("Rotavirus-vaccine",R.drawable.cube)
        val v6=VaccineModel("Meadels -vaccine",R.drawable.cube)
        val v7=VaccineModel("Chickenpox -Vaccine",R.drawable.cube)
        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)
        val adapter=MyAdapter(vaccineList)
        recyclerView.adapter=adapter


    }
}