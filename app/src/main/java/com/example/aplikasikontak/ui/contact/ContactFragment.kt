package com.example.aplikasikontak.ui.contact

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.aplikasikontak.EditUser
import com.example.aplikasikontak.R
import kotlinx.android.synthetic.main.fragment_contact.*

class ContactFragment : Fragment() {

    private lateinit var contactViewModel: ContactViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactViewModel =
            ViewModelProviders.of(this).get(ContactViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_contact, container, false)
//        val textView: TextView = root.findViewById(R.id.text_contact)
        contactViewModel.text.observe(this, Observer {
//            textView.text = it
        })
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initEvent()
    }

    private fun initEvent() {
        fabAdd.setOnClickListener {startActivity(Intent(activity!!,EditUser::class.java))}
    }
}