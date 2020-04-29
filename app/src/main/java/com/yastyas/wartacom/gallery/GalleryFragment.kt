package com.yastyas.wartacom.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yastyas.wartacom.R
import com.yastyas.wartacom.modeldata.Berita
import com.yastyas.wartacom.modeldata.BeritaData

class GalleryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Berita> = arrayListOf()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)

        list.addAll(BeritaData.listData)

        recyclerView = root.findViewById(R.id.rv_gallery)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = GridLayoutManager(activity, 2)
        val galleryAdapter = GalleryAdapter(list)
        recyclerView.adapter = galleryAdapter

        return root
    }

}
