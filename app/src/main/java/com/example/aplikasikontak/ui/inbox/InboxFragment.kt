package com.example.aplikasikontak.ui.inbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.aplikasikontak.R

class InboxFragment : Fragment() {

    private lateinit var inboxViewModel: InboxViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inboxViewModel =
            ViewModelProviders.of(this).get(InboxViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_inbox, container, false)

        val textView: TextView = root.findViewById(R.id.text_inbox)

        inboxViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}