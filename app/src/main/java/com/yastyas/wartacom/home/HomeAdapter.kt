package com.yastyas.wartacom.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yastyas.wartacom.R
import com.yastyas.wartacom.modeldata.Berita

class HomeAdapter(val listBerita: ArrayList<Berita>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){

//    private lateinit var mContext: Context
//    private var listBerita: ArrayList<Berita> = arrayListOf()

//    final fun HomeAdapter(ArrayList<Berita> list){
//        this.mContext = mContext;
//        this.listBerita = list
//    }

    inner class HomeViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvJudul: TextView = itemView.findViewById(R.id.tv_judul)
        var tvRingkasan: TextView = itemView.findViewById(R.id.tv_ringkasan)
        var tvSrc: TextView = itemView.findViewById(R.id.tv_src)
        var imgFoto: ImageView = itemView.findViewById(R.id.iv_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_home, parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val berita = listBerita[position]
        Glide.with(holder.itemView.context)
            .load(berita.img)
            .apply(RequestOptions().override(200,100))
            .into(holder.imgFoto)
        holder.tvJudul.text = berita.judul
        holder.tvRingkasan.text = berita.ringkasan
        holder.tvSrc.text = berita.src
    }

}