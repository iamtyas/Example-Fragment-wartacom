package com.yastyas.wartacom.notification

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
class NotificationFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Berita> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notification, container, false)

        list.addAll(BeritaData.listData)

        recyclerView = root.findViewById(R.id.rv_update)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        val notificationAdapter = NotificationAdapter(list)
        recyclerView.adapter = notificationAdapter

        return root
    }

}
