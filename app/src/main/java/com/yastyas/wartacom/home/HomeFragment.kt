package com.yastyas.wartacom.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yastyas.wartacom.R
import com.yastyas.wartacom.modeldata.Berita
import com.yastyas.wartacom.modeldata.BeritaData

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    private val list: ArrayList<Berita> = arrayListOf()
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
//        list.addAll(BeritaData.listData)
        recyclerView = view.findViewById(R.id.rv_home)
        recyclerView.setHasFixedSize(true)
        showData()
        return view
    }

    private fun showData() {
        homeAdapter = HomeAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = homeAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = ArrayList<Berita>()
        list.add(Berita("Berita Judul","Ringkasan", "detik.com", R.drawable.img1))
        list.add(Berita("Berita Judul","Ringkasan", "detik.com", R.drawable.img1))
        list.add(Berita("Berita Judul","Ringkasan", "detik.com", R.drawable.img1))
        list.add(Berita("Berita Judul","Ringkasan", "detik.com", R.drawable.img1))
        list.add(Berita("Berita Judul","Ringkasan", "detik.com", R.drawable.img1))
        list.add(Berita("Berita Judul","Ringkasan", "detik.com", R.drawable.img1))
    }

}
