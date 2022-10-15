package com.example.layouting.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.layouting.SHARED_PREF_MAJOR
import com.example.layouting.SHARED_PREF_NAME
import com.example.layouting.SHARED_PREF_SEMESTER
import com.example.layouting.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val name = sharedPref.getString(SHARED_PREF_NAME, "Data Kosong")
        val major = sharedPref.getString(SHARED_PREF_MAJOR, "Data Kosong")
        val semester = sharedPref.getString(SHARED_PREF_SEMESTER, "Data Kosong")

        with(binding){
            tvName.text = name
            tvMajor.text = major
            tvSemester.text = semester
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}