package com.example.atilhocakriptoapp.Adapter

import android.graphics.Color
import android.location.GnssAntennaInfo.Listener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atilhocakriptoapp.Model.CyrptoModel
import com.example.atilhocakriptoapp.R
import com.example.atilhocakriptoapp.databinding.ActivityMainBinding
import com.example.atilhocakriptoapp.databinding.RowLayoutBinding


class RecyclerViewAdapter(private val cryptoList: ArrayList<CyrptoModel>,private val listener:Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {
interface Lİstener{
    fun onItemClick(  cryptoModel: CyrptoModel)
}
private val colors:Array<String> = arrayOf("#f2d2a9","#b3c9f4","#d5d5d5","#3725a4","#ba4d05","#5a5a5a","#1975b5","#6e042c","#6d7e86")
      class RowHolder (view:View):RecyclerView.ViewHolder(view) {
          lateinit var binding: RowLayoutBinding


fun bind(cryptoModel: CyrptoModel,colors:Array<String>,position: Int,listener: Listener){
    itemView.setOnClickListener{
        binding.textidName.onIt
    }
    binding.textidName.text=cryptoModel.currency
    binding.textidPrice.text=cryptoModel.price
    itemView.setBackgroundColor(Color.parseColor(colors[position%8]))
}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }

    override fun getItemCount(): Int {
return cryptoList.count()
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {

    }
}